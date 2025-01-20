package Lab14;
//Mutable Loan Class
public class MutableLoan<T> extends Loan<T> {

 public MutableLoan(T loanAmount, String borrowerName) {
     super(loanAmount, borrowerName);
 }

 // Setter for loanAmount
 public void setLoanAmount(T loanAmount) {
     this.loanAmount = loanAmount;
 }

 // Setter for borrowerName
 public void setBorrowerName(String borrowerName) {
     this.borrowerName = borrowerName;
 }
}
