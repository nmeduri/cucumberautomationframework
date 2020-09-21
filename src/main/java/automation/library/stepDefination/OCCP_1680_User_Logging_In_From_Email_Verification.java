package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
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

public class OCCP_1680_User_Logging_In_From_Email_Verification extends BaseClass {

	public OCCP_1680_User_Logging_In_From_Email_Verification(TestContext context) throws Exception {
		testContext = context;
		
		configFileReader = new ConfigFileReader();
	}
	
	@And("user click on verification email")
    public void user_click_on_verification_email() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage().clickVerifyEmailAddress();
    }
	
	@And("user click on here to verify email link")
    public void use_click_on_here_to_verify_email_link() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage().click_Here_To_Verify_Email();
    }
    
    @Then("page your email has been verified displayed")
    public void page_your_email_has_been_verified_displayed() throws Exception {
    	testContext.getPageObjectManager().getYourEmailHasBeenVerifiedPage(PageObject.getDriver()).display_Your_Page_Has_been_Verified();
    }
    
    @And("user click on click here on reset your password")
    public void user_click_on_click_here_on_reset_your_password() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage().clickOnClickHere();
    }
    
    @And("user enter new password")
    public void user_enter_new_password() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage().enterNewPassword();
    }
    
    @And("user enter re-type password")
    public void user_enter_retype_password() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage().enterRetypeNewPassword();
    }
    
    @And("user tap on sign in button")
    public void user_tap_on_sign_in_button() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage().clickSignInButton();
    }
    
    @And("user click on reset password button")
    public void user_click_on_reset_password_button() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage().clickResetPasswordButton();
    }
    
    @Then("user is navigated to password reset confirmation screen")
    public void user_is_navigated_to_passowrd_reset_confirmation_screen() throws Exception {
    	testContext.getPageObjectManager().getResetPasswordPage().displayResetPasswordScreen();
    }
 
}
