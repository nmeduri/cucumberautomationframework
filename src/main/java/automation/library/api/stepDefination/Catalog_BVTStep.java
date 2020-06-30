package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.logdetail.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class Catalog_BVTStep extends BaseStep {


	IRestResponse<Catalog_BVT_Response> catalogbvtResponse;
	RequestSpecification request;
	
	public Catalog_BVTStep(TestContext testContext) {
		super(testContext);
	}


	@Given("catalog API is available.")
	public void catalog_api_is_available() {
		
		
	}

	@SuppressWarnings("static-access")
	@When("user hits the get catalog api.")
	public void user_hits_the_get_catalog_api() {     

		catalogbvtResponse = getCatalogEndPoint().getCatalogDetails();
		
	}

	
	@Then("user gets the catalog API response.")
	public void user_gets_the_catalog_api_response() {
		
		Log.message("Status Code:- " + catalogbvtResponse.getStatusCode(), true);		
		Assert.assertEquals(200, catalogbvtResponse.getStatusCode());
	}

}
