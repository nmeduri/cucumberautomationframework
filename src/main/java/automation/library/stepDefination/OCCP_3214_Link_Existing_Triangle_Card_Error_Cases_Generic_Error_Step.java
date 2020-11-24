package automation.library.stepDefination;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * This file contains the scenario of user stories OCCP-3214
 */

public class OCCP_3214_Link_Existing_Triangle_Card_Error_Cases_Generic_Error_Step extends BaseClass{
	 
	public OCCP_3214_Link_Existing_Triangle_Card_Error_Cases_Generic_Error_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("access the default error image property and upload the image")
	public void upload_default_error_image() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).uploadDefaultErrorImage();
	}
	
	@Then("default error image changes should be reflected in ctc")
	public void default_error_image_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyDefaultErrorImageChangesReflected();
	}
	
}
