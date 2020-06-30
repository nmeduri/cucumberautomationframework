package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.pojo.response.CTBVT_Response;
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

public class CT_BVTStep extends BaseStep {

	IRestResponse<CTBVT_Response> ctbvtResponse;
	RequestSpecification request;
	
	public CT_BVTStep(TestContext testContext) {
		super(testContext);
	}


	@Given("Health check url is available.")
	public void health_check_url_is_available() {
		
		
	}

	@SuppressWarnings("static-access")
	@When("User hits the BVT api.")
	public void user_hits_the_bvt_api() {     

		ctbvtResponse = getCTBVTEndPoint().getCTBVTDetails();
	}

	
	@Then("User get the API Response.")
	public void user_get_the_api_response() {
		
		Log.message("Status Code:- " + ctbvtResponse.getStatusCode(), true);		
		Assert.assertEquals(200, ctbvtResponse.getStatusCode());
	}

}
