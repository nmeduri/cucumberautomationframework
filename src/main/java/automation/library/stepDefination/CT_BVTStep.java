package automation.library.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.CTBVTEndPoint;
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

public class CT_BVTStep extends BaseStep {

	
	RequestSpecification request;

	@Given("Health check url is available.")
	public void health_check_url_is_available() {
		
		url = getCTBVTEndPoint().CT_BVT(FileReaderManager.getInstance().getAPIDataReader().getBaseBVT());
	}

	@When("User hits the BVT api.")
	public void user_hits_the_bvt_api() {     

		response = getCTBVTEndPoint().getCTBVTDetails(url);
	}

	
	@Then("User get the API Response.")
	public void user_get_the_api_response() {
		
		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());
		Log.message("defaultLanaguage Active:- " + 	response.jsonPath().getList("baseSites.defaultLanguage.active"), true);
	}

}
