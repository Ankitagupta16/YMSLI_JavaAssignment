package SolidPrinciple.InterfaceSegregationPrinciple;

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