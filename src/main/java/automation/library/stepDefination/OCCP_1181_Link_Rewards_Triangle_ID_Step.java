package automation.library.stepDefination;


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
      PDP_Page pdpPage;
	public OCCP_1181_Link_Rewards_Triangle_ID_Step(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("link card screen should be displayed")
	public void link_card_screen_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().displayLinkYourTriangleRewardsAccountTitle();
	}
	
	@And("verify when user clicks on the get a new triangle rewards card link")
	public void verify_when_user_clicks_on_the_get_a_new_triangle_rewards_card_link() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage().clickGetNewTriangleRewardsCard();
	}
	
	@Then("user should redirect to the get a new triangle rewards card screen")
	public void user_should_redirect_to_the_get_a_new_triangle_rewards_card_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().displayGetNewRewardsCardTitle();
	}
	
	@And("verify when user enter valid information on complete your profile screen")
	public void verify_when_user_enter_valid_information_on_complete_your_profile_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_First_Name(FileReaderManager.getInstance().getDataReader().get_First_Name_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_Last_Name_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_Address(FileReaderManager.getInstance().getDataReader().get_Address_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_City(FileReaderManager.getInstance().getDataReader().get_City_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enterDataProvince();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_Postal_Code(FileReaderManager.getInstance().getDataReader().get_Postal_Code_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_Phone_Number(FileReaderManager.getInstance().getDataReader().get_Phone_Number_Rewards());
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enterYearOfBirth();
	}
	
	@And("verify clicks on continue button")
	public void verify_clicks_on_continue_button() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().cickContinueButton();
	}
}
	