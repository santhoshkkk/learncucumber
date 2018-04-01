import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "classpath:step_definitions", snippets = SnippetType.CAMELCASE, plugin = {"pretty", "html:out"})
public class RunCucumberTest {
}
