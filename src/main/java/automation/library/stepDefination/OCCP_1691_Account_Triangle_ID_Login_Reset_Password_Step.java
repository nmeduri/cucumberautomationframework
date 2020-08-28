package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step extends BaseClass {

	public OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("sign up url is available")
    public void sign_up_url_is_available() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getBrowser());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getSignUpPage(driver).navigateTo_Sign_Up_Page();
    }
    
    @Given("signup url is available on mobile")
    public void sign_up_url_is_available_on_mobile() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getMobileView());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getSignUpPage(driver).navigateTo_Sign_Up_Page();
    }
    
    @Given("sign-up url is available on wide screen chrome")
    public void sign_up_url_is_available_on_wide_screen() throws Exception {
   	    driver = driverFactory.getDriver(configFileReader.getWideViewChrome());
		pageObjectManager = new PageObjectManager();
		testContext.getPageObjectManager().getSignUpPage(driver).navigateTo_Sign_Up_Page();
    }
    
    @When("sign up page is displayed")
    public void sign_up_page_is_displayed() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Create_Your_Triangle_Header();
    }
    
    @Then("user enter email")
    public void user_enter_email() throws Exception {
    	Random rand = new Random(); 
    	int number = rand.nextInt();
    	String value = "test" + Integer.toString(number);
		emailVaue = value.replace("-", "");
		Log.message("Email Value:- " + emailVaue, true);
   	    testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Email(emailVaue);
    }
    
    @Then("user enter password")
    public void user_enter_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password();
    }
    
    @And("user enter retype password")
    public void user_enter_retype_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Retype_Password();
    }
    
    @And("user enter invalid retype password")
    public void user_enter_invalid_retype_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Incorrect_Retype_Password();
    }
    
    @And("the system displays an inline error that passwords do not match")
    public void the_system_displays_an_inline_error_that_passwords_do_not_match() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Error_Message_Password_Do_Not_Match();
    }
    
    @And("the option to procced to the next screen is not selectable")
    public void the_option_to_procced_to_the_next_screen_is_not_selectable() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Create_Your_Triangle_Header();
    }
    
    @And("user click on create button")
    public void user_click_on_create_button() throws Exception {
     testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).click_Create_Button();	
    }
    
    @And("user click on next button")
    public void user_click_on_next_button() throws Exception {
     testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).click_Next_Button();
    }
    
    @And("email verification sent confirmation screen is displayed")
    public void email_verification_sent_confirmation_screen_is_displayed() throws Exception {
    	testContext.getPageObjectManager().getEmailSentConfirmationPage(PageObject.getDriver()).display_Message_Verification_Email_Sent();
    }
    
    @And("mailinator url is available")
    public void mailinator_url_is_available() throws Exception {
      	 testContext.getPageObjectManager().getMailinatorPage(driver).navigate_To_Mailinator();
       }
    
    @And("user enter detail in mailinator inbox")
    public void user_enter_detail_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(emailVaue);
    }
    
    @And("user click on go button")
    public void user_click_on_go_button() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).clickGoButton();	
    }
    
    @Then("the user has received the verification email")
    public void the_user_has_received_the_verification_email() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayVerifyEmailAddress();
    }
    
    @Then("user has received the verification email on mobile")
    public void the_user_has_received_the_verification_email_on_mobile() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayVerifyEmailAddressOn_Mobile();
    }
}