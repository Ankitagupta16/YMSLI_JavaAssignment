package solid_principle.liskov_substitution_principle;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    @Override    
    public void deposit(BigDecimal amount) {
    	System.out.println(" Deposit into SavingsAccount");
    }

    @Override
    public void withdraw(BigDecimal amount) {
    	System.out.println(" Withdraw from SavingsAccount");
    }
}