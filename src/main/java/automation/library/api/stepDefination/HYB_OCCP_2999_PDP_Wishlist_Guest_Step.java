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
	
	@Then("response should returned GUID") 
	public void response_should_returned_guid() {
		
		PageObject.notNullAttributeInResponse(guid);
		Log.message("Status Code:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedValue("201", Integer.toString(response.getStatusCode()));
		Log.message("guid:- " + guid, true);
		
		}
	
	@Then("user hits add product api for empty guid")
	public void user_hits_add_product_api_for_empty_guid() {
		
		response = wishListAPI().put_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), "");
		Log.message("response wishlist:- " + response, true);
		
	}
	
	@Then("should return 201 created")
	public void should_return_201_created() {
		
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedValue("201", Integer.toString(response.getStatusCode()));
	}
	
	@Then("should return 409 status code")
	public void should_return_409_status_code() {
		Log.message("Response:- " + response.getStatusCode(), true);
		PageObject.verifyExpectedValue("409", Integer.toString(response.getStatusCode()));
	}
	
	@And("user hits delete api for empty guid")
	public void user_hits_delete_api_for_empty_guid() {
		response = wishListAPI().delete_HYB_Add_Wishlist_API(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1614(), "");
	}
	
	
	
	
 
}