package automation.library.api.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
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

public class HYB_OCCP_2999_PDP_Wishlist_Guest_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits add wishlist api")
	public void user_hits_add_wishlist_api() {

		
		response = wishListAPI().put_HYB_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1613());
		Log.message("Response:- " + response.getBody().asString(), true);
		guid = response.getBody().asString().substring(1, response.getBody().asString().length()-1);
		
	}
	
	@When("user hits get wishlist api")
	public void user_hits_get_wishlist_api() {
		response = wishListAPI().get_HYB_Wishlist_API(url, guid);
	}
	
	@Then("response should returned GUID") 
	public void response_should_returned_guid() {
		
		PageObject.notNullAttributeInResponse(guid);
		Log.message("Status Code:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("201", Integer.toString(response.getStatusCode()));
		Log.message("guid:- " + guid, true);
		
		}
	
	@When("user hits add product api for empty guid")
	public void user_hits_add_product_api_for_empty_guid() {
		
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), "");
		
	}
	
	@When("user hit add product api for guid")
	public void user_hit_add_product_api_for_guid() {
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), guid);
		Log.message("response wishlist:- " + response, true);

	}
	
	@When("user hit add variant product api for guid")
	public void user_hit_add_variant_product_api_for_guid() {
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), guid);
		Log.message("response wishlist:- " + response, true);

	}
	
	@When("user hit add base product api for guid")
	public void user_hit_add_base_product_api_for_guid() {
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1709(), guid);
		Log.message("response wishlist:- " + response, true);

	}
	
	@When("user hit api add base product that have variant to wishlist guid")
	public void user_hit_add_base_product_that_have_variant_to_wishlist_guid() {
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1710(), guid);
	}
	
	@Then("should return 201 created")
	public void should_return_201_created() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("201", Integer.toString(response.getStatusCode()));
	}
	
	@Then("should return 200 created")
	public void should_return_200_created() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("200", Integer.toString(response.getStatusCode()));
	}
	
	@Then("should return 409 status code")
	public void should_return_409_status_code() {
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedResponseWithoutList("409", Integer.toString(response.getStatusCode()));
	}
	
	@Then("should return error message")
	public void should_return_error_message() {
		
		PageObject.verifyExpectedResponse(response.jsonPath().get("errors.type"), "AlreadyExistsError");
	}
	
	@Then("returned JSON should have wishListData")
	public void returned_should_have_wishListData() {
		
		Log.message("Response Wishlist:- " +response.getBody().asString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("wishListData"));
		
	}
	
	
	@And("user hits delete api for empty guid")
	public void user_hits_delete_api_for_empty_guid() {
		response = wishListAPI().delete_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), "");
	}
	

	@And("user hits delete api for guid")
	public void user_hits_delete_api_for_guid() {
		response = wishListAPI().delete_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), guid);
	}
	
	
	
	@And("wishListData container should have entries container")
	public void wishlistData_container_should_have_entries_container() {
		
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("wishListData.entries"));
		
	}
	
	@And("entries container should have rating section")
	public void entries_container_should_have_rating_section() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.rating").toString().replace("[", "").replace("]", ""));
		
	}
	
	@And("entries container should have container availableAction")
	public void entries_container_should_have_container_availableAction() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.availableActions").toString().replace("[", "").replace("]", ""));
		
	}
	
	@And("entries container should have section externalmedia")
	public void entries_container_should_have_section_externalmedia() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.externalMedia").toString().replace("[", "").replace("]", ""));
		
	}
	
	@Then("entries contains productCode")
	public void entries_contains_productCode() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.productCode").toString().replace("[", "").replace("]", ""));		
	}
	
	@Then("entries should have name")
	public void entries_should_have_name() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.name").toString().replace("[", "").replace("]", ""));		
	}
	
	@Then("entries should have addedDate")
	public void entries_contains_addedDate() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.addedDate").toString().replace("[", "").replace("]", ""));		
	}
	
	@Then("entries should have productStatus")
	public void entries_contains_productStatus() {
		
		PageObject.verifyNotExpectedValue("null", response.jsonPath().get("wishListData.entries.productStatus").toString().replace("[", "").replace("]", ""));		
	}
	
	@Then("user should not able to the base product which has variant to the wishlist")
	public void user_should_not_able_to_the_base_product_which_has_variant_to_the_wishlist() {
		
		PageObject.verifyExpectedResponseWithoutList("Base product "+ FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1710() +" with variants cannot be added to wish list", response.jsonPath().get("errors.message").toString().replace("[", "").replace("]", ""));
	}
	
	
 
}
