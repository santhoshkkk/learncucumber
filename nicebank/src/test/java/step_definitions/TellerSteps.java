package step_definitions;

import cucumber.api.java.en.When;
import in.cucumber.nicebank.KnowsMyDomain;
import in.cucumber.nicebank.Money;

public class TellerSteps {

    KnowsMyDomain helper;

    public TellerSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @When("^I withdraw Rs\\.(\\d+)$")
    public void iWithdrawRs(int arg1) throws Throwable {
        helper.getTeller().withdraw(helper.getMyAccount(), new Money(arg1));
    }

}
