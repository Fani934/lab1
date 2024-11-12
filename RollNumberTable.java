class RollNumberTable extends Thread {
    @Override
    public void run() {
        System.out.println("Roll No Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2022-SE-095 * " + i + " = " + (2019 * i));
            try {
                Thread.sleep(500); // delay for readability
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DateOfBirthTable extends Thread {
    @Override
    public void run() {
        System.out.println("Date of Birth Table:");
        String dob = "08-August";
        for (int i = 1; i <= 10; i++) {
            System.out.println(dob + " * " + i + " = " + dob + i);
            try {
                Thread.sleep(500); // delay for readability
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

