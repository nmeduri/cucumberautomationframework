package automation.library.api.stepDefination;

import automation.library.api.cucumber.TestContext;
import automation.library.api.endpoint.RegisterEndPoint;
import automation.library.api.endpoint.WeatherEndPoint;

public class BaseStep {

	private String BASE_URL_WEATHER = "http://restapi.demoqa.com/utilities/weather/city";
	private String BASE_URL_REGISTER = "http://restapi.demoqa.com/customer";

	private WeatherEndPoint weatherEndPoint;
	private RegisterEndPoint registerEndPoint;

	public BaseStep(TestContext testContext) {
		weatherEndPoint = testContext.getWeatherEndPoints();
		registerEndPoint = testContext.getRegisterEndPoints();
	}
	
	public WeatherEndPoint getWeatherEndPoint() {
		return weatherEndPoint;
	}
	
	public RegisterEndPoint getRegisterEndPoint() {
		return registerEndPoint;
	}

}
