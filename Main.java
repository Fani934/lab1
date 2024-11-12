public class Main {
    public static void main(String[] args) {
        RollNumberTable rollNumberTable = new RollNumberTable();
        DateOfBirthTable dateOfBirthTable = new DateOfBirthTable();
        
        rollNumberTable.start();
        try {
            rollNumberTable.join();  // Wait for RollNumberTable to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        dateOfBirthTable.start();
    }
}
