package com.Lab7;
public class AirlineManagementSystem {

    // Flight class to manage seat availability and booking
    static class Flight {
        private int availableSeats;

        public Flight(int availableSeats) {
            this.availableSeats = availableSeats;
        }

        // Synchronized method to book a seat. Only one thread can book a seat at a time.
        public synchronized boolean bookSeat(String passengerName) {
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println(passengerName + " successfully booked a seat. Remaining seats: " + availableSeats);
                return true;
            } else {
                System.out.println(passengerName + " failed to book a seat. No seats available.");
                return false;
            }
        }

        public synchronized int getAvailableSeats() {
            return availableSeats;
        }
    }

    // Booking class simulates a passenger attempting to book a seat
    static class Booking extends Thread {
        private String passengerName;
        private Flight flight;

        public Booking(String passengerName, Flight flight) {
            this.passengerName = passengerName;
            this.flight = flight;
        }

        @Override
        public void run() {
            // Try to book a seat
            if (!flight.bookSeat(passengerName)) {
                System.out.println(passengerName + " could not complete the booking.");
            }
        }
    }

    public static void main(String[] args) {
        // Create a flight with 5 available seats
        Flight flight = new Flight(5);

        // Simulate multiple passengers trying to book a seat
        Booking passenger1 = new Booking("Passenger 1", flight);
        Booking passenger2 = new Booking("Passenger 2", flight);
        Booking passenger3 = new Booking("Passenger 3", flight);
        Booking passenger4 = new Booking("Passenger 4", flight);
        Booking passenger5 = new Booking("Passenger 5", flight);
        Booking passenger6 = new Booking("Passenger 6", flight);  // This passenger will fail to book

        // Start the booking process concurrently
        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();
        passenger5.start();
        passenger6.start();

        try {
            // Wait for all threads to finish
            passenger1.join();
            passenger2.join();
            passenger3.join();
            passenger4.join();
            passenger5.join();
            passenger6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final status
        System.out.println("Booking process completed. Remaining seats: " + flight.getAvailableSeats());
    }
}
