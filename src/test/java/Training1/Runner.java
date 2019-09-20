package Training1;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
@RunWith(Cucumber.class)
public class Runner {

}
