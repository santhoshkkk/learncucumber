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


}
