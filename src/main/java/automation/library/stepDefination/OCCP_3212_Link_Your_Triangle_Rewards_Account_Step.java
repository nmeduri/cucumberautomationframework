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
 * This file contains the scenario of user stories OCCP-3212
 */

public class OCCP_3212_Link_Your_Triangle_Rewards_Account_Step  extends BaseClass{
	 
	public OCCP_3212_Link_Your_Triangle_Rewards_Account_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user cick on triangle rewards card")
	public void user_click_on_triangle_reward_card() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage(PageObject.getDriver()).click_Triangle_Reward_Card();
	}
	
	@And("user enters a loyalty card number that is deactivated")
	public void user_enter__deactivated_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterData_Deactivated_Card_Number();
	}
	
	@And("user enters a loyalty card number")
	public void user_enter__loyalty_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterData_Deactivated_Card_Number();
	}
	
	@And("verify when user enters a loyalty card number that is deactivated")
	public void verify_when_user_enters_a_loyalty_card_number_that_is_deactivated() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enter_Card_Number(FileReaderManager.getInstance().getDataReader().get_Deactivated_Card_Number());
	}
	
	@And("user click on continue button")
	public void user_click_on_continue_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).click_Continue_Button();
	}
	
	@Then("verify an error message is displayed informing card is deactivated")
	public void display_card_deactivated_error_message() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Deactivated_Error_Message();
	}
	
	@Then("user should navigate to link existing triangle card screen without prepopulated data")
	public void navigate_to_link_existing_card_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verify_CardNo_Not_Prepopulated();
	}
	
	@Then("try again button should be present in the error screen")
	public void display_of_tryagain_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_TryAgain_Button();
	}
	
	@Then("cancel button should be present in the error screen")
	public void display_of_cancel_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Cancel_Button();
	}
	
	@Then("user should navigate to link cards screen")
	public void navigate_to_link_cards_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Triangle_Reward_Card();
	}
	
	@Then("error image should be present in the error screen")
	public void display_of_error_image() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Error_Image();
	}
	
	@And("user verify's error text present in the error screen")
	public void user_verify_error__text() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verify_Deactivated_Error_Text();
	}
	
	@Then("triangle id logo is displayed on screen")
	public void display_of_triangleId_logo() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_TriangleId_Logo();
	}
	
	@Then("user should be able to enter the loyalty card number successfully which is deactivated")
	public void user_should_be_able_to_enter_the_loyalty_card_number_successfully_which_is_deactivated() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verfiyAbleToEnterLoyaltyNumber(FileReaderManager.getInstance().getDataReader().get_Deactivated_Card_Number());
	}
	
	@Then("verify an error message appears informing that card is deactivated")
	public void verify_an_error_message_appears_informing_that_card_is_deactivated() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Deactivated_Error_Message();
	}
	
	@And("verify when user click on try again button")
	public void verify_when_user_click_on_try_again_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).click_TryAgain_Button();
	}
	
	@And("verify when user click on cancel button")
	public void verify_when_user_click_on_cancel_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).click_Cancel_Button();
	}
	
	@And("cancel button is displayed")
	public void verify_cancel_button_is_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Cancel_Button();
	}
	
	@And("user is able to see the click link on screen")
	public void user_is_able_to_see_the_click_link_on_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayClickButton();
	}
	
	@Then("user should be able to see the error image on screen")
	public void user_should_be_able_to_see_the_error_image_on_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayErrorImageNotBlank();
	}
	
	@And("verify error image on screen")
	public void verify_error_image_on_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Error_Image();
	}
	
	@Then("user should be able to see the error text on screen")
	public void user_should_be_able_to_see_the_error_text_on_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verify_Deactivated_Error_Text();
	}
	
	@When("enter email id")
	public void enter_email_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email_Login_Page(FileReaderManager.getInstance().getDataReader().get_Email_Data());
	}
	
	@And("enter password data")
    public void user_enter_password() throws Exception {
   	 testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Password(FileReaderManager.getInstance().getDataReader().get_Password());
    }
	
	@Then("user should be redirected to link existing card page")
	public void user_should_be_redirected_to_link_existing_card_page() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayTitleLinkYourExistingCardPage();
	}
	
	@Then("link card page should be displayed without prepoulating card number")
	public void link_card_page_should_be_displayed_without_prepopulating_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verify_link_card_is_displayed_without_card_number_details();
	}

	@And("close browser")
    public void close_browser() throws Exception {
        //testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeDriver();
        PageObject.getDriver().quit();
    }

}
