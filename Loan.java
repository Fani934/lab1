package Lab14;
/// Generic Loan Class
public class Loan<T> {
    protected T loanAmount;
    protected String borrowerName;

    public Loan(T loanAmount, String borrowerName) {
        this.loanAmount = loanAmount;
        this.borrowerName = borrowerName;
    }

    public T getLoanAmount() {
        return loanAmount;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public String toString() {
        return "Loan Amount: " + loanAmount + ", Borrower: " + borrowerName;
    }
}
