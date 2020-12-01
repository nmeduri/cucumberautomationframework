package automation.library.stepDefination;

import org.openqa.selenium.JavascriptExecutor;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;
import automation.library.managers.FileReaderManager;
import automation.library.pageObjects.Login_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.support.FileReader;

/**
 * This file contains the scenario of user stories OCCP-2850
 */
public class OCCP_2850_Condensed_Navigation_Desktop_Step extends BaseClass {

	public OCCP_2850_Condensed_Navigation_Desktop_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}

	@Then("pencil banner and secondary navigation should be collapsed")
	public void primary_navigation_should_consist_hamburger_menu() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).notDisplayPencilBannerInHeader();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).notDisplaySecondaryNavigation();
	}


	@Then("secondary navigation should be displayed") 
	public void secondary_navigation_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displaySecondaryNavigation();
	}
	
	@Then("pencil banner should be displayed") 
	public void pencil_banner_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayPencilBanner();
	}
	
	@And("scroll up to display secondary navigation") 
	public void scroll_upto_display_secondary_navigation() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollUp();
	}
	
	@And("scroll down the page to not display pencil banner and secondary navigation") 
	public void scrolldown_to_not_display_secondary_navigation_and_pencil_banner() throws Exception {
		//PageObject.getDriver().navigate().refresh();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).scrollDownToSize();
	}
		

}
