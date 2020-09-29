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
public class OCCP_3212_Link_Your_Triangle_Rewards_Account_Step  extends BaseClass{
	
       Login_Page loginPage;
	public OCCP_3212_Link_Your_Triangle_Rewards_Account_Step(TestContext context) throws Exception {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user cick on triangle rewards card")
	public void user_click_on_triangle_reward_card() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().click_Triangle_Reward_Card();
	}
	
	@And("user enter card number that is deactivated")
	public void user_enter__deactivated_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().enterData_Deactivated_Card_Number();
	}
	
	@And("user click on continue button")
	public void user_click_on_continue_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().click_Continue_Button();
	}
	
	@Then("error message is displayed informing card is deactivated")
	public void display_card_deactivated_error_message() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_Deactivated_Error_Message();
	}
	
	@And("user click on try again")
	public void user_click_on_tryagain_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().click_TryAgain_Button();
	}
	
	@Then("user should navigate to link existing triangle card screen without prepopulated data")
	public void navigate_to_link_existing_card_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().verify_CardNo_Not_Prepopulated();
	}
	
	@And("user click on cancel button")
	public void user_click_on__button() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().click_Cancel_Button();
	}
	
	@Then("try again button should be present in the error screen")
	public void display_of_tryagain_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_TryAgain_Button();
	}
	
	@Then("cancel button should be present in the error screen")
	public void display_of_cancel_button() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_Cancel_Button();
	}
	
	@Then("user should navigate to link cards screen")
	public void navigate_to_link_cards_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_Triangle_Reward_Card();
	}
	
	@Then("error image should be present in the error screen")
	public void display_of_error_image() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_Error_Image();
	}
	
	@And("user verify's error text")
	public void user_verify_error__text() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().verify_Deactivated_Error_Text();
	}
	
	@Then("triangle id logo is displayed on screen")
	public void display_of_triangleId_logo() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().display_TriangleId_Logo();
	}


}
