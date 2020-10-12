
package automation.library.stepDefination;
import org.junit.Assert;

/**
 * This file contains the scenario of user stories OCCP-1616
 */
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
		response = getAuthorizationUrl().get_Addtocart_Post_API(url, accessToken);
		
	}
	@When("guest user hits the POST api for create cart")
	public void user_hits_the_api_for_create_cart_guest() {
		//Log.message("Token No 1: "+accessToken, true);
		response = getAuthorizationUrl().get_Addtocart_GuestUser_Post_API(url);
		
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

}
