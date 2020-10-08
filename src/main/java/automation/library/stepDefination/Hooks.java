package automation.library.stepDefination;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import automation.library.cucumber.TestContext;
import automation.library.logdetail.Log;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * This file contains the precondions
 */
public class Hooks {

	TestContext testContext;
	Scenario scenario;

	public Hooks(TestContext context) {
		testContext = context;

	}

	@Before
	public void BeforeSteps() {
	    
	}


	
	public void scenarioStep() throws Exception {
		Log.message("Scenario Class:- " +  scenario.getName(), true);
	}

	@After
	public void AfterSteps(Scenario scenario) throws IOException {


		if (scenario.isFailed()) {

			try {
				scenario.embed(((TakesScreenshot) PageObject.getDriver()).getScreenshotAs(OutputType.BYTES),
						"image/png");
			} catch (Exception e) {

			}

		}

		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {

				File sourcePath = ((TakesScreenshot) PageObject.getDriver()).getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(
						System.getProperty("user.dir") + "/cucumber-reports/" + screenshotName + ".png");
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());

			} catch (IOException e) {
			}
		}}
}
