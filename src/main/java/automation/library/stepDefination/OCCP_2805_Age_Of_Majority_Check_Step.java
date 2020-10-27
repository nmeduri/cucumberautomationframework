package automation.library.stepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
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
 * This file contains the scenario of user stories OCCP-2805
 */

public class OCCP_2805_Age_Of_Majority_Check_Step extends BaseClass{

	public OCCP_2805_Age_Of_Majority_Check_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
	}
	@And("verify when user enter valid information and select year of birth for age majority check")
	public void check_Age_Majority() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_Age_Majority();

	}
	@And("verify when user enter valid information and select year of birth not reached age majority check")
	public void check_No_Age_Majority() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards();
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_No_Age_Majority();

	}
	@And ("verify when user enter year of birth that equals age of majority")
	public void enter_year_of_AgeMajority() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_No_Age_Majority();
	}
	@Then ("verify Month of Birth and Date of Birth fields appears")
	public void verify_Month_dateOfBirth() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).display_MonthOfBirth();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).display_DateOfBirth();

	}
	@Then ("enter birthday before current date")
	public void Enter_BirthDay_before_CurrentDate() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();
	}
	
	@Then ("enter birthday after current date")
	public void Enter_BirthDay_after_CurrentDate() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth_After_currentDate();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();

	}
	@Then ("verify user should see an error screen with Age of majority message")
	public void verify_ageOfMajority_error() throws Exception {
		testContext.getPageObjectManager().getLink_reward_ProfileScreen_page(PageObject.getDriver()).dispaly_ageMajorityError();
	}
	
	@When("aem author with access navigates to new rewards card screen")
	public void navigate_to_new_rewards_card_screen() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).navigateToNewRewardsCardScreen();
	}
	
	@And("click on aem new reward card title")
	public void click_on_aem_new_rewards_card_screen() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).clickOnNewRewardsCardTitle();
	}
	
	@And("in link new rewards card page click on error tab")
	public void click_on_error_screen_tab() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).clickOnErrorScreenTab();
	}
	
	@And("user should be able to author error text")
	public void user_able_to_author_error_text() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).displayErrorTextField();
	}
	
	@And("user updates the error text")
	public void user_updates_error_text() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterDataErrorText();
	}
	
	@And("user updates the try again cta label")
	public void user_updates_tryagain_cta_label() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterDataTryAgainLabel();
	}
	
	@And("user updates the cancel cta label")
	public void user_updates_cancel_cta_label() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterDataCancelLabel();
	}
	
	@And("login to AEM using the right credentials as mentioned in the test data")
	public void login_to_aem_using_the_right_credential_as_mentioned_in_the_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickArrowIcon();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).enterUsername();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).enterPassword();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickSignInButton();
	}
	
	@And("user should be able to author error image")
	public void user_able_to_author_error_image() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).displayErrorImageField();
	}
	
	@And("user should be able to author try again cta label")
	public void user_able_to_author_tryagain_label() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).displayTryAgainCTA();
	}
	
	@And("user should be able to author cancel cta label")
	public void user_able_to_author_cancel_label() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).displayCancelCTA();
	}
	
	@And("user updates the error image")
	public void user_updates_error_image() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterDataErrorImage();
	}
	
	@Then ("error text changes are reflected on ctc site")
	public void error_text_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).verifyErrorTextChangesReflectOnSite();
	}

	@Then ("try again cta label changes are reflected on ctc site")
	public void tryagain_label_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth_After_currentDate();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();
	}

	@Then ("cancel cta changes are reflected on ctc site")
	public void cancel_label_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth_After_currentDate();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();
	}
	
	@Then ("error image changes are reflected on ctc site")
	public void error_image_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth_After_currentDate();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();
	}
	
	
}
		
