package solid_principle.interface_segregation_principle;

public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}
