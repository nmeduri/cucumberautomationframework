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
 * This file contains the scenario of user stories OCCP-3082
 */
public class OCCP_3082_Featured_List_Product_List_Authorable_Step extends BaseClass{

	public OCCP_3082_Featured_List_Product_List_Authorable_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("product featured list page url is available") 
	public void featured_list_page_url_is_available() throws Exception {
		
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).navigateTo_Featured_List_Product_List_Page();
	}
	@When("product featured list page is displayed")
	public void product_featured_list_page_is_displayed() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).display_Product_Featured_List_Page();
	}
	@And("user should be able to see product featured list component on the page")
	public void user_should_be_able_to_see_product_featured_list_component_on_the_page() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).dispalyProductFeaturedListComponent();
	}
	@When("click on Product Card")
	public void click_on_product_card() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnProductCard();
	}
	@When("The destination URL is auto populated based on the product code entered by user")
	public void destination_URL_is_auto_populated_based_on_the_pcode_entered_by_user() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyDestinationURLIsAutoPopulatedBasedOnTheProductCode();
	}
	@When("click on the Product Card mobile")
	public void click_on_the_product_card_mobile() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickOnProductCardMobile();
	}
	
}
