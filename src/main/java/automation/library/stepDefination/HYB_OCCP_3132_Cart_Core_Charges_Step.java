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
 * This file contains the scenario of user stories OCCP-3132
 */
public class HYB_OCCP_3132_Cart_Core_Charges_Step extends BaseStep{

	RequestSpecification request;

	@When("^user hits add to Cart api for Anonymous user variant product$")
	public void user_hits_add_to_cart_api_for_anonymous_user_variant_product() {
		//response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826_P2());
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("^product is added to cart should be displayed in the JSON response$")
	public void product_is_added_to_cart_should_be_displayed_in_the_JSON_response() {
		Assert.assertNotEquals(null,response.jsonPath().get("cartModifications.entry.ctcProduct"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.code"));
		Log.message("product Code in add to cart response :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.code").toString(), true);

	}
	@And("^baseCoreCharges and total prices should be displayed in the JSON response$")
	public void baseCoreCharges_and_total_prices_should_be_displayed_in_the_JSON_response() {
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("cartModifications.entry.baseCoreCharges"));

		String baseCrCharges=response.jsonPath().get("cartModifications.entry.baseCoreCharges").toString().replace("[", "").replace("]", "");
		Log.message("baseCoreCharges :- " + baseCrCharges, true);
		double baseCoreCharges = Double.parseDouble(baseCrCharges);
		String qty=response.jsonPath().get("cartModifications.entry.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("cartModifications.entry.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("cartModifications.entry.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity)+baseCoreCharges;
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("cartModifications.entry.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);

		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);

	}
	@Then("^cart entries should created with Anonymous user details in GET cart response$")
	public void cart_entries_should_created_with_Anonymous_user_details_in_GET_cart_response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("entries"));
		Assert.assertNotEquals(null,response.jsonPath().get("entries.ctcProduct.code"));
		Log.message("Get Cart product :- " + response.jsonPath().get("entries.ctcProduct.code").toString(), true);
		String actualprodcut= response.jsonPath().get("entries.ctcProduct.code").toString();
		actualprodcut.contains(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826());	
	}
	@And("^baseCoreCharges and total prices should be displayed in GET cart JSON response$")
	public void baseCoreCharges_and_total_prices_should_be_displayed_in_GET_JSON_response() {
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("entries.baseCoreCharges"));

		String baseCrCharges=response.jsonPath().get("entries.baseCoreCharges").toString().replace("[", "").replace("]", "");
		Log.message("baseCoreCharges :- " + baseCrCharges, true);
		double baseCoreCharges = Double.parseDouble(baseCrCharges);
		String qty=response.jsonPath().get("entries.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("entries.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("entries.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity)+baseCoreCharges;
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("entries.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);
		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);
	}
	@When("^4826-user hits update Cart api for Anonymous user$")
	public void user_Hits_Update_Cart_Api_Anonymous_4826() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("^baseCoreCharges and total prices should be displayed in update cart JSON response$")
	public void baseCoreCharges_and_total_prices_should_be_displayed_in_update_cart_JSON_response() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("entry.baseCoreCharges").toString());

		String baseCrCharges=response.jsonPath().get("entry.baseCoreCharges").toString().replace("[", "").replace("]", "");
		Log.message("baseCoreCharges :- " + baseCrCharges, true);
		double baseCoreCharges = Double.parseDouble(baseCrCharges);
		String qty=response.jsonPath().get("entry.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("entry.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("entry.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity)+baseCoreCharges;
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("entry.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);
		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);
	}
	
	@When("^user hits add to Cart api for Anonymous user variant product With out core charges$")
	public void user_hits_add_to_cart_api_for_anonymous_user_variant_product_Without_core_charges() {
		//response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4826_P2());
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4827());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("^baseCoreCharges should not displayed in the Add to cart JSON response$")
	public void baseCoreCharges_should_not_displayed_in_the_JSON_response() {
		PageObject.verifyExpectedResponseWithoutList("0.0", response.jsonPath().get("cartModifications.entry.baseCoreCharges").toString().replace("[", "").replace("]",""));

		Log.message("baseCoreCharges :- " + response.jsonPath().get("cartModifications.entry.baseCoreCharges").toString(), true);
		
		String qty=response.jsonPath().get("cartModifications.entry.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("cartModifications.entry.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("cartModifications.entry.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity);
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("cartModifications.entry.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);
		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);
	}
	@And("^baseCoreCharges should not displayed in GET cart JSON response$")
	public void baseCoreCharges_should_not_displayed_in_GET_JSON_response() {
		PageObject.verifyExpectedResponseWithoutList("0.0",response.jsonPath().get("entries.baseCoreCharges").toString().replace("[", "").replace("]",""));
		Log.message("baseCoreCharges :- " + response.jsonPath().get("entries.baseCoreCharges").toString(), true);
		
		String qty=response.jsonPath().get("entries.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("entries.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("entries.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity);
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("entries.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);
		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);
	}
	@And("^baseCoreCharges should not displayed in update cart JSON response$")
	public void baseCoreCharges_should_not_displayed_in_update_cart_JSON_response() {
		PageObject.verifyExpectedResponseWithoutList("0.0", response.jsonPath().get("entry.baseCoreCharges").toString().replace("[", "").replace("]",""));
		Log.message("baseCoreCharges :- " + response.jsonPath().get("entry.baseCoreCharges").toString(), true);
		
		String qty=response.jsonPath().get("entry.quantity").toString().replace("[", "").replace("]", "");
		int quantity = Integer.parseInt(qty);	
		Log.message("quantity :- " + response.jsonPath().get("entry.quantity")+ "-" +quantity, true);
		String basePrice=response.jsonPath().get("entry.basePrice.value").toString().replace("[", "").replace("]", "");
		double expectedlTotalPrice = (Double.parseDouble(basePrice)*quantity);
		Log.message("Expected Total Price :- " +expectedlTotalPrice, true);
		String totalPrice=response.jsonPath().get("entry.totalPrice.value").toString().replace("[", "").replace("]", "");
		double actualTotalPrice = Double.parseDouble(totalPrice);
		Log.message("Actual Total Price :- " +actualTotalPrice, true);
		Assert.assertEquals(expectedlTotalPrice, actualTotalPrice,expectedlTotalPrice);
	}
	@When("^4827-user hits update Cart api for Anonymous user$")
	public void user_Hits_Update_Cart_Api_Anonymous_4827() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4827());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^hits add to Cart api with STH for authenticated user variant Product without core charges$")
	public void hits_Add_To_Cart_Api_with_STH_For_Authenticated_variant_Product_without_core_charges() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4827(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api STH for Authenticated user- variant Product without core charges")
	public void user_Hits_Update_Cart_Api_STH_Authenticated_Variant_Product_without_core_charges() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4827(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits update Cart api for Anonymous user products that don’t have variants$")
	public void user_Hits_Update_Cart_Api_Anonymous_4828() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4682());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits update Cart api STH for Authenticated user product that don’t have variants$")
	public void user_Hits_Update_Cart_Api_STH_Authenticated_product_that_dont_have_variants() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4682(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits add to Cart api for Anonymous user product do not have variants without core charges$")
	public void user_hits_add_to_cart_api_for_anonymous_user_product_do_not_have_variants_without_core_charges() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4829());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits update Cart api for Anonymous user product do not have variants without core charges$")
	public void user_Hits_Update_Cart_Api_Anonymous_product_do_not_have_variants_without_core_charges() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4829());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^hits add to Cart api with STH for authenticated user do not have variants without core charges$")
	public void hits_Add_To_Cart_Api_with_STH_For_Authenticated_do_not_have_variants_without_core_charges() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4829(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits update Cart api STH for Authenticated user do not have variants without core charges$")
	public void user_Hits_Update_Cart_Api_STH_Authenticated_do_not_have_variants_without_core_charges() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_4829(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
}

