package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class HYB_Api_Product_End_Point {

	private static Response response;
	private static String base_url;
	
	
	public static String HYB_Api_Product(String baseUrl) {
		
		base_url = baseUrl;
		return base_url;
	}

	public Response getApiProduct(String url, String sProductCode) {
		

		response = RestAssured.given().get(url +  sProductCode + "/1212?fields=FULL");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}