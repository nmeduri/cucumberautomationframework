package automation.library.stepDefination;


import static org.testng.Assert.fail;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1181
 */

public class OCCP_1181_Link_Rewards_Triangle_ID_Step extends BaseClass {
      
	public OCCP_1181_Link_Rewards_Triangle_ID_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("link card screen should be displayed")
	public void link_card_screen_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage(PageObject.getDriver()).displayLinkYourTriangleRewardsAccountTitle();
	}
	
	@When("enter detail email")
	public void user_enter_emailaddress() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Username_OCCP_1181());
	}
	
	@And("verify when user clicks on the get a new triangle rewards card link")
	public void verify_when_user_clicks_on_the_get_a_new_triangle_rewards_card_link() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage(PageObject.getDriver()).clickGetNewTriangleRewardsCard();
	}
	
	@Then("user should redirect to the get a new triangle rewards card screen")
	public void user_should_redirect_to_the_get_a_new_triangle_rewards_card_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).displayGetNewRewardsCardTitle();
	}
	
	@And("verify when user enter valid information on complete your profile screen")
	public void verify_when_user_enter_valid_information_on_complete_your_profile_screen() throws Exception {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 8;

	    for(int i = 0; i < length; i++) {

	      int index = random.nextInt(alphabet.length());
	      char randomChar = alphabet.charAt(index);
	      sb.append(randomChar);
	    }
	    String randomString = sb.toString();
	    testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_First_Name(randomString);
	    testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_Last_Name_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Address(FileReaderManager.getInstance().getDataReader().get_Address_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_City(FileReaderManager.getInstance().getDataReader().get_City_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDataProvince();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Postal_Code(FileReaderManager.getInstance().getDataReader().get_Postal_Code_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Phone_Number(FileReaderManager.getInstance().getDataReader().get_Phone_Number_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterYearOfBirth();
		
	}
	
	@And("verify clicks on continue button")
	public void verify_clicks_on_continue_button() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).cickContinueButton();
	}
	
	@Then("rewards terms and conditions should be displayed")
	public void rewards_terms_and_conditions_should_be_displaye() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).displayHeaderRewardsTermsAndConditions();
	}
	
	@And("user dont have scroll to terms and conditions page")
	public void user_don_have_scroll_to_terms_and_conditions_page() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).enableRegisterCardButton();
	}
	
	@And("register card button is displayed on terms and conditions page")
	public void verify_click_on_register_card_button_on_terms_and_conditions() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).displayRegisterCardButton();
	}
	
	@Then("button cancel is displayed on terms and conditions page")
	public void cancel_button_is_displayed_on_terms_and_conditions_page() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).displayCancdlButton();
	}
	
	@And("verify when click on cancel button")
	public void verify_when_click_on_cancel_button() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).clickCancdlButton();
	}
	
	@Then("user should be navigate to the previous screen as complete your your profile screen")
	public void user_should_be_navigate_to_the_previous_screen_as_complete_your_profile_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).displayGetNewRewardsCardTitle();
	}
	
	@And("clicks on register card button")
	public void clicks_on_register_card_button() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).clickRegisterCardButton();
	}
	
	@Then("user should taken to success screen")
	public void user_should_taken_to_success_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).displayNewLoyaltyCardSuccessScreen();
	}
	
	@Then("terms and conditions should open user's browser whether pdf")
	public void terms_and_conditions_should_open_users_browser_whether_pdf() throws Exception {
		testContext.getPageObjectManager().getRewardsTermsAndCondtionsPage(PageObject.getDriver()).verifyRewardsLinkInPdf();
	}
	
	@And("user 2488 enter detail email")
	public void user_2488_enter_detail_email() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_UserName_2488());
	}
}
	