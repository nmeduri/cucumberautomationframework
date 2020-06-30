package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.endpoint.CatalogVersionEndPoint;
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

public class Catalog_Version_BVTStep extends BaseStep {


	IRestResponse<Catalog_BVT_Response> catalogVersionResponse;
	RequestSpecification request;
	
	public Catalog_Version_BVTStep(TestContext testContext) {
		super(testContext);
	}


	@Given("catalog version API is available")
	public void catalog_version_api_is_available() {
		
		
	}

	@SuppressWarnings("static-access")
	@When("user hits the get catalog version api.")
	public void user_hits_the_catalog_version_api() {     

		catalogVersionResponse = getCatalogVersionEndPoint().getCatalogVersionDetails();
		
	}

	
	@Then("user gets the catalog version API response.")
	public void user_gets_the_catalog_version_api_response() {
		
		Log.message("Status Code:- " + catalogVersionResponse.getStatusCode(), true);		
		//Assert.assertEquals(200, catalogVersionResponse.getStatusCode());
	}

}
