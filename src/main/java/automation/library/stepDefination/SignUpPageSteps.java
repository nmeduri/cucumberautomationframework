package automation.library.stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of Sign Up Page
 */

public class SignUpPageSteps extends BaseClass{

	public SignUpPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^sign up url is up$")
	public void adobe_author_url_is_up() throws Exception {
		
		testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).navigateTo_Sign_Up_Page();
		
	}
	
	@When("^sign up url is launched$")
	public void user_launches_the_author_url() throws Throwable {

	}
	
	@When("fr locale sign up url is available")
    public void fr_locale_signup_url_is_available() throws Exception {
   	    
		testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).navigateTo_Sign_Up_Page_Fr_Locale();
    }
	@When("fr locale sign up page is displayed")
    public void sign_up_page_is_displayed() throws Exception {
   	 testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).display_Sign_Up_Header_Fr();
    }
}
