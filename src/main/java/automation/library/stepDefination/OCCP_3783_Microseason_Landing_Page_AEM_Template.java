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
 * This file contains the scenario of user stories OCCP-3783
 */

public class OCCP_3783_Microseason_Landing_Page_AEM_Template extends BaseClass{

	public OCCP_3783_Microseason_Landing_Page_AEM_Template(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@When ("AEM author with access to Microseason Landing authorable page")
	public void aem_author_with_access_to_Microseason_Landing_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPage(PageObject.getDriver()).navigate_To_Microseason_Landing_Page_Url();
	}
	@Then ("validate different components are preconfigured on microseason landing page")
	public void validate_different_components_are_preconfigured_on_microseason_landing_page() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getStandardMastheadBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getSlimBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getRecommendation();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getFeaturedList2();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getFeaturedList1();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getDynamicCategoryFeatureList2();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getDynamicCategoryFeatureList();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getBroadPromoTiles();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getBroadBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getAuthoredTextBlock();

	}
	@And("click on Banner selector component")
	public void click_on_Banner_selector_component() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPage(PageObject.getDriver()).click_bannerSelector_component();
	}
	@And ("select edge to edge as banner type")
	public void select_edge_to_edge_banner_type() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPage(PageObject.getDriver()).select_edgetoedge_bannertype();
	}
	@And ("validate the Standard Masthead should be replaced with the authored Edge to Edge banner")
	public void validate_the_Standard_Masthead_should_be_replaced_with_the_authored_Edge_to_Edge_banner() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getEdgeToEdgeBannerdisplayed();
	}

}