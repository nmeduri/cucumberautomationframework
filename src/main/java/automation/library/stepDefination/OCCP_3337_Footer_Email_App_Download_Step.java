package automation.library.stepDefination;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.Footer_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-1027
 */
public class OCCP_3337_Footer_Email_App_Download_Step extends BaseClass {

	public OCCP_3337_Footer_Email_App_Download_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@Given("footre url is available") 
	public void footer_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).navigateTo_Footer_Page();
	}
	
	@And("click on download and accessibility tab")
	public void click_on_download_and_accessibility_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickDownloadAndAccessibilityTab();
	}
	
	@And("update be the first to know detail")
	public void update_be_the_first_to_know_detail() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateBeTheFirstToKnowField();
	}
	
	@Then("be the first to know changes are reflect on site")
	public void be_the_first_to_know_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyToBeTheFirstChangesReflectOnSite();
	}
	
	@And("reverse be the first to know changes")
	public void reverse_be_the_first_to_know_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertToBeTheFirstKnowChanges();
	}
	
	@And("update the get your weekly flyer email directly to you field")
	public void update_the_get_your_weekly_flyer_email_directly_to_you_field() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateWeeklyFlyerEmailDirectly();
	}
	
	@Then("weekly flyer email directly changes are reflect on site")
	public void weekly_flyer_email_directly_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyFlyerEmailDirectlyChangesReflectOnSite();
	}
	
	@And("reverse weekly flyer email directly changes")
	public void reverse_weekly_flyer_email_directly_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertWeeklyFlyerEmailDirectly();
	}
	
	@And("update sign up now field")
	public void update_sign_up_now_field() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateWeeklySignUpField();
	}
	
	@And("reverse weekly sign up changes")
	public void reverse_weekly_sign_up_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertWeeklySignUpChanges();
	}
	
	@Then("weekly sign up changes are reflect on site")
	public void weekly_sign_up_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyWeeklySignUpChangesReflectOnSite();
	}
	
	@And("configure the destination url for sign up")
	public void configure_the_destination_url_for_sign_up() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateWeeklySignUpUrl();
	}
	
	@And("revert configure destination sign up url changes")
	public void revert_configure_destination_sign_up_url_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).revertWeeklySignUpUrlChanges();
	}
	
	@Then("url for sign up changes are reflect on site")
	public void url_for_sign_up_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyWeeklySignUpUrlChangesReflectOnSite();
	}
	
	@Then("user should be directed to learn more section")
	public void user_should_be_directed_to_learn_more_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLearnMoreLinkNavigation();
	}

	@And("click on accessibility logo")
	public void clickOnAccessibilityLogo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAccessibilityLogo();
	}
	
	@Then("user should be directed to accessibility section on new tab")
	public void user_should_be_directed_accessibility_section_on_new_tab() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyAccessibilityNavigation();
	}
}
