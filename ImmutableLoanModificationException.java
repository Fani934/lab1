package Lab14;
//Custom Exception for Immutable Loan modification attempt
class ImmutableLoanModificationException extends Exception {
 public ImmutableLoanModificationException(String message) {
     super(message);
 }
}
