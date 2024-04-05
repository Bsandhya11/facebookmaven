package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeaturesFile/fb.feature"},
		glue = {"StepDefinition"},
		dryRun = false,
		monochrome = true,
		tags= "@Register",
		plugin= {"html:Reports/fb.html"}
		)
public class RunTest {

}
