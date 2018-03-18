package in.cucumber.nicebank;

public class CashSlot {
    private Money contents;

    public Money getContent(){
        return contents;
    }

    public void dispense(Money amount) {
        contents = amount;
    }
}
