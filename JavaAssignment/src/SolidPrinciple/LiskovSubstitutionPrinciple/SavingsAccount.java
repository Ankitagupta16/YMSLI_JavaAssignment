package SolidPrinciple.LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    @Override    
    public void deposit(BigDecimal amount) {
    	System.out.println(" Deposit into SavingsAccount");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
    	System.out.println(" Withdraw from SavingsAccount");
    }
}