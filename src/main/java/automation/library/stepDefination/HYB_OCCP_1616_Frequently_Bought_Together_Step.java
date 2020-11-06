
package automation.library.stepDefination;
import org.junit.Assert;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1616
 */
public class HYB_OCCP_1616_Frequently_Bought_Together_Step extends BaseStep{
	RequestSpecification request;
	
	@Given("Guest user create cart access token is available")
	public void access_token_is_available_for_create_cart() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getCreteCart_GuestUser_API());		
	}
	
	@Given("Registered user create cart access token is available")
	public void access_token_is_available_for_create_cart_RegUser() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getCreateCart_RegisteredUser_API());	
	}
	
	@When("user hits the POST api for create cart")
	public void user_hits_the_api_for_create_cart() {
		Log.message("Token No 1: "+accessToken, true);
		response = getAuthorizationUrl().get_Create_Cart_AuthUser_Post_API(url, accessToken);
		
	}
	@When("guest user hits the POST api for create cart")
	public void user_hits_the_api_for_create_cart_guest() {
		//Log.message("Token No 1: "+accessToken, true);
		response = getAuthorizationUrl().get_Createcart_GuestUser_Post_API(url);
		
	}
	@Then("response JSON should have created cart")
	public void response_should_have_created_cart() {
		
		PageObject.notNullAttributeInResponse(response.jsonPath().get("type"));	
		//Log.message("Rsp"+response.jsonPath().get("carts"),true);
		Log.message("Cart is created in JSON response.", true);
	}
	
	@Then("response JSON should have code")
	public void response_should_have_code() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("code"));
		Log.message("Cart is created so'code' is displayed in JSON response :"+response.jsonPath().get("code"), true);
		code= response.jsonPath().get("code").toString();
	}
	
	@Then("response JSON should have guid")
	public void response_should_have_guid() {
		Assert.assertNotEquals(null, response.jsonPath().get("guid"));
		Log.message("Section 'guid' is displayed in JSON response.", true);
	}
	
	@When("user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2167(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2167_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@When("Authenticated user Add to cart api")
	public void authenticated_user_Add_to_cart_api() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAddToCartInformationAPI());	
	}
	
	@When("Status 403 Authenticated user Add to cart access token is available")
	public void authenticated_user_Add_to_cart_access_token_is_available_status_403() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getInvalidAddToCartInformationAPI());	
	}
	
	@When("user hits invalid token")
	public void user_hits_inavlid_token() {
		response = getAuthorizationUrl().get_Addtocart_Put_API(url, FileReaderManager.getInstance().getAPIDataReader().getInvalidToken());
	}
	@When("400 status code when user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_400_Status_Code() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2174(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2167_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Given("404 status code when user hits add to Cart api")
	public void authenticated_user_Add_to_cart_api_404() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAddToCartInformationAPI_404());	
	}
	@When("2169-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_2169() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI_SingleProd(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("2169-user hits GET Cart api for Anonymous user")
	public void user_Hits_Get_Cart_Api_Anonymous_2169() {
		response = getAuthorizationUrl().get_Cart_API_AnonymousUser(url, guid);
		Log.message("GET Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("recently added product code is available in GET cart response")
	public void product_Code_Is_Available_In_Get__Cart_Response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryOrderGroups.entries"));
		Assert.assertNotEquals(null,response.jsonPath().get("deliveryOrderGroups.entries.ctcProduct.code"));
		Log.message("Get Cart product :- " + response.jsonPath().get("deliveryOrderGroups.entries.ctcProduct.code").toString(), true);
		String actualprodcut= response.jsonPath().get("deliveryOrderGroups.entries.ctcProduct.code").toString();
		actualprodcut.contains(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169());
		//Assert.assertEquals(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(),response.jsonPath().get("deliveryOrderGroups.entries.ctcProduct.code").toString());
	}
	@When("2172-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_2172() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI_SingleProd(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("2172-user hits GET Cart api for authenticated user")
	public void user_Hits_Get_Cart_Api_Authenticated_2172() {
		response = getAuthorizationUrl().get_Cart_API_Authenticated_User(url, code,accessToken);
		Log.message("GET Cart Response:- " + response.getBody().asString(), true);
	}
	@Then("recently added product code is available in GET cart authenticateduser response")
	public void product_Code_Is_Available_In_Get__Cart_Authenticated_User_Response() {	
		Assert.assertNotEquals(null,response.jsonPath().get("entries"));
		Assert.assertNotEquals(null,response.jsonPath().get("entries.ctcProduct.code"));
		Log.message("Get Cart product :- " + response.jsonPath().get("entries.ctcProduct.code").toString(), true);
		String actualprodcut= response.jsonPath().get("entries.ctcProduct.code").toString();
		actualprodcut.contains(FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2169());
	}
	@When("user hits api for base product with no variants to Cart for authenticated user")
	public void user_hits_api_for_base_product_with_no_variants_to_cart_for_authenticated_user() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI_SingleProd(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2171(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	
	
}
