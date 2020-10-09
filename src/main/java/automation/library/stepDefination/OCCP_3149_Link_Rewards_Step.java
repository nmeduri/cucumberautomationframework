package automation.library.stepDefination;

import org.openqa.selenium.JavascriptExecutor;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;
import automation.library.managers.FileReaderManager;
import automation.library.pageObjects.Login_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.support.FileReader;
/**
 * This file contains the scenario of user stories OCCP-3149
 */
public class OCCP_3149_Link_Rewards_Step extends BaseClass {
	 

	public OCCP_3149_Link_Rewards_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	

	@Then("user click on Get new triangle reward option")

	public void Click_GetLinkRewardOption() throws Exception {
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) PageObject.getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver())
		.click_GetTriangleReward_option();

	}

	@Then("verify the field level validation on complete profile screen")
	public void display_fieldLevelValidation_profile_screen() throws Exception {

	}
	@Then ("verify the error message when the below fields are not filled and tab out")
	public void verify_ErrorMessage() throws Exception {
		
	}
	
	
	@And ("do not enter mandatory fields and click on Continue button")
        public void ClickContinue_ErrorMessage() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).cickContinueButton();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_YOBerror();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_phnError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_provinceErr();
		JavascriptExecutor js = (JavascriptExecutor) PageObject.getDriver();
		js.executeScript("window.scrollBy(0,-300)", "");

		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver())
		.get_LastNameError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_addressError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_CityError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_FNError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_pinError();

	}
	@Then ("enter invalid details for the input fields and click on continue button")
	public void enterInvalidDetail_Continue() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_First_Name(FileReaderManager.getInstance().getDataReader().get_invalid_FirstName());	
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_invalid_LastName());	
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).cickContinueButton();

	}
	@Then ("enter pending loyalty card and click continue")
	public void enterPendingLoyaltyCard_Continue() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enter_Card_Number(FileReaderManager.getInstance().getDataReader().get_Pending_Card_Number());
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).click_Continue_Button();
		
	}
	@Then ("verify the display of details on the Complete your profile screen")
	public void verify_the_details_on_Complete_your_profile_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth();
		
		
		
	}

}
