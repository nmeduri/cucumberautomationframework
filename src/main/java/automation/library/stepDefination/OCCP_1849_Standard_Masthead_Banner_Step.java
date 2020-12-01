package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1027
 */
public class OCCP_1849_Standard_Masthead_Banner_Step extends BaseClass {

	public OCCP_1849_Standard_Masthead_Banner_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@Given("masthead banner url is available") 
	public void masthead_banner_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigateTo_Masthead_Banner_Page();
	}
	
	@Given("masthead banner fr url is available") 
	public void masthead_banner_fr_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).navigateTo_Masthead_Banner_Fr_Page();
	}
	
	@When("user should be able to view banner")
	public void user_should_be_able_to_view_banner() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayMastheadBanner();
	}
	
	@Then("user should be able to view background color")
	public void user_should_be_able_to_view_background_color() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBackgroundColorForBanner();
	}
	
	@Then("user should be able to view title")
	public void user_should_be_able_to_view_title() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerTitle();
	}
	
	@Then("user able to view description")
	public void user_able_to_view_description() throws Exception {
		testContext.getPageObjectManager().getStandardMastheadBannerPage(PageObject.getDriver()).displayBannerDescription();
	}
}
