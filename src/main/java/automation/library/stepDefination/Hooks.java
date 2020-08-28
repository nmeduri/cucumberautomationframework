package automation.library.stepDefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

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
			try {
				scenario.embed(
						((TakesScreenshot) PageObject.getDriver()).getScreenshotAs(OutputType.BYTES), 
						"image/png");
			}catch(Exception e) {
				
			}
			
		}
		
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {

				File sourcePath = ((TakesScreenshot) PageObject.getDriver())
						.getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(
						System.getProperty("user.dir") + "/cucumber-reports/" + screenshotName + ".png");
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				
			} catch (IOException e) {
			}
		}
		
		try {
			PageObject.getDriver().quit();
		}catch(Exception e) {
			
		}

		

	}
}