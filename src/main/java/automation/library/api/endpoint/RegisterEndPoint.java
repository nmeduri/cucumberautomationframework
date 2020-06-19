package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.api.pojo.request.RegisterRequest;
import automation.library.api.pojo.response.RegisterResponse;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RegisterEndPoint {

	private static final String BASE_PATH = Route.Register();
	private static Response response;
	private static RequestSpecification request = RestAssured.given();
	
	public RegisterEndPoint(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        RestAssured.basePath = BASE_PATH;
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }

	public static IRestResponse<RegisterResponse> registerUser(RegisterRequest registerRequest) {

		
		response = request.body(registerRequest).post();
		return new RestResponse<RegisterResponse>(RegisterResponse.class, response);

	}

}
