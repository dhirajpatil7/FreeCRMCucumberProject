package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/New Eclips/JavaWorkspace/FreeCRMCucumberProject/src/main/java/Features/tagging.feature"
							, glue = {"stepDefinition" }
							, format = { "pretty", "html:test-output","json:json_output/cucumber.json" }
							, monochrome = true
							, strict = true
							, dryRun = false
							, tags = {"~@SmokeTest" , "~@RegressionTest","~@End2End"}
							)

public class TestRunner {

}
