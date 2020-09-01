package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
 * This class calls the URL of Product Info Default locale's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 01/07/2020
 */

public class HYB_Api_Field_Default_End_Point {

	private static Response response;
	private static String base_url;
	
	
	public String HYB_Api_Field_Default(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_Field_Default(String url, String sProductCode) {
		Log.message("URL:- " + url + "/products/"  + sProductCode + "/363?fields=DEFAULT", true);
		response = RestAssured.given().get(url + "/products/"  + sProductCode + "/363?fields=DEFAULT&baseStoreId=ctr");
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
