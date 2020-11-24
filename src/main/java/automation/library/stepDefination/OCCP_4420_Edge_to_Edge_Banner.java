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
 * This file contains the scenario of the user stories OCCP-4420
 */
public class OCCP_4420_Edge_to_Edge_Banner extends BaseClass{
	

		public OCCP_4420_Edge_to_Edge_Banner(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		@When ("aem author with access navigates to edge to edge banner screen")
		public void AEM_edgetoedge_banner_url_is_available() throws Exception {
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).navigate_To_EdgeToEdge_Banner_Page();
		}
		@And ("click on edge to edge banner panel")
		public void click_edgeToEdge_banner_component() throws Exception {
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).click_EdgeToEdge_Banner_Component();
		}
		@Then ("verify Error when mandatory field are not entered")
		public void verify_Error_when_mandatory_field_are_not_entered() throws Exception {
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).DontFillEdgetoEdgeBannermandatoryfieldAndSave();
		}
		@Then ("configure all the mandatory edge to edge banner field")
		public void configure_all_the_mandatory_edgetoedge_banner_Field() throws Exception {
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).updateEdgetoEdgeBannerTitle();
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).updateEdgetoEdgeBannerDesc();
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).updateEdgetoEdgeBannerAltText();
			testContext.getPageObjectManager().getAEMEdgeToEdgeBannerPage(PageObject.getDriver()).updateEdgetoEdgeBannerFontColor();
		}

@Then ("validate the Edge to Edge Banner changes are updated on site")
public void validate_the_Edge_to_Edge_Banner_changes_are_updated_on_site() throws Exception {
	testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerTitle();
	testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerDescription();
	testContext.getPageObjectManager().getBannerPages(PageObject.getDriver()).displayEdgeBannerImage();
}


}