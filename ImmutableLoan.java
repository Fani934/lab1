package Lab14;
//Immutable Loan Class
public final class ImmutableLoan<T> extends Loan<T> {

 public ImmutableLoan(T loanAmount, String borrowerName) {
     super(loanAmount, borrowerName);
 }

 // No setters, making this class immutable
}
