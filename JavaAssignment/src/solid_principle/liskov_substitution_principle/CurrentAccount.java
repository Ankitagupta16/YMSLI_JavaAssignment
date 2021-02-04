package solid_principle.liskov_substitution_principle;

import java.math.BigDecimal;

public class CurrentAccount extends Account {
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println(" Deposit into CurrentAccount");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
    	System.out.println(" Withdraw from CurrentAccount");
    }
}
