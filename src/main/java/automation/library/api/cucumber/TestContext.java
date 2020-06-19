package automation.library.api.cucumber;

import automation.library.api.endpoint.RegisterEndPoint;
import automation.library.api.endpoint.WeatherEndPoint;

public class TestContext {
	
	private String BASE_URL_WEATHER = "http://restapi.demoqa.com/utilities/weather/city";
	private String BASE_URL_REGISTER = "http://restapi.demoqa.com/customer";
	private WeatherEndPoint weatherEndPoints;
	private RegisterEndPoint registerEndPoints;
	
	public TestContext() {
		
		weatherEndPoints = new WeatherEndPoint(BASE_URL_WEATHER);
		registerEndPoints = new RegisterEndPoint(BASE_URL_REGISTER);
		
	}
	
	 public WeatherEndPoint getWeatherEndPoints() {
	        return weatherEndPoints;
	    }
	 
	 public RegisterEndPoint getRegisterEndPoints() {
		 return registerEndPoints;
	 }

}
