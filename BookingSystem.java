import java.util.Date;

interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

public class BookingSystem implements CommonFunctions {
    private char customerId;
    private char customerName;
    private char customerAddress;
    private int customerPhoneNo;
    private int customerAge;
    private int agentId;
    private char agentName;
    private float refundAmount;
    private char refundCustomerId;
    private char ticketSource;
    private char ticketDestination;
    private Date ticketDateOfJourney;
    private String ticketTime;
    private char ticketBusNo;
    private char ticketSeatNo;

    public BookingSystem(char customerId, char customerName, char customerAddress, int customerPhoneNo, int customerAge, int agentId, char agentName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNo = customerPhoneNo;
        this.customerAge = customerAge;
        this.agentId = agentId;
        this.agentName = agentName;
    }

    public void addCustomerDetails() {
        System.out.println("Adding customer details...");
    }

    public void modifyCustomerDetails() {
        System.out.println("Modifying customer details...");
    }

    public void searchTicket() {
        System.out.println("Searching for tickets...");
    }

    public void bookTicket() {
        System.out.println("Booking ticket...");
    }

    public void cancelTicket() {
        System.out.println("Cancelling ticket...");
    }

    public void makePayment() {
        System.out.println("Making payment...");
    }

    public void fillDetails() {
        System.out.println("Filling details...");
    }

    public void processRefund(float amount, char customerId) {
        this.refundAmount = amount;
        this.refundCustomerId = customerId;
        System.out.println("Processing refund for customer ID: " + customerId + ", Amount: " + amount);
    }

    public void setTicketDetails(char source, char destination, Date dateOfJourney, String time, char busNo, char seatNo) {
        this.ticketSource = source;
        this.ticketDestination = destination;
        this.ticketDateOfJourney = dateOfJourney;
        this.ticketTime = time;
        this.ticketBusNo = busNo;
        this.ticketSeatNo = seatNo;
        System.out.println("Setting ticket details: Source - " + source + ", Destination - " + destination);
    }

    public static void main(String[] args) {
        BookingSystem system = new BookingSystem('C', 'J', 'A', 1234567890, 30, 1, 'B');
        system.addCustomerDetails();
        system.modifyCustomerDetails();
        system.searchTicket();
        system.bookTicket();
        system.cancelTicket();
        system.makePayment();
        system.fillDetails();
        system.processRefund(100.0f, 'C');
        system.setTicketDetails('X', 'Y', new Date(), "10:00 AM", 'B', 'A');
    }
}
