package automation.library.api.stepDefination;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.endpoint.WeatherEndPoint;
import automation.library.api.pojo.response.WeatherResponse;
import automation.library.logdetail.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class WeatherStep extends BaseStep {

	
	IRestResponse<WeatherResponse> weatherResponse;
	RequestSpecification request;
	private WeatherEndPoint weatherEndPoint;
	
	public WeatherStep(TestContext testContext) {
		super(testContext);
	}


	@Given("Weather url is available.")
	public void weather_url_is_available() {
		
		
	}

	@SuppressWarnings("static-access")
	@When("User hit the weather api.")
	public void user_hit_the_weather_api() {

		weatherResponse = getWeatherEndPoint().getWeatherDetails();
		
		

	}

	
	@Then("User get the results.")
	public void user_get_the_results() {
		
		Log.message("Weather City:- " + weatherResponse.getbody().City, true);
		Log.message("Response:- " + weatherResponse.getStatusCode(), true);
	}

}
