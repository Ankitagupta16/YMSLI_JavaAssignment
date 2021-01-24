package solid_principle.liskov_substitution_principle;

import java.math.BigDecimal;

public abstract class Account {
	

    protected abstract void deposit(BigDecimal amount);

    public abstract void withdraw(BigDecimal amount);

}
