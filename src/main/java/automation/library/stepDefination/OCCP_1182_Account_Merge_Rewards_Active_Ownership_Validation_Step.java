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

public class OCCP_1182_Account_Merge_Rewards_Active_Ownership_Validation_Step extends BaseClass {
      
	public OCCP_1182_Account_Merge_Rewards_Active_Ownership_Validation_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("aem author with access navigates to merge reward screen")
	public void aem_author_with_access_navigates_to_merge_reward_screen() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).navigateTo_account_merge_Reward_Page();
	}
	@And ("click on my acount merge reward component")
	public void click_my_acount_merge_reward_component() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).click_merge_reward_component();
	}
	@Then ("click on merge reward page error screen tab")
	public void click_on_error_screen_tab_on_merge_reward_page() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).click_errorScreen_Tab();
	}
	@Then ("configure the error message in merger reward screen")
	public void configure_the_errormessage_in_merge_reward_screen() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).update_errormessage();
	}
	@When("aem author with access navigates to cart fragment screen")
	public void aem_author_with_access_navigates_to_cartFragment_screen() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).navigateTo_cartFragment_Page();
	}
	@Then ("configure cancel label in merge reward screen")
	public void configure_the_cancelLabel_in_merge_reward_screen() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).update_cancellabel();
	}
	@Then ("configure tryAgainCTA label in merge reward screen")
	public void configure_the_TryAgainCTA_in_merge_reward_screen() throws Exception {
		testContext.getPageObjectManager().getAEMAccountMergeRewardPage(PageObject.getDriver()).update_TryAgainCTA();
	}
}