package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3755
 */
public class HYB_OCCP_3755_Fulfillment_Option_Display_For_STH_BOPIS_Both_Step extends BaseStep{
	RequestSpecification request;
	
	@When("^update cart api with deliveryAddress with postal code for Authenticated user$")
	public void update_cart_api_with_deliveryAddress_with_postal_code_for_Authenticated_user() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().get_Update_Cart_API_With_DeliveryAddress_PostalCode_Auth_User());	
	}
	
	@When("^user hits update Cart api with deliveryAddress with postal code for authenticated user$")
	public void user_Hits_update_cart_api_with_deliveryAddress_with_postal_code_for_authenticated() {
		response = getAuthorizationUrl().post_HYB_Update_Cart_AuthUserAPI_With_DeliveryAddress_PostalCode(url, code,accessToken);
		Log.message("Update Cart with delivery address Response:- " + response.getBody().asString(), true);
	}
	@And("^response JSON should have deliveryAddress with postal code$")
	public void response_JSON_should_have_deliveryAddress_with_postal_code() {
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryAddress"));
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryAddress.defaultAddress"));
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryAddress.postalCode"));
		Log.message("postalCode :- " + response.jsonPath().get("deliveryAddress.postalCode").toString(), true);
	}
	@When("^update cart api with deliveryAddress and postal code for Anonymous user$")
	public void update_cart_api_with_deliveryAddress_and_postal_code_for_Anonymous_user() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().get_Update_Cart_API_With_DeliveryAddress_PostalCode_Guest_User());	
	}
	@When("^user hits update Cart api with deliveryAddress with postal code for Anonymous user$")
	public void user_Hits_update_cart_api_with_deliveryAddress_with_postal_code_for_Anonymous() {
		response = getAuthorizationUrl().post_HYB_Update_Cart_GuestUserAPI_With_DeliveryAddress_PostalCode(url, guid);
		Log.message("Update Cart with delivery address Response:- " + response.getBody().asString(), true);
	}
	@And("^response JSON should have deliveryPointOfService details under pickupOrderGroups for that entry$")
	public void response_JSON_should_have_deliveryPointOfService_details_under_pickupOrderGroups() {
		Assert.assertNotEquals(null,response.jsonPath().get("pickupOrderGroups.entries.deliveryPointOfService"));
		Assert.assertNotEquals(null,response.jsonPath().get("pickupOrderGroups.entries.deliveryPointOfService.address"));
	}
	
}
