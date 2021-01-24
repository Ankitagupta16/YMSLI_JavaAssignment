package solid_principle.interface_segregation_principle;

import java.util.List;

public interface Payment {
    
    Object status();
    List<Object> getPayments();
    
    //Bank related method
    void initiatePayments();
    
    
    //Loan related methods
    void intiateLoanSettlement();
    void initiateRePayment();
    
}