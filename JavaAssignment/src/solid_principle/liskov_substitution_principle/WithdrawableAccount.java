package solid_principle.liskov_substitution_principle;
import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {
	  public abstract void withdraw(BigDecimal amount);
}
