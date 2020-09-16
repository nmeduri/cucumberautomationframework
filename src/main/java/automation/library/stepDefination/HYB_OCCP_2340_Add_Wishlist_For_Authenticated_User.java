package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class HYB_OCCP_2340_Add_Wishlist_For_Authenticated_User extends BaseStep {

	RequestSpecification request;
	
	@When("user hits add product api for authenticated user")
	public void user_hits_add_product_api() {
		
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614());
		
	}
	
	@When("user hits get api for authenticated user")
	public void user_hits_get_api_for_authenticated_user() {
		response = getAuthorizationUrl().get_Wishlist_API(url, accessToken);
	}
	
	@When("user hits get api for unauthenticated user")
	public void user_hits_get_api_for_unauthenticated_user() {
		response = getAuthorizationUrl().get_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().getInvalidToken());
	}
	
	@When("user hits the wishlist api for authenticated user")
	public void user_hits_the_wishlist_api() {

		
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614());
		
	}
	
	@When("user add invalid product to the wishlist")
	public void user_add_invalid_product_to_the_wishlist() {
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1717());
	}
	
	@When("user add base proudct which has variant to the wishlist")
	public void user_add_product_which_has_variant_to_the_wishlist() {
		
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1710());
	}
	
	@When("user hit add variant product api for authenticated user")
	public void user_hit_add_variant_product_api_for_authenticated_user() {
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1715());
	}
	
	@When("user access the invalid token")
	public void user_access_the_invalid_token() {
		response = getAuthorizationUrl().getAPI_Field_Default(url, FileReaderManager.getInstance().getAPIDataReader().getInvalidToken() , FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1717());
	}
	
	@When("user hits delete api for unauthorized token")
	public void user_hits_delete_api_for_unauthorized_token() {
		response = getAuthorizationUrl().delete_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().getInvalidToken(), FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614());
	}
	
	@When("user hits delete api for not found status")
	public void user_hits_delete_api_for_not_found_status() {
		response = getAuthorizationUrl().delete_HYB_Add_Wishlist_API(url, accessToken, "");
	}
	
	@When("user hits get api for not found status")
	public void user_hits_get_api_for_not_found_status() {
		response = getAuthorizationUrl().get_Wishlist_API(url + "/Product", accessToken);
	}
	
	@When("user access invalid wishlist api")
	public void user_access_invalid_wishlist_api() {
		response = getAuthorizationUrl().getAPI_Field_Default(FileReaderManager.getInstance().getAPIDataReader().getProductInfoInvalidAuthorizationUser(), accessToken , FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1715());
	}
	
	@When("user hits not found api")
	public void user_hits_not_found_api() {
		response = getAuthorizationUrl().getAPI_Field_Default(url, accessToken, "");
	}
	
	@Then("should return 400 bad request")
	public void should_return_400_bad_request() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("400", Integer.toString(response.getStatusCode()));
	}
	

	@Then("should return 409 conflict")
	public void should_return_409_conflict() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("409", Integer.toString(response.getStatusCode()));

	}
	
	@Then("should return 403_forbidden")
	public void should_return_403_forbidden() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("403", Integer.toString(response.getStatusCode()));
	}
	
	@Then("should return 404 not found")
	public void should_return_404_not_found() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("404", Integer.toString(response.getStatusCode()));
	}
	
	@And("user hits delete api for authentication user")
	public void user_hits_delete_api_for_authentication_user() {
		
		response = getAuthorizationUrl().delete_HYB_Add_Wishlist_API(url, accessToken, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614());
		
	}
	
	
 
}
