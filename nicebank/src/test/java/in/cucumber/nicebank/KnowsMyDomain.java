package in.cucumber.nicebank;

public class KnowsMyDomain {
    private Account account;
    private CashSlot cashSlot;
    private Teller teller;


    public Account getMyAccount() {
        if (null == account) {
            account = new Account();
        }
        return account;
    }

    public CashSlot getCashSlot() {
        if (null == cashSlot) {
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }

    public Teller getTeller(CashSlot cashSlot) {
        if (null == teller) {
            teller = new Teller(cashSlot);
        }

        return teller;
    }
}
