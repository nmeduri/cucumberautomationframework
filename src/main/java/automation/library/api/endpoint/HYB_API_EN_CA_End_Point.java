package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
 * This class calls the URL of Product Info EN CA's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 30/06/2020
 */

public class HYB_API_EN_CA_End_Point {

	
	private static String base_url;
	private static Response response;
	
	public String HYB_API_EN_CA(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_EN_CA(String sProductCode) {

		response = RestAssured.given().get(base_url + "/products/" +  sProductCode + "/363?fields=FULL&lang=en_ca");
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	
	public Response getAPI_EN_CAURL(String url, String sProductCode) {
        Log.message("API:- " + url + "/products/" +  sProductCode + "/1212?fields=FULL&lang=en_ca", true);
		response = RestAssured.given().get(url + "/products/" + sProductCode + "/363?fields=FULL&lang=en_ca");
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
