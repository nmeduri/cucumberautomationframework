package automation.library.stepDefination;

import org.openqa.selenium.JavascriptExecutor;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;
import automation.library.managers.FileReaderManager;
import automation.library.pageObjects.Login_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.support.FileReader;

public class OCCP_3149_Link_Rewards_Step extends BaseClass {
	Login_Page loginPage;

	public OCCP_3149_Link_Rewards_Step(TestContext context) throws Exception {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
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
	@And ("do not enter mandatory fields and click on Continue button")
public void ClickContinue_ErrorMessage() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().cickContinueButton();
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
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_First_Name(FileReaderManager.getInstance().getDataReader().get_invalid_FirstName());	
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_invalid_LastName());	
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage().cickContinueButton();

	}

}
