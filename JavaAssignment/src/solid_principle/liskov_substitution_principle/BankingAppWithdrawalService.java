package SolidPrinciple.LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private Account account;

    public BankingAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
    
    
}





/*
private WithdrawableAccount withdrawableAccount;
 

public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
    this.withdrawableAccount = withdrawableAccount;
}

public void withdraw(BigDecimal amount) {
    withdrawableAccount.withdraw(amount);
}
*/