package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import in.cucumber.nicebank.KnowsMyDomain;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverHooks {
    private KnowsMyDomain helper;

    public WebDriverHooks(KnowsMyDomain helper){
        this.helper = helper;
    }

    @After
    public void finish(Scenario scenario) {
        System.out.print("Taking screenshot");
        EventFiringWebDriver webDriver = helper.getWebDriver();

        try {
            byte[] screenshot = webDriver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.print(somePlatformsDontSupportScreenshots.getMessage());
        } finally {
            webDriver.close();
        }
    }
}
