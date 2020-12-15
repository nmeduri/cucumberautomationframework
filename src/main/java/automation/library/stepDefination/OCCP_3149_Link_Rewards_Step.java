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
		Thread.sleep(5000);
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
	
	
	@And ("do not enter mandatory fields")
        public void NoInput_ErrorMessage() throws Exception {
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_addressError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_CityError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_pinError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_YOBerror();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_phnError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_provinceErr();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_LastNameError();
		
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_FNError();
		

	}
	@Then ("enter invalid details for the input fields")
	public void enterInvalidDetail_Continue() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_First_Name(FileReaderManager.getInstance().getDataReader().get_invalid_FirstName());	
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_invalid_LastName());	

	}
	
	@Then("user should be able to see an inline error message below the field") 
	public void user_should_be_able_to_see_an_inline_error_message_below_the_field() throws Exception {
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_YOBerror();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_phnError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_provinceErr();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_LastNameError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_addressError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_CityError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_FNError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).get_pinError();
	}
	@Then ("validate inline error displayed when incorrect details are filled")
	public void validate_error_when_incorrect_details_filled() throws Exception {
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_InvalidFirstNameError();
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_InvalidLastnameError();

	}


}
