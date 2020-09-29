package automation.library.stepDefination;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1669
 */

public class HYB_OCCP_1669_PDP_Clearance_Price_Step extends BaseStep {
	RequestSpecification request;
	
	@When("user hits the GET method for clearance product has no variant section")
	public void user_hits_the_api_without_locale_for_clearance_product_has_no_variants() {
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1941());

	}
	
	@And("clearance Price is displayed")
	public void clearance_Price_is_displayed() {
		List<String> list= response.jsonPath().get("productPrices.ctcPriceType");
		Assert.assertTrue(list.contains("IN_STORE_CLEARANCE"));
	}
	
	@When("user hits the GET method for product has variant with same clearance prices")
	public void user_hits_the_GET_method_for_product_has_variant_with_same_clearance_prices() {	
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1942());

	}
	
	@When("user hits the GET method for product has variant with different clearance prices")
	public void user_hits_the_GET_method_for_product_has_variant_with_different_clearance_prices() {
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1943());

	}
	@Then("user should to see badges displayed under badges container")
	public void user_should_be_able_to_see_badges_displayed_under_badges_container() {

		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("badges"), "CLEARANCE");

	}
	/*@And("Verify price value are different")
	public void Verify_price_value_are_different() {
		List<String> list= response.jsonPath().get("productPrices.value");
		Assert.assertTrue(list.contains("IN_STORE_CLEARANCE"));
		List<String> prices = new ArrayList<String>();
		prices.add(driver.findElement(response.jsonPath().get("productPrices.value")).getText());
		
	}*/
	
}
