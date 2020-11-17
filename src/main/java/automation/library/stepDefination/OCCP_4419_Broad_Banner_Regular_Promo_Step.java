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
public class OCCP_4419_Broad_Banner_Regular_Promo_Step extends BaseClass{
	

		public OCCP_4419_Broad_Banner_Regular_Promo_Step(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		@When ("aem author with access navigates to broad banner screen")
		public void AEM_broad_banner_url_is_available() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).navigateTo_Broad_Banner_Page_AEM();
		}
		@And ("click on Broad banner panel")
		public void click_broad_banner_component() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).clickBroadPromoTilesComponent();
		}
		@Then ("verify banner image field is authorable in Broad Banner component")
		public void Author_BannerImage_Field() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayBannerImageField();
		}
		@Then ("verify Alt text field is authorable in Broad Banner component")
		public void Author_ImageAltText_Field() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayBannerAltTextField();
		}
		@Then ("verify Image orientation field is authorable in Broad Banner component")
		public void Author_ImageOrientation_Field() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayImageOrientation();
		}
		@Then ("verify banner title field is authorable in Broad Banner component")
		public void Author_bannerTitle_Field() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayBannertitleField();
		}
		@And ("error message displayed when mandatory fields not entered")
		public void error_message_displayed_when_mandatory_fields_not_entered() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).clear_the_mandatory_field_and_click_on_done_button();
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayErrorImage();

		}
		@And ("Fill all the mandatory fields")
		public void Fill_all_the_mandatory_fields() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).updateBannerType();
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).updateFontColor();
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).updateBannerTitle();
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).updateBannerImageOrientation();
		}

		@Then ("the broad banner changes are updated on site")
		public void the_broad_banner_changes_updated_on_site() throws Exception {
			testContext.getPageObjectManager().getAEMBroadBannerPage(PageObject.getDriver()).displayUpdatedBroadBannerchanges();
		}
		@When ("Broad banner url is available")
		public void broad_banner_url_is_available() throws Exception {
			testContext.getPageObjectManager().getBroadBannerPage(PageObject.getDriver()).navigateTo_Broad_Banner_Page();
		}
		@Then ("broad banner image is displayed")
		public void broad_banner_image_is_displayed() throws Exception {
			testContext.getPageObjectManager().getBroadBannerPage(PageObject.getDriver()).displayBroadBannerImage();
		}
		@And ("broad banner title is displayed")
		public void broad_banner_Title_is_displayed() throws Exception {
			testContext.getPageObjectManager().getBroadBannerPage(PageObject.getDriver()).displayBroadBannerTitle();
		}
		@And ("broad banner description is displayed underneath the title")
		public void broad_banner_description_is_displayed() throws Exception {
			testContext.getPageObjectManager().getBroadBannerPage(PageObject.getDriver()).displayBroadBannerdescription();
		}
		@Then ("broad banner CTA is displayed at bottom")
		public void broad_banner_CTALink_is_displayed() throws Exception {
			testContext.getPageObjectManager().getBroadBannerPage(PageObject.getDriver()).displayBroadBanner_CTALink();
		}


}
