package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OCCP_1666_PLP_Filters_And_Facets_Availability_Facet_Step extends BaseClass {
	
	public OCCP_1666_PLP_Filters_And_Facets_Availability_Facet_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}

	@Then("the availability facet cta should be displayed in facet bar panel")
	public void availability_facet_cta_display() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayAvailabilityFacetCTA();
	}
	
	@And("click on the availability facet cta")
	public void click_on_availability_facet_cta() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnAvailabilityFacetCTA();
	}
	
	@Then("availability facet accordion should be displayed in facet panel modal")
	public void display_availability_facet_accordion() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayAvailabilityFacetAccordion();
	}
	
	@And("click on the availability accordion to expand")
	public void click_on_availability_facet_accordion() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnAvailabilityFacetAccordion();
	}
	
	@Then("user is able to see prepopulated facet values with results")
	public void user_sees_facet_values() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayFacetValues();
	}
	
	@And("verify horizontal facet bar is displayed above the results grid")
	public void display_facet_bar() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayFacetBar();
	}
	
	@And("online only should be displayed as a value")
	public void online_only_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayOnlineOnlyFacetValue();
	}
	
	@And("instore only should be displayed as another value")
	public void instore_only_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayInstoreOnlyFacetValue();
	}
	
	@And("checkmark the online only facet value")
	public void check_online_only_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnlineCheckbox();	
	}
	
	@And("click on facet modal view button")
	public void click_on_facet_modal_view_button() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnViewButton();
	}
	
	@Then("product list should be updated according to the selected online only facet value")
	public void product_list_should_be_updated() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyProductListUpdated();
	}
	
	@And("pill with online only facet value should get added on pill bar")
	public void pill_with_online_only_facet_value_should_get_added() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyAvailabilityOnlineOnlyFacetValueReflectedInPill();
	}
	
	@And("checkmark both the online only and instore only facet values")
	public void check_online_only_and_instore_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnlineAndInstoreCheckbox();	
	}
	
	@Then("product list should be updated according to the selected online only and instore facet values")
	public void product_list_should_be_updated_with_selected_data() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyProductListUpdatedForMultipleCheck();
	}
	
	@And("pill with online only and instore only facet values should get added on pill bar")
	public void pill_with_online_only_and_instore_only_facet_values_should_get_added() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyBothAvailabilityFacetValuesReflectedInPill();
	}
	
	@And("uncheck the instore only facet value")
	public void uncheck_instore_only_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).unCheckInstoreCheckbox();	
	}
	
	@And("pill with instore only facet value should get removed from the pill bar")
	public void pill_with_instore_only_facet_value_should_be_removed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).notDisplayInstoreOnlyInPillBar();	
	}
}
