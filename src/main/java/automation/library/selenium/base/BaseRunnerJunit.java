package automation.library.selenium.base;


import cucumber.api.CucumberOptions;

@CucumberOptions(

		glue = { "automation.library.stepDefinitions" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }

)

public class BaseRunnerJunit {

}
