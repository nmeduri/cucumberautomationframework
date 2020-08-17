package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.CatalogVersionEndPoint;
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

public class Catalog_Version_BVTStep extends BaseStep {

	RequestSpecification request;


	@Given("catalog version API is available.")
	public void catalog_version_api_is_available() {
		
		url = getCatalogVersionEndPoint().catalogVersion(FileReaderManager.getInstance().getAPIDataReader().getCatalogVersionAPI());
	}

	
	@When("user hits the get catalog version api.")
	public void user_hits_the_catalog_version_api() {     

		response = getCatalogVersionEndPoint().getCatalogVersionDetails(url);
		
	}

	
	@Then("user gets the catalog version API response.")
	public void user_gets_the_catalog_version_api_response() {

		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());

	}

}
