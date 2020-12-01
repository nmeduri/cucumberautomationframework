package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3111
 */
public class HYB_OCCP_3111_Cart_Add_to_Wishlist_Step extends BaseStep{
RequestSpecification request;
	
	@When("authenticated user hits add wishlist api")
	public void authenticated_user_hits_add_wishlist_api() {
	
		response = wishListAPI().put_HYB_Wishlist_API_AuthenticatedUser(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3123(),code,accessToken);
		//response = getAuthorizationUrl().put_HYB_Wishlist_API_AuthenticatedUser(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3123(),code,accessToken);
		Log.message("Add wishlist Response:- " + response.getBody().asString(), true);
		//guid = response.getBody().asString().substring(1, response.getBody().asString().length()-1);
		
	}
	@When("3123-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_for_authenticated_user_3123() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AuthUserAPI_BOPIS(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3123(), accessToken);
		Log.message("Add to Cart Response:- " + response.getBody().asString(), true);
	}
	
	@When("authenticated user hits get wishlist api")
	public void user_hits_get_wishlist_api() {
		response = wishListAPI().get_HYB_Wishlist_API_AuthenticatedUser(url, code, accessToken);
	}
	
	@Then("the JSON should return wishListData")
	public void the_JSON_Should_Return_WishListData() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("wishListData").toString());
		Log.message("wishListData :- "  + response.jsonPath().get("wishListData"), true);
	}
	
	@And("wishListData should have added product")
	public void wishListData_Should_Have_Added_Product() {
		String wishlist= response.jsonPath().get("wishListData.entries.productCode").toString().replace("[[", "");
		PageObject.verifyExpectedResponseWithoutList(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3123(),wishlist.replace("]]", ""));
		Log.message("wishListData should have recently added product:- "  + response.jsonPath().get("wishListData.entries.productCode").toString(), true);
	}
	
	@When("user hits delete wishlist api")
	public void user_hits_delete_wishlist_api() {
		response = getAuthorizationUrl().delete_HYB_Add_Wishlist_API(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3123());
	}
}
