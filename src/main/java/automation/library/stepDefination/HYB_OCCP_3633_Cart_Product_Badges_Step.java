package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3633
 */
public class HYB_OCCP_3633_Cart_Product_Badges_Step extends BaseStep{
	RequestSpecification request;
	
	@Then("all the product Badges should be displayed")
	public void all_the_product_Badges_should_be_displayed() {

		Log.message("Response badge:- "  + response.jsonPath().get("pickupOrderGroups.entries.badges"), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("pickupOrderGroups.entries.badges"));

	}
	@When("user hits multiple products adding to Cart api for authenticated user")
	public void user_hits_multiple_products_adding_to_cart_api_for_authenticated_user() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("multiple products adding to Cart api for guest user")
	public void multiple_products_adding_to_cart_api_for_guest_user() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2188());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
