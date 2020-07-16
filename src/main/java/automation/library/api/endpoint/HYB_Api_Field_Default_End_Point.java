package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class HYB_Api_Field_Default_End_Point {

	private static Response response;
	private static String base_url;
	
	
	public static String HYB_Api_Field_Default(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public static Response getAPI_Field_Default(String sProductCode) {
		
		response = RestAssured.given().get(base_url  + sProductCode + "?fields=DEFAULT");
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
