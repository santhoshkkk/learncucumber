package in.cucumber.nicebank;

import cucumber.api.Transformer;

public class MoneyConverter extends Transformer<Money> {

    @Override
    public Money transform(String amount) {
        String[] numbers = amount.substring(2).split("\\.");
        int rupees = Integer.parseInt(numbers[1]);
        int paise = Integer.parseInt(numbers[2]);
        return new Money(rupees, paise);
    }
}
