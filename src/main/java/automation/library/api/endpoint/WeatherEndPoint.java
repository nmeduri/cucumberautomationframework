package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.api.pojo.response.WeatherResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WeatherEndPoint {

	private static final String BASE_PATH = Route.Location();
	private static Response response;
	private static RequestSpecification request = RestAssured.given();

	public WeatherEndPoint(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        RestAssured.basePath = BASE_PATH;
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }

	public static IRestResponse<WeatherResponse> getWeatherDetails() {

		response = request.get();
		return new RestResponse<WeatherResponse>(WeatherResponse.class, response);

	}

}
