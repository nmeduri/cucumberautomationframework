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

public class OCCP_1612_Filters_And_Facets_Price_Step extends BaseClass {

	
	public OCCP_1612_Filters_And_Facets_Price_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("the user views the price facet as generic facet on the panel")
	public void the_user_views_the_price_facet_as_generic_facet_on_the_panel() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayPriceFacet();
	}
	
	@Then("the price facet can be clicked to collapse and open using plus icon")
	public void the_price_facet_can_be_clicked_to_collapse_and_open_using_plus_icon() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickPricePlusIcon();
	}
	
	@Then("user is able to enter mininum price")
	public void user_is_able_to_enter_minimum_price() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMinimumPriceFacetValue();
	}
	
	@Then("user is able to enter maximum price")
	public void user_is_able_to_enter_maximum_price() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMaximumPriceFacetValue();
	}
	
	@Then("the number of price matching product result is displayed")
	public void the_number_of_price_matching_product_result_is_displayed() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedSinglePriceResultOnPLP();
	}
	
	@Then("product result refreshed abiding to the price range entered and preselected the other filter option")
	public void product_result_refreshed_abiding_to_the_price_range_entered_and_preselected_the_other_filter_option() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyPriceFilterOptionSelected();
	}
	
	@And("click on view facet button")
	public void clickOnViewFacetButton() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickViewButton();
	}
	
	@And("click on checkbox price filter")
	public void click_on_checkonbx_price_filter() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickPriceFilterCheckbox();
	}
	
	@Then("the selected price range is on pill")
	public void the_selected_price_range_is_on_pill() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displaySelectedPriceRangeResultOnPLP();
	}
	
	@And("enter minimum price more than maximum")
	public void enter_minimum_price_more_than_maximum() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMinimumPriceMoreThanMaximum();
	}
	
	@Then("error is displayed when enter minimum price more than maximum") 
	public void error_is_displayed_when_enter_minimum_price_more_than_maximukm() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).displayErrorMessageMinimumPriceMoreThanMaximum();
	}
	
	@And("enter only minimum price in the range")
	public void enter_only_minimum_price_tn_the_range() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMinimumPriceInTheRange();
	}
	
	@Then("pill is added above the range and more result")
	public void pill_is_added_above_the_range_and_more_result() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyAddedAboveRangeAndMore();
	}
	
	@And("enter only maximum price in the range")
	public void enter_only_maximum_price_in_the_range() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMinimumPriceInTheBelowRange();
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).enterMaximumPriceInBelowRange();
	}
	
	@Then("pill is added the range as '0-123'")
	public void pill_is_added_the_range_as_0_123() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).verifyTheResultAs0Between123();
	}
	
	@And("update the min max price label")
	public void update_the_min_max_price_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterMinPriceLabelDetails();
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterMaxPriceLabelDetails();
	}
	
	@And("revert the min max price label")
	public void revert_the_min_max_price_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertMinPriceLabelDetails();
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertMaxPriceLabelDetails();
	}
	
	@Then("min price and max price changes are update on site")
	public void min_price_and_max_price_changes_are_update_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyMinMaxPriceLabelUpdateOnSite();
	}
	
	@And("update the label for the price facet")
	public void update_the_label_for_the_price_facet() throws Exception {
		
	}
	
	@And("update the content error message regarding the price facet values")
	public void update_the_content_error_message_regarding_the_price_facet_values() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).enterErrorMessageDetailsForPrice();
	}
	
	@And("revert the content error message regarding the price facet values")
	public void revert_the_content_error_message_regarding_the_price_facet_values() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertErrorMessageDetailsForPrice();
	}
	
	@Then("error message changes are reflect on site")
	public void error_message_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyEUpdateOnSite();
	}
}

