package in.cucumber.nicebank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Money {
    private int rupees = 0;
    private int paise = 0;

    public Money(int rupees){
        this.rupees=rupees;
    }

    public void add(Money amount) {
        this.rupees+=amount.rupees;
        this.paise+=amount.paise;
    }


    public boolean greaterThan(Money amount) {
        return this.rupees>amount.rupees || (this.rupees==amount.rupees&&this.paise>amount.paise);
    }

    public Money subtract(Money amount) {
        int differenceInPaise = getInPaise() - amount.getInPaise();
        return new Money(differenceInPaise/100, differenceInPaise%100);
    }

    private int getInPaise() {
        return this.rupees*100+this.paise;
    }
}
