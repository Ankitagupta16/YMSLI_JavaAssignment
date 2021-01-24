package solid_principle.liskov_substitution_principle;
import java.math.BigDecimal;

public class AccountTester {
	
	public static void main(String[] args) {
		
	Account myFixedTermDepositAccount = new FixedTermDepositAccount();
	myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));

	BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(myFixedTermDepositAccount);
	withdrawalService.withdraw(new BigDecimal(100.00));
	}
}
