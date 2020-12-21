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
 * This file contains the scenario of user stories OCCP-3775
 */

public class OCCP_3775_Category_Landing_Page_AEM_Template_Step extends BaseClass{

	public OCCP_3775_Category_Landing_Page_AEM_Template_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@When ("AEM author with access to category Landing authorable page")
	public void aem_author_with_access_to_Microseason_Landing_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMMicroseasonLandingPage(PageObject.getDriver()).navigate_To_category_Landing_Page_Url();
	}
	@Then ("validate different components are preconfigured on category landing page")
	public void validate_different_components_are_preconfigured_on_microseason_landing_page() throws Exception {
		//testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getStandardMastheadBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getSlimBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getRecommendation();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getFeaturedList2();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getFeaturedList1();
	//	testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getDynamicCategoryFeatureList2();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getDynamicCategoryFeatureList();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getFeaturedProductList();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getBroadBanner();
		testContext.getPageObjectManager().getAEMMicroseasonLandingPageLocator().getSEOcopyblock();

	}
}