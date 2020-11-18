
package automation.library.stepDefination;


import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
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
 * This file contains the scenario of Login Page
 */

public class LogInPageSteps extends BaseClass{
	
	public LogInPageSteps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("login url is available")
    public void login_url_is_available() throws Exception {
   	    
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page();
    }
	
	@Given("loginurl")
    public void login_url() throws Exception {
   	    
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page(driver);
    }
	
	@And("Remove Cookies")
	public void remove_cookies() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).clear_browser_history();
	}
	
	@Given("log in url is available on mobile")
    public void sign_up_url_is_available_on_mobile() throws Exception {
   	    
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page();
    }
    
    @Given("log-in url is available on wide screen chrome")
    public void sign_up_url_is_available_on_wide_screen() throws Exception {
   	    
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page();
    }
	
	@When("login page is displayed")
	public void login_url_is_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Welcome_To_Your_Triangle_Header();
	}
	
	@When("enter email detail")
	public void enter_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Valid_Email_Data());
	}
	
	@And("clear email detail")
	public void clear_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).clear_Email_Login_Page();
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).clear_Email_Login_Page();
	}
	
	@When("enter reset email detail")
	public void enter_reset_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_UserName_Three());
	}
	
	@And("user enter username")
	public void user_enter_username() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(emailVaue);
	}
	
	@And("user click on sign in button")
	public void user_click_on_sign_in_button() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).click_Sign_In_Button();
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).verify2FactorAuthentication();
	}	
	
	@When("user is navigate on login page")
	public void user_is_navigate_on_login_page() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page();
	}
	
	@And("link reward screen is displayed")
	public void displayLinkRewardScreen() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).displayLinkRewards();
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

	@When("enter hide link screen email details")
	public void enter_hide_link_screen_email_details() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Hide_Link_Screen_Email_Data());
	}
	@When("2480-enter email detail")
	public void enter_email_detail_2480() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Valid_Email_Id_2480());
	}
	@And("blue background should be displayed")
	public void blue_background_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Blue_Background();
	}
	@And("logo should be displayed")
	public void logo_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Login_Page_Logo();
	}
	@When("fr locale login url is available")
    public void fr_locale_login_url_is_available() throws Exception {
   	    
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).navigateTo_Login_Page_Fr_Locale();
    }
	@And("blue background is displayed in mobile view")
	public void blue_background_is_displayed_mobile() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).display_Blue_Background_Mobile();
	}
	@When("AEM author with access to configure login page component")
	public void aem_author_with_access_to_configure_login_page_component() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).navigate_To_Author_Login_Page_Url();
	}
	@And("click on gigya integration component")
	public void click_on_gigya_integration_component() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).clickOnGigyaIntegrationComponent();
	}
	@And("select gigya Screen1 dropdown")
	public void select_gigya_Screen1_dropdown() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).select_Gigya_Screen1_Dropdown();
	}
	@And("select gigya Screen2 dropdown")
	public void select_gigya_Screen2_dropdown() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).select_Gigya_Screen2_Dropdown();
	}
	
	@When("hit login page publish url")
	public void hit_login_page_publish_url() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).navigateTo_Login_Page_Publish_Url_En();
	}
	@When("for fr locale AEM author with access to configure login page component")
	public void for_fr_locale_aem_author_with_access_to_configure_login_page_component() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).navigate_To_Author_Login_Page_Url_Fr();
	}
	@When("hit fr login page publish url")
	public void hit_fr_login_page_publish_url() throws Exception {
		testContext.getPageObjectManager().getAEMLoginPage(PageObject.getDriver()).navigateTo_Login_Page_Publish_Url_En();
	}

	
}
