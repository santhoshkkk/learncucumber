package step_definitions;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import in.cucumber.nicebank.KnowsMyDomain;
import in.cucumber.nicebank.Money;
import in.cucumber.nicebank.MoneyConverter;
import org.junit.Assert;

public class AccountSteps {

    private KnowsMyDomain helper;

    public AccountSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @Given("^I have deposited (Rs\\.\\d+\\.\\d+) in my account$")
    public void iHaveDepositedRsInMyAccount(@Transform(MoneyConverter.class) Money depositAmount) throws Throwable {
        helper.getMyAccount().deposit(depositAmount);
        Assert.assertEquals("Incorrect balance in account", helper.getMyAccount().getBalance(), depositAmount);
    }


}
