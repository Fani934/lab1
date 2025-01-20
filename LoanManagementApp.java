package Lab14;
public class LoanManagementApp {
    public static void main(String[] args) {
        LoanManagementSystem<Double> loanSystem = new LoanManagementSystem<>();

        // Create mutable loans
        Loan<Double> loan1 = new MutableLoan<>(10000.0, "Farhan Mehmood");
        Loan<Double> loan2 = new ImmutableLoan<>(5000.0, "Abdullah Khan");

        // Add loans to the loan management system
        loanSystem.addLoan(loan1);
        loanSystem.addLoan(loan2);

        // Print total loan amount
        System.out.println("Total Loan Amount: " + loanSystem.calculateTotalLoanAmount());

        // Display loan details
        for (Loan<Double> loan : loanSystem.getLoans()) {
            System.out.println(loan);
        }

        // Attempting to modify an immutable loan
        try {
            // Casting ImmutableLoan to MutableLoan to simulate modification (this will fail)
            ((MutableLoan<Double>) loan2).setLoanAmount(8000.0);
        } catch (ClassCastException e) {
            System.out.println("Error: Cannot modify immutable loan.");
        }
    }
}
