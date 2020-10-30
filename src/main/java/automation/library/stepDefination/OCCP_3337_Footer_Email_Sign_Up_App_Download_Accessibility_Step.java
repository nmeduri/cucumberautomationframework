package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of the Footer
 */
public class OCCP_3337_Footer_Email_Sign_Up_App_Download_Accessibility_Step extends BaseClass{
	public OCCP_3337_Footer_Email_Sign_Up_App_Download_Accessibility_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("footer links section should be displayed")
	public void click_on_account_from_the_header() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayFooterLinksSection();
	}
	
	@And("click on Android App store logo")
	public void click_on_android_app_store_logo() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).clickOnAndroidAppStoreLogo();
	}
	
	@And("should redirected to a new tab opens with details on App store download")
	public void should_redirected_to_a_new_tab_opens_with_details_on_App_store_download() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).displayGoogleAppStoreDownload();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	@Then("link should be underlined when hovers over any link on the footer links section")
	public void link_should_be_underlined_when_hovers_over_any_link_on_the_footer_links_section() throws Exception {
		testContext.getPageObjectManager().getFooterPage(PageObject.getDriver()).verifyHoverOnAnyFooterLink();
	}

}
