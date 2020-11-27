package automation.library.stepDefination;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * This file contains the scenario of user stories OCCP-1561
 */

public class OCCP_1613_Filters_And_Facets_Dynamic_Facets_Step extends BaseClass {

	
	public OCCP_1613_Filters_And_Facets_Dynamic_Facets_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("^srp url is available$")
	public void plp_url_is_availabe() throws Exception {
		testContext.getPageObjectManager().getSRPPage(PageObject.getDriver()).navigateTo_SRP_Page();
	}
	
	@Then("verify the user is able to view the brand facet as generic facet")
	public void verify_the_user_is_able_to_view_the_brand_facet_as_generic_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayBrandFacetOption();
	}
	
	@And("verify the brand facet can be clicked to expand using plus icon")
	public void verify_the_brand_facet_can_be_clicked_to_expand_using_plus_icon() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnBrandOption();
	}
	
	@Then("brand facet value are displayed with the number of results")
	public void brand_facet_value_are_displayed_with_the_number_of_results() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayBrandFacetValuesWithNumberOfResult();
	}
	
	@And("click on see more")
	public void click_on_see_more() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickBrandShowMore();
	}
	
	@Then("remaining brands are displayed for the user to select")
	public void remaining_brands_are_displayed_for_the_user_to_select() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayRemainingItemsAreDisplayedOnShowMore();
	}
	
	@And("select a single brand from the facet value")
	public void select_a_single_brand_from_the_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickOnSingleCheckbox();
	}
	
	@Then("the number of matching single brand result is displayed")
	public void the_number_of_matching_single_brand_result_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedSingleBrandResultOnPLP();
	}
	
	@Then("indication of sucess is displayed for single brand item")
	public void indication_of_success_is_displayed_for_single_brand_item() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayIndicationSuccessForSingleBrand();
	}
	
	@And("select multiple brands from facet value")
	public void select_multiple_brands_from_facet_value() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).selecteMultipleBrands();
	}
	
	@Then("indication sign is disiplayed for multiple product")
	public void indication_sign_is_displayed_for_multiple_product() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayIndicationSuccessForMultipleBrand();
	}
	
	@Then("matching results are displayed for multiple selected brand")
	public void matching_results_are_displayed_for_multiple_selected_brand() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedMultipleBrandResultOnPLP();
	}
	
	@And("deselect brands from selection")
	public void deselect_brand_from_selection() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).deselectBrandFromSelection();
	}
	
	@Then("product results are refreshed")
	public void product_results_are_refreshed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyProductRefresh();
	}
	
	@And("click on clear all facet")
	public void click_on_clear_all_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickClearAllButtonFacet();
	}
	
	@Then("product result are refreshed")
	public void product_result_are_refreshed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyItemRemoved();
	}
}

