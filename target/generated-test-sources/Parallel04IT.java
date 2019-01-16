import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:/Users/sarthakchadha/eclipse-workspace3/FADAVIS_Automation/src/test/resources/featureFiles/Student_RedeemAccessCode.feature"},
        plugin = {"json:C:/Users/sarthakchadha/eclipse-workspace3/FADAVIS_Automation/target/4.json"},
        monochrome = false,
        tags = {},
        glue = {"com.cengage.stepdefs"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
