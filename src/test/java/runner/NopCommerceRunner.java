package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/NopCommerce.feature",
		glue={"stepDefination"},
		tags= "@demo",
		plugin= {"pretty","html:target/htmlReport.html"}
		)

public class NopCommerceRunner {

}
