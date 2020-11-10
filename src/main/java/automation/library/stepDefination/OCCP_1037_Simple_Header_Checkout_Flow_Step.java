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
 * This file contains the scenario of Simple Header Checkout Page
 */

public class OCCP_1037_Simple_Header_Checkout_Flow_Step extends BaseClass{
	
	public OCCP_1037_Simple_Header_Checkout_Flow_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("checkout url is available")
	public void checkout_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).navigateTo_Checkout_Page();
		
	}
	@When("checkout page is displayed")
	public void checkout_page_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).display_Checkout_Page_Title();
	}
	@Then("brand logo should be displayed")
	public void brand_logo_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayBrandLogo();
	}
	@And("contact number of customer service should be displayed")
	public void contact_number_of_customer_service_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displayCustomerServiceContactNumber();
	}
	@And("site language selector should be displayed")
	public void site_language_selector_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).displaySiteLanguageSelector();
	}
	@When("click on brand logo")
	public void click_on_brand_logo() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).click_On_Brand_Logo();
	}
	@Then("user should be taken to the home page")
	public void user_should_be_taken_to_the_home_page() throws Exception {
		testContext.getPageObjectManager().getCheckoutPage(PageObject.getDriver()).display_Home_Page();;
	}
	@When("AEM author with access to configure simple header checkout component")
	public void aem_author_with_access_to_configure_simple_header_checkout_component() throws Exception {
		testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPage(PageObject.getDriver()).navigateTo_Simple_Header_Checkout_Page();
	}
	@And("click on simple header checkout component")
	public void click_on_simple_header_checkout_component() throws Exception {
		testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPage(PageObject.getDriver()).clickSimpleHeaderCheckoutComponent();
	}
	@And("update the customer service label details")
	public void update_the_customer_service_label_details() throws Exception {
		testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPage(PageObject.getDriver()).enterCustomerServerLabelDetails();
	}
	@And("update the contact number label details")
	public void update_the_contact_number_label_details() throws Exception {
		testContext.getPageObjectManager().getAEMSimpleHeaderCheckoutFlowPage(PageObject.getDriver()).enterCustomerServerContactNumberDetails();
	}
	
}
