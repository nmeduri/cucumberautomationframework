package automation.library.stepDefination;


import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
	
	@And("click on error tab in new reward card screen")
	public void click_on_error_screen_tab_age_of_majority_check() throws Exception {
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
	
	@Then ("verify error text changes are reflected on ctc site")
	public void error_text_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).verifyErrorTextChangesReflectOnSite();
	}

	
	@Then ("error image changes are reflected on ctc site")
	public void error_image_changes_reflected_ctc_site() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).verifyErrorImageChangesReflectOnSite();
	}
	
	@And("user enter valid information on complete your profile screen for age of majority error to display")
	public void user_enter_valid_information_for_age_of_majority_error_to_display() throws Exception {
		
	    testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_First_Name(FileReaderManager.getInstance().getDataReader().get_FirstName());
	    testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Last_Name(FileReaderManager.getInstance().getDataReader().get_Last_Name_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Address(FileReaderManager.getInstance().getDataReader().get_Address_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_City(FileReaderManager.getInstance().getDataReader().get_City_Rewards());		
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterProvinceOntario();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Postal_Code(FileReaderManager.getInstance().getDataReader().get_Postal_Code_Rewards());		
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enter_Phone_Number(FileReaderManager.getInstance().getDataReader().get_Phone_Number_Rewards());		
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).enterYearOfBirth2002();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterMonthOfBirth_After_currentDate();
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).enterDateOfBirth();
		
	}

	@When("user should be navigated to complete your profile screen")
	public void navigate_to_complete_your_profile_screen() throws Exception {
		testContext.getPageObjectManager().getAEMNewRewardsCardScreenPage(PageObject.getDriver()).navigateToCompleteYourProfileScreen();
	}

}
		
