package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class Catalogs_List_BVTStep extends BaseStep {

	RequestSpecification request;
	
	@Given("catalogs list url is available.")
	public void catalogs_list_url_is_available() {
		
		url = getCatalogsListEndPoint().catalogList(FileReaderManager.getInstance().getAPIDataReader().getCatalogsListAPI());
	}

	@When("user hits get catalog list API.")
	public void user_hits_get_catalog_list_api() {  
		
		response = getCatalogsListEndPoint().getCatalogsListDetails(url);
	}

	
	@Then("user gets the catalog list.")
	public void user_gets_the_catalog_list() {
		
		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());
	}

}
