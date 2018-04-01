package in.cucumber.nicebank;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {
    private KnowsMyDomain helper;

    public AtmUserInterface(KnowsMyDomain helper){
        this.helper = helper;
    }


    @Override
    public void withdraw(Account account, Money amount) throws Exception {
        EventFiringWebDriver webDriver = helper.getWebDriver();
        try {
            webDriver.get("http://localhost:9988");
            webDriver.findElement(By.id("amount")).sendKeys(new StringBuffer().append(amount.getRupees()).append('.').append(amount.getPaise()).toString());
            webDriver.findElement(By.id("withdraw")).click();
            Thread.sleep(100);
        } finally {
           // webDriver.close();
        }
    }
}
