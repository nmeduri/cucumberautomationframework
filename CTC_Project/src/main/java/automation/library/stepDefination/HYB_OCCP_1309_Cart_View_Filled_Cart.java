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
 * This file contains the scenario of user stories OCCP-1309
 */
public class HYB_OCCP_1309_Cart_View_Filled_Cart extends BaseStep{
	RequestSpecification request;
	
	@Then("1309-guid is available in response JSON")
	public void response_should_have_guid_1309() {
		Assert.assertNotEquals(null, response.jsonPath().get("guid"));
		guid= response.jsonPath().get("guid").toString();
		Log.message("Guid is displayed in JSON response : "+ guid, true);
	}
	
	@When("3994-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3994() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("3994-user hits update Cart api for Anonymous user")
	public void user_Hits_Update_Cart_Api_Anonymous_3994() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("3994-user hits GET Cart api for Anonymous user")
	public void user_Hits_Get_Cart_Api_Anonymous_3994() {
		response = getAuthorizationUrl().get_Cart_API_AnonymousUser(url, guid);
		Log.message("GET Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("deliveryMode container is available in response")
	public void deliveryMode_Container_Is_Available_In_Response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("entry.deliveryMode"));
		Log.message("deliveryMode container :- " + response.jsonPath().get("entry.deliveryMode").toString(), true);
	}
	@And("deliveryMode code is available in deliveryMode container")
	public void deliveryMode_Code_Is_Available_In_DeliveryMode_Container() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("entry.deliveryMode.code"));
		Log.message("Code in deliveryMode container :- " + response.jsonPath().get("entry.deliveryMode.code").toString(), true);
	}
	@And("ship to home should be displayed")
	public void ship_To_Home_Should_Be_Displayed() {
		PageObject.verifyExpectedResponseWithoutList(response.jsonPath().get("entry.deliveryMode.name"),"Ship to home");
		Log.message("Name in deliveryMode container :- " + response.jsonPath().get("entry.deliveryMode.name").toString(), true);
	}
	@And("quantity should be displayed in update cart response")
	public void quantity_Should_Be_Displayed() {
		PageObject.notNullAttributeInResponseInInteger(response.jsonPath().get("entry.quantity"));
		Log.message("Quantity in deliveryMode container :- " + response.jsonPath().get("entry.quantity").toString(), true);
	}
	@Then("deliveryMode container is available in GET response")
	public void deliveryMode_Container_Is_Available_In_Get_Response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("entries.deliveryMode"));
		Log.message("deliveryMode 1 container :- " + response.jsonPath().get("entries.deliveryMode").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode"));
		Log.message("deliveryMode 2 container :- " + response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode").toString(), true);
	}
	@And("deliveryMode code is available in GET response")
	public void deliveryMode_Code_Is_Available_In_Get_Response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("entries.deliveryMode.code"));
		Log.message("Code1 in deliveryMode container :- " + response.jsonPath().get("entries.deliveryMode.code").toString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.code"));
		Log.message("Code2 in deliveryMode container :- " + response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.code").toString(), true);
	}
	@And("shiptohome should be displayed in Get Response")
	public void shipToHome_Should_Be_Displayed_In_Get_Response() {
		PageObject.verifyExpectedResponse(response.jsonPath().get("entries.deliveryMode.name"),"Ship to home");
		Log.message("Name1 in deliveryMode container :- " + response.jsonPath().get("entries.deliveryMode.name").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name"));
		//PageObject.verifyExpectedResponse(response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name"),"Ship to home");
		Log.message("Name2 in deliveryMode container :- " + response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name").toString(), true);
	}
	@And("quantity should be displayed in GET cart response")
	public void quantity_Should_Be_Displayed_In_Get_Cart_Response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("entries.quantity"));
		Log.message("Quantity1 in deliveryMode container :- " + response.jsonPath().get("entries.quantity").toString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("deliveryOrderGroups.entries.quantity"));
		Log.message("Quantity2 in deliveryMode container :- " + response.jsonPath().get("deliveryOrderGroups.entries.quantity").toString(), true);
	}
	@When("3999-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3999() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P2());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("3999-user hits update Cart api for Anonymous user")
	public void user_Hits_Update_Cart_Api_Anonymous_3999() {
		//url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAddToCartAPI_400Status());	
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_STH(getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAddToCartAPI_400Status()), guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P1());
		Log.message("Update Cart Response without base store id :- " + response.getBody().asString(), true);
	}
	@When("4000-user hits update Cart api for Anonymous user")
	public void user_Hits_Update_Cart_Api_Anonymous_4000() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_404NotFound(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P1());
		Log.message("404 Response :- " + response.getBody().asString(), true);
	}
	@When("hits add to Cart api for Anonymous user-BOPIS option")
	public void Hits_Add_To_Cart_Api_Anonymous_BOPIS_option() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@And("Pick Up Store should be displayed in Get Response")
	public void Pick_Up_Store_Should_Be_Displayed_In_Get_Response() {
		PageObject.verifyExpectedResponse(response.jsonPath().get("entries.deliveryMode.name"),"Pick Up Store");
		Log.message("Name1 in deliveryMode container :- " + response.jsonPath().get("entries.deliveryMode.name").toString(), true);
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name"));
		//PageObject.verifyExpectedResponse(response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name"),"Ship to home");
		Log.message("Name2 in deliveryMode container :- " + response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode.name").toString(), true);
	}
	@When("user hits update Cart api with base product for authenticated user-STH")
	public void user_Hits_Update_Cart_Api_With_Base_Product_Authenticated_STH() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),accessToken);
		Log.message("Update Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits add to Cart api with base product for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_With_Base_Product_Anonymous() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits add to Cart api with STH for authenticated user")
	public void user_Hits_Add_To_Cart_Api_with_STH_For_Authenticated() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("hits GET Cart api for authenticated user")
	public void user_Hits_Get_Cart_Api_Authenticated() {
		response = getAuthorizationUrl().get_Cart_API_Authenticated_User(url, code,accessToken);
		Log.message("GET Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits add to Cart api BOPIS for authenticated user")
	public void user_Hits_Add_To_Cart_Api_BOPIS_For_Authenticated_BOPIS() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("hits add to Cart api with base product for authenticated user")
	public void hits_Add_To_Cart_Api_With_Base_Product_authenticated() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415(),accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	@When("user hits update Cart api with base product for Anonymous user")
	public void user_Hits_Update_Cart_Api_With_Base_Product_Anonymous() {
		response = getAuthorizationUrl().patch_HYB_UpdateCart_AnonymousUserAPI_BOPIS(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1415());
		Log.message("Update Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("isServiceProduct should be displayed true or false")
	public void isServiceProduct_should_be_displayed_true_or_false() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("isServiceProduct").toString());
		if(response.jsonPath().get("isServiceProduct").toString().contains("false")||response.jsonPath().get("isServiceProduct").toString().contains("true")) {
			Log.message("isServiceProduct is displayed : " +response.jsonPath().get("isServiceProduct") ,true);
		}else
			Log.message("isServiceProduct is NOT displayed",true);
	}
	@When("user hits add to Cart DEAFULT api for Anonymous user")
	public void user_Hits_Add_To_Cart_DEAFULT_Api_Anonymous_() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUser_Default_API_(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Add to Cart Default Response:- " + response.getBody().asString(), true);
	}
	@When("user hits GET Cart DEFAULT api for Anonymous user")
	public void user_Hits_Get_Cart_DEFAULT_Api_Anonymous() {
		response = getAuthorizationUrl().get_Cart_API_AnonymousUser_Default(url, guid);
		Log.message("GET Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("Add deliveryPointOfService is available in json response")
	public void add_deliveryPointOfService_Is_Available_In_Response() {
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("pickupOrderGroups.deliveryPointOfService"));
	}
	@And("deliveryMode is available in json response")
	public void deliveryMode_Is_Available_In_Response() {
		PageObject.verifySectionValueResponseNotNull(response.jsonPath().get("deliveryOrderGroups.entries.deliveryMode"));
	}
}
