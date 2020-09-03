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
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LogInPageSteps extends BaseClass{

	public LogInPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("login url is available")
    public void login_url_is_available() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getBrowser());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getLoginPage(driver).navigateTo_Login_Page();
    }
	
	@Given("log in url is available on mobile")
    public void sign_up_url_is_available_on_mobile() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getMobileView());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getLoginPage(driver).navigateTo_Login_Page();
    }
    
    @Given("log-in url is available on wide screen chrome")
    public void sign_up_url_is_available_on_wide_screen() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getWideViewChrome());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getLoginPage(driver).navigateTo_Login_Page();
    }
	
	@When("login page is displayed")
	public void login_url_is_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Welcome_To_Your_Triangle_Header();
	}
	
	@When("enter email detail")
	public void enter_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data());
	}
	
	@And("user enter username")
	public void user_enter_username() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(emailVaue);
	}
	
	@And("user click on sign in button")
	public void user_click_on_sign_in_button() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).click_Sign_In_Button();
	}	
	
	@When("user is navigate on login page")
	public void user_is_navigate_on_login_page() throws Exception {
		Thread.sleep(5000);
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page();
	}
	
	@When("user click resend email verification")
	public void user_click_resend_email_verification() throws Exception {
		testContext.getPageObjectManager().getEmailSentConfirmationPage(PageObject.getDriver()).click_Resend_Email_Verification();
	}
	
	@Then("message verification email is displayed")
	public void message_verification_email_is_displayed() throws Exception {
		testContext.getPageObjectManager().getEmailSentConfirmationPage(PageObject.getDriver()).display_Message_Resend_Verification_Email_Sent();
	}
	
	@And("user enter invalid credential email")
    public void user_enter_invalid_crendtials_email() throws Exception {
		Random rand = new Random(); 
    	int number = rand.nextInt();
    	String value = "test" + Integer.toString(number);
		emailVaue = value.replace("-", "");
		Log.message("Email Value:- " + emailVaue, true);
   	    testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enter_Invalid_Data_Email_Login_Page(emailVaue + ".com");
    }
	
	@Then("an inline error is displayed")
	public void an_inline_error_is_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Inline_Error_Message_Invalid_Credentials();
	}
	
	@And("user enter invalid password")
	public void user_enter_invalid_password() throws Exception {
		testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(FileReaderManager.getInstance().getDataReader().get_Incorrect_Retype_Password_Detail());
	}
	
	@Then("message field required is displayed")
	public void message_field_required_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_This_Field_Is_Required();
	}

}
