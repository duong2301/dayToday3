package annotationbasedconfiguration;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pojobeans.Account;
import pojobeans.AccountServices;
import pojobeans.AccountRepository;
import java.util.HashMap;
import java.util.Map;
@Repository
public class AccountServices2Imp1 implements AccountServices{
    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account account = accountRepository.find(fromAccountId);
        Account account1 = accountRepository.find(toAccountId);
        account.setBalance(account.getBalance()-amount);
        account1.setBalance(account1.getBalance()+amount);
        accountRepository.update(account);
        accountRepository.update(account1);


    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
