package stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		plugin={"pretty","html:target/cucumber-html"},
		features="src/features",
		tags= {"@LoginFeature"},
		glue= {"stepDef"}
		
		
		)
public class TestRunner {

}
