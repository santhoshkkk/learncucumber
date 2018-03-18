package in.cucumber.nicebank;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public void withdraw(Account account, Money amount){
        cashSlot.dispense(amount);
    }
}
