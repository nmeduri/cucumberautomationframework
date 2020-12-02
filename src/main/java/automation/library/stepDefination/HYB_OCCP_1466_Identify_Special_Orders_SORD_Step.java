package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1466
 */
public class HYB_OCCP_1466_Identify_Special_Orders_SORD_Step extends BaseStep{
	RequestSpecification request;
	
	@When("4678-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_4678() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_STH(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5117());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Then("isSpecialOrder is true and status is Under Review in response")
	public void isSpecialOrder_is_true_and_status_is_Under_Review_in_response() {
		Assert.assertNotEquals(null,response.jsonPath().get("isSpecialOrder"));
		PageObject.verifyExpectedResponseWithoutList("true", response.jsonPath().get("isSpecialOrder").toString());
		Assert.assertNotEquals(null,response.jsonPath().get("cartModifications.entry.status"));
		PageObject.verifyExpectedResponseWithoutList("[UNDER_REVIEW]", response.jsonPath().get("cartModifications.entry.status").toString());
	}
	@Then("isSpecialOrder is True and status is Under Review should be displayed in GET response")
	public void isSpecialOrder_is_true_and_status_is_Under_Review_should_be_displayed_in_GET_response() {
		Assert.assertNotEquals(null,response.jsonPath().get("isSpecialOrder"));
		PageObject.verifyExpectedResponseWithoutList("true", response.jsonPath().get("isSpecialOrder").toString());
		Assert.assertNotEquals(null,response.jsonPath().get("entries.status"));
		PageObject.verifyExpectedResponseWithoutList("[UNDER_REVIEW]", response.jsonPath().get("entries.status").toString());
	}
	@When("4679-user hits add to Cart api for Authenticated user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_4679() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_STH(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5117(),accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("4680-user hits add to Cart api with base product for Anonymous user")
	public void user_hits_Add_to_Cart_api_with_base_product_for_Anonymous_user_Tc_4680() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1476(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("4681-user hits add to Cart api with base product for Authenticated user")
	public void user_hits_Add_to_Cart_api_with_base_product_for_Authenticated_user_Tc_4681() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1476(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3994(),accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
