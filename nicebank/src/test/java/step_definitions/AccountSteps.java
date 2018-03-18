package step_definitions;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import in.cucumber.nicebank.KnowsMyDomain;
import in.cucumber.nicebank.Money;
import in.cucumber.nicebank.MoneyConverter;
import org.junit.Assert;

public class AccountSteps {

    private KnowsMyDomain helper;

    public AccountSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @Given("^my account has been credit with (Rs\\.\\d+\\.\\d+)$")
    public void myAccountHasBeenCreditWithRs(@Transform(MoneyConverter.class) Money depositAmount) throws Throwable {
        helper.getMyAccount().credit(depositAmount);
    }


    @Then("^the balance of my account should be (Rs\\.\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBeRs(@Transform(MoneyConverter.class) Money balance) throws Throwable {
        Assert.assertEquals("Incorrect balance", helper.getMyAccount().getBalance(), balance);
    }


}
