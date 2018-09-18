package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html-report",
				"json:target/cucumber-report/cucumber.json"},
		features = "src/test/resources/",
		glue = "classpath:stepDefinitions"				   
)

public class RunCukeTest { 	
}