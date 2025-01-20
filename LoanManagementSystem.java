package Lab14;
import java.util.ArrayList;
import java.util.List;

// Loan Management System ADT
public class LoanManagementSystem<T> {
    private List<Loan<T>> loans = new ArrayList<>();

    // Method to add loan to the collection
    public void addLoan(Loan<T> loan) {
        loans.add(loan);
    }

    // Method to get the loan details
    public List<Loan<T>> getLoans() {
        return loans;
    }

    // Method to calculate the total loan amount
    public double calculateTotalLoanAmount() {
        double totalAmount = 0;
        for (Loan<T> loan : loans) {
            if (loan.getLoanAmount() instanceof Double) {
                totalAmount += (Double) loan.getLoanAmount();
            } else if (loan.getLoanAmount() instanceof Integer) {
                totalAmount += (Integer) loan.getLoanAmount();
            }
        }
        return totalAmount;
    }
}
