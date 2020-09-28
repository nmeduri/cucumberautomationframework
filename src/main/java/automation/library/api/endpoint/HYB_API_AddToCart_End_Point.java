package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
 * This class calls the URL of Add to Cart APIs and
 * Execute the APIs method
 */

public class HYB_API_AddToCart_End_Point {
	private static String base_url;
	private static Response response;
	private static Response response1;
	
	public String HYB_AddToCart_API(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }
	
	public Response get_HYB_AddToCart_API(String url, String guid) {
		
		Log.message("Get Url:- " + url + "?guid=" +  guid , true);
		response = RestAssured.given().post(url + "?guid="+ guid);
		Log.message("Get Response:- " + response.getBody().asString(), true);
		return response;

	}
}
