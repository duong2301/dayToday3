package pojobeans;

public interface AccountServices {
    void transferMoney(long fromAccountId, long toAccountId,double amount);
    void depositMoney (long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
