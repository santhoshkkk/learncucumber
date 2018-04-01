package in.cucumber.nicebank;

public class AutomatedTeller implements Teller {
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }



    @Override
    public void withdraw(Account account, Money amount) throws Exception{
        account.debit(amount);
        cashSlot.dispense(amount);
    }
}
