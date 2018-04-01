package in.cucumber.nicebank;

public interface Teller {
    void withdraw(Account account, Money amount) throws Exception;
}
