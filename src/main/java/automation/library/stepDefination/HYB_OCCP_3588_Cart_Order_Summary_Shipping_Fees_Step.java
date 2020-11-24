package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;


/**
 * This file contains the scenario of user stories OCCP-3588
 */

public class HYB_OCCP_3588_Cart_Order_Summary_Shipping_Fees_Step extends BaseStep{
	RequestSpecification request;
	
	@When("user hits add to Cart api with base product STH for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_With_Base_Product_STH_Anonymous() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api with base product STH for Anonymous user")
	public void user_Hits_Update_Cart_Api_With_Base_Product_STH_Anonymous() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());
		Log.message("Update Cart Response:- " + response.getBody().asString(), true);
	}
	@When("hits add to Cart api with base product STH for authenticated user")
	public void hits_Add_To_Cart_Api_With_Base_Product_STH_authenticated() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api with base product BOPIS for authenticated user")
	public void user_Hits_Update_Cart_Api_With_Base_Product_BOPIS_Authenticated() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),accessToken);
		Log.message("Update Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("Delivery cost should be displayed in GET cart response")
	public void deliveryCost_Container_Is_Available_In_deliveryMode_container() {	
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryMode.deliveryCost.formattedValue"));
		Log.message("deliveryCost is displayed :- " + response.jsonPath().get("deliveryMode.deliveryCost.formattedValue").toString(), true);
	}
	@Then("Delivery cost should displayed in GET cart response for BOPIS")
	public void delivery_cost_should_displayed_in_GET_cart_response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryMode.deliveryCost.formattedValue"));
		Log.message("deliveryCost is displayed :- " + response.jsonPath().get("deliveryMode.deliveryCost.formattedValue").toString(), true);
		response.jsonPath().get("deliveryMode.deliveryCost.formattedValue").toString().contains("0.00");
	}
	@When("user hits update Cart api BOPIS for Anonymous user-variant Product")
	public void user_Hits_Update_Cart_Api_BOPIS_Anonymous_Variant_Product() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api STH for Authenticated user-variant Product")
	public void user_Hits_Update_Cart_Api_STH_Authenticated_Variant_Product() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api BOPIS for Authenticated user-variant Product")
	public void user_Hits_Update_Cart_Api_BOPIS_Authenticated_Variant_Product() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("hits add to Cart api for Anonymous user standalone product-BOPIS option")
	public void Hits_Add_To_Cart_Api_Anonymous_Standalone_Product_BOPIS_option() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4152());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("hits add to Cart api for Authenticated user standalone product-BOPIS option")
	public void Hits_Add_To_Cart_Api_Authenticated_Standalone_Product_BOPIS_option() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4152(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("deliveryMode BOPIS is available in json response")
	public void deliveryMode_BOPIS_Is_Available_In_Response() {
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("cartModifications.entry.deliveryMode.code"));
		PageObject.verifyExpectedResponseWithoutList("[BOPIS]", response.jsonPath().get("cartModifications.entry.deliveryMode.code").toString());
		Log.message("deliveryMode BOPIS Response:- " + response.jsonPath().get("cartModifications.entry.deliveryMode.code").toString(), true);
	}
}
