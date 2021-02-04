package solid_principle.liskov_substitution_principle;

import java.math.BigDecimal;

public abstract class Account {
	

    public abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);

}
