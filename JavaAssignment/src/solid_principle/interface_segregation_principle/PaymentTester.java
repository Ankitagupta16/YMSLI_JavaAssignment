package solid_principle.interface_segregation_principle;

public class PaymentTester {
	public static void main(String[] args) {
		Payment payment = new BankPayment();
		
		payment.intiateLoanSettlement();
	}
}
