package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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

/**
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_1680_User_Logging_In_From_Email_Verification extends BaseClass {

	public OCCP_1680_User_Logging_In_From_Email_Verification(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user click on verification email")
    public void user_click_on_verification_email() throws Exception {
		testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayMomentAgo();
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).clickVerifyEmailAddress();
    }
	
	@And("user click on here to verify email link")
    public void use_click_on_here_to_verify_email_link() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).click_Here_To_Verify_Email();
    }
	
	@And("user is able to see click on here to verify email link")
    public void user_is_able_to_see_click_on_here_to_verify_email_link() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).display_Here_To_Verify_Email();
    }
    
    @Then("page your email has been verified displayed")
    public void page_your_email_has_been_verified_displayed() throws Exception {
    	testContext.getPageObjectManager().getYourEmailHasBeenVerifiedPage(PageObject.getDriver()).display_Your_Page_Has_been_Verified();
    }
    
    @And("user click on click here on reset your password")
    public void user_click_on_click_here_on_reset_your_password() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).clickOnClickHere();
    }
    
    @And("user is able to see click here")
    public void user_is_able_to_see_click_here() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayClickHere();
    }
    
    @And("user is able to verify click here on mobile")
    public void user_is_able_to_veify_click_here_on_mobile() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayClickHereMobile();
    }
    
    @And("user enter new password")
    public void user_enter_new_password() throws Exception {
    	Random rand = new Random(); 
    	int number = rand.nextInt(999);
    	String value = "Test@" + Integer.toString(number);
    	password = value;
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).enterNewPassword(password);
    }
    
    @And("user enter re-type password")
    public void user_enter_retype_password() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).enterRetypeNewPassword(password);
    }
    
    @And("user tap on sign in button")
    public void user_tap_on_sign_in_button() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).clickSignInButton();
    }
    
    @And("user click on reset password button")
    public void user_click_on_reset_password_button() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).clickResetPasswordButton();
    }
    
    @Then("user is navigated to password reset confirmation screen")
    public void user_is_navigated_to_passowrd_reset_confirmation_screen() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).displayResetPasswordScreen();
    }
    
    @And("user click buton join now")
    public void user_click_button_join_now() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage(PageObject.getDriver()).clickJoinNowButton();
    }
 
}
