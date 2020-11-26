package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of the user stories OCCP-3881 
 */
public class OCCP_4418_Slim_Banner_RegularorPromo_Step extends BaseClass{
	

		public OCCP_4418_Slim_Banner_RegularorPromo_Step(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		@When ("aem author with access navigates to slim banner screen")
		public void AEM_slim_banner_url_is_available() throws Exception {
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).navigateTo_Slim_banner_Page();
		}
		@And ("click on Slim banner panel")
		public void click_slim_banner_component() throws Exception {
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).click_on_Slim_banner_Page();
		}
		@And ("verify error message in slim banner page when mandatory fields are not entered and click on save")
		public void verify_error_message_in_slim_banner_page_when_mandatory_fields_are_not_entered_and_click_on_save() throws Exception {
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).dontFillmandatoryFieldandsave();
		}
		@And ("author the mandatory fields in slim banner page")
		public void author_the_mandatory_fields_in_slim_banner_page() throws Exception {
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).updateBannerTitleLabel();
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).updateBannerDescLabel();
			testContext.getPageObjectManager().getAEMSlimBannerPage(PageObject.getDriver()).updateBannerTypeLabel();

		}
		@Then ("validate the changes are updated on slim banner site")
		public void validate_the_changes_are_updated_on_slim_banner_site() throws Exception {
			testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getSlimBannerTitleonsite();
		}


}