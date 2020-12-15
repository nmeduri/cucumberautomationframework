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
 * This file contains the scenario of user stories OCCP-1272
 */
public class HYB_OCCP_1272_Cart_Bulk_Items_Delivery_Options_Step extends BaseStep{
	RequestSpecification request;
	
	@When("^user hits add to Cart api for Anonymous user with POS$")
	public void user_Hits_Add_To_Cart_Api_Anonymous_with_POS() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH_With_POS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6250());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@When("^user hits update Cart api for Anonymous user with POS$")
	public void user_Hits_Update_Cart_Api_Anonymous_with_POS() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH_With_POS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6250());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("^anonymous user hits update cart api with CurbSide white glove delivery option$")
	public void anonymous_user_update_cart_Api_with_CurbSide_white_glove_delivery_option() {		
		response = getAuthorizationUrl().post_Update_Cart_API_AnonymousUser_CurbSide_Delivery_Option(url, guid);
	}
	@And("^CURBSIDE should be displayed in GET cart response$")
	public void curbSide_should_be_displayed_in_GET_cart_response() {
		PageObject.verifyExpectedResponseWithoutList("CURBSIDE", response.jsonPath().get("whiteGloveServiceType"));
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("whiteGloveServiceType"), true);
	}
	@Then("deliveryCost should be displayed in GET cart response")
	public void deliveryCost_should_be_displayed_in_GET_cart_response() {	
		PageObject.notNullAttributeInResponse(response.jsonPath().get("deliveryCost.value").toString());
		deliverycost= response.jsonPath().get("deliveryCost.value").toString().replace("[", "").replace("]", "");
		Log.message("basedeliveryCost :- " + deliverycost, true);
	}
	@Then("^updated deliveryCost should displayed in GET cart response with CurbSide delivery option$")
	public void updated_deliveryCost_should_displayed_in_GET_cart_response() {	
		PageObject.notNullAttributeInResponse(response.jsonPath().get("deliveryCost.value").toString());

		String updatedDeliveryCost=response.jsonPath().get("deliveryCost.value").toString().replace("[", "").replace("]", "");
		double actualUpdatedDeliveryCost = Double.parseDouble(updatedDeliveryCost);
		Log.message("actualUpdatedDeliveryCost :- " +actualUpdatedDeliveryCost, true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.curbsideWhiteGloveFee").toString());
		String curbsideWhiteGloveFee=response.jsonPath().get("storeWhiteGloveFee.curbsideWhiteGloveFee").toString().replace("[", "").replace("]", "");
		Log.message("curbsideWhiteGloveFee :- " + curbsideWhiteGloveFee, true);
		double curbSideWhiteGloveFee = Double.parseDouble(curbsideWhiteGloveFee);
		double expectedlDeliveryCost = Double.parseDouble(deliverycost)+curbSideWhiteGloveFee;
		Log.message("expectedlDeliveryCost :- " +expectedlDeliveryCost, true);
		Assert.assertEquals(expectedlDeliveryCost, actualUpdatedDeliveryCost,expectedlDeliveryCost);
	}
	@When("^anonymous user hits update cart api with IN_HOME_DELIVERY white glove delivery option$")
	public void anonymous_user_update_cart_Api_with_IN_HOME_DELIVERY_white_glove_delivery_option() {		
		response = getAuthorizationUrl().post_Update_Cart_API_AnonymousUser_IN_HOME_DELIVERY_Option(url, guid);
	}
	@And("^IN_HOME_DELIVERY should be displayed in GET cart response$")
	public void IN_HOME_DELIVERY_should_be_displayed_in_GET_cart_response() {
		PageObject.verifyExpectedResponseWithoutList("IN_HOME_DELIVERY", response.jsonPath().get("whiteGloveServiceType"));
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("whiteGloveServiceType"), true);
	}
	@Then("^updated deliveryCost should displayed in GET cart response with IN_HOME_DELIVERY delivery option$")
	public void updated_deliveryCost_should_displayed_in_GET_cart_response_IN_HOME_DELIVERY() {	
		Log.message("basedeliveryCost :- " + deliverycost, true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("deliveryCost.value").toString());

		String updatedDeliveryCost=response.jsonPath().get("deliveryCost.value").toString().replace("[", "").replace("]", "");
		double actualUpdatedDeliveryCost = Double.parseDouble(updatedDeliveryCost);
		Log.message("actualUpdatedDeliveryCost :- " +actualUpdatedDeliveryCost, true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryWhiteGloveFee").toString());
		String curbsideWhiteGloveFee=response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryWhiteGloveFee").toString().replace("[", "").replace("]", "");
		Log.message("curbsideWhiteGloveFee :- " + curbsideWhiteGloveFee, true);
		double curbSideWhiteGloveFee = Double.parseDouble(curbsideWhiteGloveFee);
		double expectedlDeliveryCost = Double.parseDouble(deliverycost)+curbSideWhiteGloveFee;
		Log.message("expectedlDeliveryCost :- " +expectedlDeliveryCost, true);
		Assert.assertEquals(expectedlDeliveryCost, actualUpdatedDeliveryCost,expectedlDeliveryCost);
	}
	@When("^anonymous user hits update cart api with IN_HOME_DELIVERY_PACKAGING_REMOVAL white glove delivery option$")
	public void anonymous_user_update_cart_Api_with_IN_HOME_DELIVERY_PACKAGING_REMOVAL_white_glove_delivery_option() {		
		response = getAuthorizationUrl().post_Update_Cart_API_AnonymousUser_IN_HOME_DELIVERY_PACKAGING_REMOVAL_Option(url, guid);
	}
	@And("^IN_HOME_DELIVERY_PACKAGING_REMOVAL should be displayed in GET cart response$")
	public void IN_HOME_DELIVERY_PACKAGING_REMOVAL_should_be_displayed_in_GET_cart_response() {
		PageObject.verifyExpectedResponseWithoutList("IN_HOME_DELIVERY_PACKAGING_REMOVAL", response.jsonPath().get("whiteGloveServiceType"));
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("whiteGloveServiceType"), true);
	}
	@Then("^updated deliveryCost should displayed in GET cart response with IN_HOME_DELIVERY_PACKAGING_REMOVAL delivery option$")
	public void updated_deliveryCost_should_displayed_in_GET_cart_response_IN_HOME_DELIVERY_PACKAGING_REMOVAL() {	
		Log.message("basedeliveryCost :- " + deliverycost, true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("deliveryCost.value").toString());

		String updatedDeliveryCost=response.jsonPath().get("deliveryCost.value").toString().replace("[", "").replace("]", "");
		double actualUpdatedDeliveryCost = Double.parseDouble(updatedDeliveryCost);
		Log.message("actualUpdatedDeliveryCost :- " +actualUpdatedDeliveryCost, true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryPackagingRemovalWhiteGloveFee").toString());
		String curbsideWhiteGloveFee=response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryPackagingRemovalWhiteGloveFee").toString().replace("[", "").replace("]", "");
		Log.message("curbsideWhiteGloveFee :- " + curbsideWhiteGloveFee, true);
		double curbSideWhiteGloveFee = Double.parseDouble(curbsideWhiteGloveFee);
		double expectedlDeliveryCost = Double.parseDouble(deliverycost)+curbSideWhiteGloveFee;
		Log.message("expectedlDeliveryCost :- " +expectedlDeliveryCost, true);
		Assert.assertEquals(expectedlDeliveryCost, actualUpdatedDeliveryCost,expectedlDeliveryCost);
	}
	
	@And("^storeWhiteGloveFee section with values should be displayed in GET cart response$")
	public void storeWhiteGloveFee_section_with_values_should_be_displayed_in_GET_cart_response() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee").toString());
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("storeWhiteGloveFee."), true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.curbsideWhiteGloveFee").toString());
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryPackagingRemovalWhiteGloveFee").toString());
		PageObject.notNullAttributeInResponse(response.jsonPath().get("storeWhiteGloveFee.inHomeDeliveryWhiteGloveFee").toString());
	}
	@When("^user hits add to Cart api for Anonymous user with BOPIS POS$")
	public void user_Hits_Add_To_Cart_Api_Anonymous_with_BOPIS_POS() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6250());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("^user hits update Cart api for Anonymous user with BOPIS POS$")
	public void user_Hits_Update_Cart_Api_Anonymous_with_BOPIS_POS() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6250());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("^whiteGloveServiceType should not displayed in GET cart response$")
	public void whiteGloveServiceType_should_not_displayed_in_GET_cart_response() {
		PageObject.verifyExpectedResponseWithoutList(null, response.jsonPath().get("whiteGloveServiceType"));
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("whiteGloveServiceType"), true);
	}
	@And("^WhiteGloveServiceType should not be updated in GET cart response$")
	public void WhiteGloveServiceType_should_not_be_updated_in_GET_cart_response() {
		PageObject.verifyExpectedResponseWithoutList("IN_HOME_DELIVERY_PACKAGING_REMOVAL", response.jsonPath().get("whiteGloveServiceType"));
		Log.message("whiteGloveServiceType :- " + response.jsonPath().get("whiteGloveServiceType"), true);
		Assert.assertNotEquals("CURBSIDE", response.jsonPath().get("whiteGloveServiceType"));
	}
}
