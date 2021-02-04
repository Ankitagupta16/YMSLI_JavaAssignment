package SolidPrinciple.LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    @Override
	public void deposit(BigDecimal amount) {
        System.out.println("Deposit into FixedTermDepositAccount account");
    }

    @Override
	protected void withdraw(BigDecimal amount) {
		throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
	}
}