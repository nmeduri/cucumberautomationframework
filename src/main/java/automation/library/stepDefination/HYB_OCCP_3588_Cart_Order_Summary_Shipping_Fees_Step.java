package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
}
