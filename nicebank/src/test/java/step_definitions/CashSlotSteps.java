package step_definitions;

import cucumber.api.java.en.Then;
import in.cucumber.nicebank.KnowsMyDomain;
import in.cucumber.nicebank.Money;
import org.junit.Assert;

public class CashSlotSteps {

    private KnowsMyDomain helper;

    public CashSlotSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }


    @Then("^Rs\\.(\\d+) should be dispensed$")
    public void rsShouldBeDispensed(int arg1) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed", new Money(arg1), helper.getCashSlot().getContent());
    }
}
