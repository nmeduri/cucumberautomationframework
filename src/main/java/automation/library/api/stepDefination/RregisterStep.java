package automation.library.api.stepDefination;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.pojo.request.RegisterRequest;
import automation.library.api.pojo.response.RegisterResponse;
import automation.library.logdetail.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class RregisterStep extends BaseStep {

	RequestSpecification request;
	IRestResponse<RegisterResponse> registerResponse;

	public RregisterStep(TestContext testContext) {
		super(testContext);
	}

	@Given("User hit Registration's API.")
	public void user_hit_Registration_s_API() {

	}

	@SuppressWarnings("static-access")
	@When("User enter personal Details.")
	public void user_enter_personal_Details() {

		RegisterRequest registerStep = new RegisterRequest("zlduanusdixishasstsNLNKL",
				"zlumShoikpianuNLNKL", "zlanuTkeyvdsxtsssL1g2d3NLKL", "zlumanuidsdsosypskitx@1234",
				"zluananuyikpvgdsxdi2ssd3HKLs@gmail.com");

		registerResponse = getRegisterEndPoint().registerUser(registerStep);
	}

	@Then("User get th results.")
	public void user_get_th_results() {

		Log.message("Message:- " + registerResponse.getStatusDescription(), true);
		Log.message("Status Code:- " + registerResponse.getStatusCode(), true);
		Log.message("JSON Response Content:- " + registerResponse.getContent(), true);
		Log.message("Success Code:- " + registerResponse.getbody().SuccessCode, true);
	}

}
