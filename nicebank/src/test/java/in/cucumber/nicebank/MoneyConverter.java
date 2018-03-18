package in.cucumber.nicebank;

import com.sun.deploy.util.StringUtils;
import cucumber.api.Transformer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoneyConverter extends Transformer<Money> {

    @Override
    public Money transform(String amount) {
        String[] numbers = amount.substring(2).split("\\.");
        int rupees = Integer.parseInt(numbers[1]);
        int paise = Integer.parseInt(numbers[1]);
        return new Money(rupees,paise);
    }
}
