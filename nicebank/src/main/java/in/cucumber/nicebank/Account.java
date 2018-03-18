package in.cucumber.nicebank;

import lombok.Data;

@Data
public class Account {

    Money balance = new Money(0,0);

    public void credit(Money amount) {
        this.balance.add(amount);
    }

    public void debit(Money amount) throws Exception{
        if (amount.greaterThan(this.balance)) {
            throw new Exception("Insufficient Balance");
        }
        this.balance= this.balance.subtract(amount);
    }
}
