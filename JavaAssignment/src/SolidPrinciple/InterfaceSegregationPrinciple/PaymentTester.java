package SolidPrinciple.InterfaceSegregationPrinciple;

public class PaymentTester {
	public static void main(String[] args) {
		Payment payment = new BankPayment();
		
		payment.intiateLoanSettlement();
	}
}
