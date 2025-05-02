package Service;

import Class.Account;
import Exception.*;
import Class.Account;

import java.math.BigDecimal;

public class AccountService {

    public String getBalance(Account account) {
        return account.getBalance()+" MXN";
    }

    public String getWithdrawLimit(Account account) {
        return account.getDrawalLimit()+" MXN";
    }
    public Boolean validWithdrawalAmount(Account account, double withdrawAmount) throws AmountNegativeException, DailyLimitExceededException, InsufficientBalanceException{
        BigDecimal amount = new BigDecimal(withdrawAmount);
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new AmountNegativeException("Amount cannot be negative");
        }

        if (withdrawAmount > account.getDrawalLimit()){
            throw new DailyLimitExceededException("Daily limit exceeded");
        }

        if (withdrawAmount > account.getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        account.setBalance(account.getBalance() - withdrawAmount);
        return true;
    }
}
