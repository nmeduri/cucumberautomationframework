package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1306
 */

public class HYB_OCCP_1306_Cart_Order_Summary_Step extends BaseStep {
	RequestSpecification request;
	
	@When("5117-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_5117() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5117());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@Then("taxes and taxlines should be displayed")
	public void taxes_and_taxlines_should_be_displayed() {	
		Assert.assertNotEquals(null,response.jsonPath().get("taxLines"));
		Log.message("taxLines container :- " + response.jsonPath().get("taxLines").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("taxLines.taxName"));
		Assert.assertNotEquals(null,response.jsonPath().get("taxLines.taxValue"));
		Assert.assertNotEquals(null,response.jsonPath().get("taxLines.taxValue.value"));
		Assert.assertNotEquals(null,response.jsonPath().get("totalPriceWithTax"));
		Log.message("totalPriceWithTax container :- " + response.jsonPath().get("totalPriceWithTax").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("totalPriceWithTax.formattedValue"));
		Assert.assertNotEquals(null,response.jsonPath().get("totalPriceWithTax.priceType"));
		Assert.assertNotEquals(null,response.jsonPath().get("totalTax"));
		Log.message("totalTax container :- " + response.jsonPath().get("totalTax").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("totalTax.formattedValue"));
		Assert.assertNotEquals(null,response.jsonPath().get("totalTax.priceType"));
		Assert.assertNotEquals(null,response.jsonPath().get("pickupOrderGroups"));
		Log.message("pickupOrderGroups container with taxes :- " + response.jsonPath().get("pickupOrderGroups").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("pickupOrderGroups.entries"));
		Assert.assertNotEquals(null,response.jsonPath().get("totalTax.priceType"));
	}
}
