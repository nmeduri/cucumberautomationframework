
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

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Mailinator_Page;
import automation.library.pageObjects.Sign_Up_Page;
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
 * This file contains the scenario of user stories OCCP-1691
 */
public class OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step extends BaseClass {
	
	Sign_Up_Page signUpPage;
	Mailinator_Page malinagorPage;

	public OCCP_1691_Account_Triangle_ID_Login_Reset_Password_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("sign up url is available")
    public void sign_up_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).navigateTo_Sign_Up_Page();
    }
    
    @Given("signup url is available on mobile")
    public void sign_up_url_is_available_on_mobile() throws Exception {
   	    
		testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).navigateTo_Sign_Up_Page();
    }
    
    @Given("sign-up url is available on wide screen chrome")
    public void sign_up_url_is_available_on_wide_screen() throws Exception {
   	    
		testContext.getPageObjectManager().getSignUpPage(PageObject.getDriver()).navigateTo_Sign_Up_Page();
    }
    
    @When("sign up page is displayed")
    public void sign_up_page_is_displayed() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Create_Your_Triangle_Header();
    }
    
    @And("switch on parent frame")
    public void switch_on_parent_window() throws Exception {
    	testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
    	testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
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
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(FileReaderManager.getInstance().getDataReader().get_Password_Detail());
    }
    
    @And("user enter retype password")
    public void user_enter_retype_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Retype_Password(FileReaderManager.getInstance().getDataReader().get_Retype_Password_Detail());
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
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).navigate_To_Mailinator();
       }
    
    @And("user enter detail in mailinator inbox")
    public void user_enter_detail_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(emailVaue);
    }
    
    @And("user enter reset password email detail in mailinator inbox")
    public void user_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_For_Reset_Password());
    }
    
    @And("user one enter reset password email detail in mailinator inbox")
    public void user_one_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_For_One());
    }
    
    @And("user two enter reset password email detail in mailinator inbox")
    public void user_two_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_Two());
    }
    
    @And("user three enter reset password email detail in mailinator inbox")
    public void user_three_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_Three());
    }
    
    @And("user four enter reset password email detail in mailinator inbox")
    public void user_four_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_Four());
    }
    
    @And("user five enter reset password email detail in mailinator inbox")
    public void user_five_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_Username_Five());
    }
    
    @And("user six enter reset password email detail in mailinator inbox")
    public void user_six_enter_reset_email_details_in_mailinator_inbox() throws Exception {
    	 testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInMailinatorInbox(FileReaderManager.getInstance().getDataReader().get_UserName_Six());
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
    
    @Then("user tap on verification email on mobile")
    public void user_click_tap_on_verification_email() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).clickVerifyEmailAddressOn_Mobile();
    }
    
    @And("user click on sign on option")
    public void user_click_on_sign_on_option() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).click_Sign_In_Option();
    }
    
    @And("select the privacy charter option")
    public void select_the_privacy_charter_option() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).click_Privacy_Charter();
    }
    
    @Then("user is taken to canadian tire privacy charter screen")
    public void user_is_taken_to_canadian_tire_privacy_charter_screen() throws Exception {
    	testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).display_Header_Privacy_Charter();
    }
    
    @And("the header of the overlay is sticky and remain visible")
    public void the_header_of_the_overlay_is_sticky_and_remain_visible() throws Exception {
    	testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).display_Header_Privacy_Charter();
    }
    
    @Then("user is able to scroll and read throught the privacy charter condition")
    public void user_is_able_to_scroll_and_read_throught_the_privacy_charter_condition() throws Exception {
    	testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownByCoordinates();
    }
    
    @And("download the privacy charter")
    public void downlaod_the_privacy_charter() throws Exception {
    	testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).clickPrivacyCharterDownloadLink();
    }
    
    @Then("user is able to download the charter in pdf format") 
    public void user_is_able_to_download_the_charter_in_pdf_format() throws Exception {
    	testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).verifyDowloadPrivacyChartedInPDFFormat();
    }
    
    @And("delete the downloaded file in pdf format")
    public void delete_the_downloaded_file_in_pdf_format() throws Exception {
    	testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).deleteFiles(Constant.BASE_PATH, ".pdf");
    }
    
    @Then("verfiy the download privacy charter document in pdf format")
    public void verify_the_download_privacy_charter_document_in_pdf_format() throws Exception {
       testContext.getPageObjectManager().getPrivacyPage(PageObject.getDriver()).verifyDownloadPrivacyFileInPDFFormat();	
    }
    
    
    @And("select Resend email verification")
    public void select_resend_email_verification() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).clickResendEmailVerification();
    }
    
    @Then("verification email is resent to the user")
    public void verification_email_is_resent_to_the_user() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayResentEmail();
    }
    
    @Then("verificationemail is resent to the user")
    public void verification_email_is_resent_to_the_user_mobile() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).displayResentEmailMobile();
    }
    
    @And("user click on previous mail")
    public void user_click_on_previous_mail() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).clickPreviousEmail();
    }
    
    @Then("user enter new credenatials")
    public void user_enter_credentials() throws Exception {
    	Log.message("New Credentials Password:- " + password, true);
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(password);
    }
    
    @When("user enter the previously registered email")
    public void user_enter_the_previously_registered_email() throws Exception {
   	    //testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Previously_Registered_Email(emailVaue);
   	 testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(emailVaue);
   	    Log.message("Email Value:- " + emailVaue, true);
    }
    
    @And("yopmail url is available")
    public void yopmail_url_is_available() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).navigate_To_Yopmail();
       }
    
    @Then("verify email verification in mobile")
    public void email_verification_in_mobile() throws Exception {
    	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).enterUserInYopmailInbox(emailVaue);
   	 	testContext.getPageObjectManager().getMailinatorPage(PageObject.getDriver()).verifyEmailVerificationMobile();
    }
    
    @Then("in mobile user enter email")
    public void user_enter_email_mobile() throws Exception {
    	Random rand = new Random(); 
    	int number = rand.nextInt();
    	String value = "test" + Integer.toString(number);
		emailVaue = value.replace("-", "");
		Log.message("Email Value:- " + emailVaue, true);
   	    testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Email_Mobile(emailVaue);
    }
    
    @When("in mobile user enter the previously registered email")
    public void in_mobile_user_enter_the_previously_registered_email() throws Exception {
   	    //testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Previously_Registered_Email(emailVaue);
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_UserName_Mobile(emailVaue);
   	    Log.message("Email Value:- " + emailVaue, true);
    }
}
