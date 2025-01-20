package Lab14;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanManagementSystemTest {

    @Test
    public void testAddLoan() {
        LoanManagementSystem<Double> loanSystem = new LoanManagementSystem<>();
        Loan<Double> loan1 = new MutableLoan<>(10000.0, "John Doe");
        loanSystem.addLoan(loan1);
        assertEquals(1, loanSystem.getLoans().size());
    }

    @Test
    public void testCalculateTotalLoanAmount() {
        LoanManagementSystem<Double> loanSystem = new LoanManagementSystem<>();
        Loan<Double> loan1 = new MutableLoan<>(10000.0, "John Doe");
        Loan<Double> loan2 = new MutableLoan<>(5000.0, "Jane Smith");
        loanSystem.addLoan(loan1);
        loanSystem.addLoan(loan2);
        aassertEquals(15000.0, loanSystem.calculateTotalLoanAmount(), 0.001); // delta is 0.001
    }

    private void aassertEquals(double d, double calculateTotalLoanAmount, double e) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testImmutableLoanModification() {
        Loan<Double> immutableLoan = new ImmutableLoan<>(5000.0, "Sam");
        assertThrows(ClassCastException.class, () -> {
            ((MutableLoan<Double>) immutableLoan).setLoanAmount(10000.0);
        });
    }

    @Test
    public void testLoanDetails() {
        Loan<Double> loan = new MutableLoan<>(20000.0, "Robert");
        assertEquals("Loan Amount: 20000.0, Borrower: Robert", loan.toString());
    }
}