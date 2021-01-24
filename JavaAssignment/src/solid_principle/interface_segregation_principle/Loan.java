package SolidPrinciple.InterfaceSegregationPrinciple;

public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}
