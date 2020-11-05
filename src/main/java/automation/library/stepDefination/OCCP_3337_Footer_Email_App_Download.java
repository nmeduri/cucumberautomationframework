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
 * This file contains the scenario of user stories OCCP-3337
 */
public class OCCP_3337_Footer_Email_App_Download extends BaseClass {

	public OCCP_3337_Footer_Email_App_Download(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	

	@When("footer page is displayed for the product")
	public void footer_page_is_displayed_for_the_product() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).display_Footer_Page();
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
	
	@And("click on sign up")
	public void clickOnSignUp() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnSignUp();
	}
	@Then("user should be directed to accessibility section on new tab")
	public void user_should_be_directed_accessibility_section_on_new_tab() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyAccessibilityNavigation();
	}
	
	@And("in footer links section click on android play store logo")
	public void click_on_android_playstore_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAndroidPlayStoreLogo();
	}
	
	@Then("android play store should be opened with details on app download")
	public void navigate_to_android_playstore_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyLinkNavigateToAndroidPlayStore();
	}
	
	@And("in footer links section click on apple app store logo")
	public void click_on_apple_appstore_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickAppStoreLogo();
	}
	
	@And("in footer links section access the apple app store logo and verify the url")
	public void verify_apple_appstore_logo_url() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyIOSAppStoreURL();
	}

	@And("footer links section should be displayed")
	public void links_of_footer_section_should_displayed() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayFooterLinksSection();
	}
	
	@And("click on Android App store logo")
	public void click_on_the_android_app_store_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAndroidAppStoreLogo();
	}
	
	@And("should redirected to a new tab opens with details on App store download")
	public void redirected_to_new_tab_opens_with_details_on_App_store_download() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayGoogleAppStoreDownload();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	@Then("link should be underlined when hovers over any link on the footer links section")
	public void link_should_underlined_when_hovers_over_any_link_on_the_footer_links_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyHoverOnAnyFooterLink();
	}
	
	@And("configure the text for download the app field")
	public void configure_text_for_download_the_app_field() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateDownloadTheAppField();
	}
	
	@And("updated changes should be reflected on the published instance")
	public void updated_changes_should_reflected_on_the_published_instance() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayDownloadTheApp();

	}
	
	@Then("user should be directed to sign up section on new tab")
	public void user_should_redirected_sign_up_section_on_new_tab() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifySignUpNavigation();
	}
	
	@And("click on apple store logo")
	public void click_on_the_apple_store_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickAppStoreLogo();
	}
	
	@Then("user should be directed to app store section on new tab")
	public void user_should_redirected_app_store_section_on_new_tab() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyAppStoreNavigation();
	}
	
	@And("configure the text for learn more field")
	public void configure_text_for_learn_more_field() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateLearnMoreField();
	}
	
	@And("updated learn more changes should be reflected on the site")
	public void updated_the_learn_more_changes_should_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayLearnMore();
	}
	
	@And("configure the destination URL for apple app store logo")
	public void configure_thedestination_URL_for_apple_app_store_logo() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateAppleAppStoreLink();
	}
	
	@And("updated apple app store url changes should be reflected on the site")
	public void updated_the_apple_app_store_url_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyAppleAppStoreUrlChangesReflectOnSite();
	}
	@And("configure destination URL for play store logo")
	public void configure_the_destination_URL_for_play_store_logo() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updatePlayStoreLink();
	}
	@And("updated play store url changes should be reflected on the site")
	public void updated_android_play_store_url_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyPlayStoreUrlChangesReflectOnSite();
	}
	@And("configure the destination URL for accessibility icon")
	public void configurethe_destination_URL_for_accessibility_icon() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateAccessibilityIconLink();
	}
	@And("updated accessibility url changes should be reflected on the site")
	public void updated_Accessibility_url_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).verifyAccessibilityUrlChangesReflectOnSite();
	}
	@And("configure the logo for accessibility field")
	public void configure_logo_for_accessibility_field() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).pickAccessibilityLogo();
	}
	@And("updated accessibility Logo changes should be reflected on the site")
	public void updated_the_accessibility_logo_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).displayAccessibilityLogo();
	}
	@And("configure the accessibility icon link on same page or new tab")
	public void configure_accessibility_icon_link_on_same_page_or_new_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).updateAccessibilityLinkOnSamePageOrNewtab();
	}
	@And("updated accessibility link changes should be reflected on the site")
	public void updated_accessibility_link_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnAccessibilityLogo();
	}
	@And("configure the android play app target on same page or new tab")
	public void configure_the_android_play_app_targeton_same_page_or_new_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).selectAndroidPlayAppTargetOnSamePageOrNewtab();
	}
	@And("updated android play store link changes should be reflected on the site")
	public void updated_android_playstore_link_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnPlayStoreLogo();
	}
	@And("configure the apple app store target on same page or new tab")
	public void configure_apple_app_store_target_on_same_page_or_new_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).selectAndroidPlayAppTargetOnSamePageOrNewtab();
	}
	@And("updated apple app store link changes should be reflected on the site")
	public void updated_the_apple_app_store_link_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnAppleAppStoreLogo();
	}
	@And("configure the weekly flyer target on same page or new tab")
	public void configure_weekly_flyer_target_on_same_page_or_new_tab() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).selectWeeklyFlyerTargetOnSamePageOrNewtab();
	}
	@And("updated weekly_flyer target changes should be reflected on the site")
	public void update_weekly_flyer_changes_should_be_reflected_on_the_site() throws Exception {
		testContext.getPageObjectManager().getAEMFooterPage(PageObject.getDriver()).clickOnSignUpButton();
	}
	
	
}
