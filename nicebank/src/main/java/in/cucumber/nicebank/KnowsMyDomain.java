package in.cucumber.nicebank;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class KnowsMyDomain {
    private EventFiringWebDriver webDriver;
    private Account account;
    private CashSlot cashSlot;
    private Teller teller;

    public EventFiringWebDriver getWebDriver() {
        if (null == webDriver) {
            this.webDriver = new EventFiringWebDriver(new SafariDriver());
        }
        return webDriver;
    }

    public Account getMyAccount() {
        if (null == account) {
            account = new Account();
        }
        return account;
    }

    public CashSlot getCashSlot() {
        if (null == cashSlot) {
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }

    public Teller getTeller() {
        if (null == teller) {
            teller = new AtmUserInterface(this);
        }

        return teller;
    }
}
