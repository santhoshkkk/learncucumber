package in.cucumber.nicebank;

import lombok.Data;

@Data
public class Account {

    Money balance = new Money(0,0);

    public void deposit(Money amount) {
        this.balance.add(amount);
    }

}
