package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class HYB_API_FR_CA_End_Point {

	
	private static String base_url;
	private static Response response;
	
	
	public String HYB_API_FR_CA(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_FR_CA(String url, String sProductCode) {

		response = RestAssured.given().get(url +  sProductCode + "/1212?fields=FULL&lang=fr_ca");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
