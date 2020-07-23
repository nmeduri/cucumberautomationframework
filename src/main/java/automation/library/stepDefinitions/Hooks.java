package automation.library.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import automation.library.cucumber.TestContext;
import automation.library.logdetail.Log;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;

	}

	@Before
	public void BeforeSteps() {

	}

	@After

	public void AfterSteps(Scenario scenario) throws IOException {
		Log.message("Scenario:- " + scenario.getName(), true);
		if (scenario.isFailed()) {
			scenario.embed(
					((TakesScreenshot) PageObject.getDriver()).getScreenshotAs(OutputType.BYTES), 
					"image/png");
		}

		PageObject.getDriver().quit();

	}
}
