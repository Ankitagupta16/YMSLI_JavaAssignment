package SolidPrinciple.LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public abstract class Account {
	

    public abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);

}
