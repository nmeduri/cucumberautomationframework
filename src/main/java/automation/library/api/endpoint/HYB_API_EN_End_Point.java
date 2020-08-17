package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
 * This class calls the URL of Product Info EN's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 30/06/2020
 */

public class HYB_API_EN_End_Point {

	
	private static String base_url;
	private static Response response;
	
	
	public String HYB_API_EN(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_EN(String url, String sProductCode) {

		Log.message("url:- " + url + "/products/" +  sProductCode + "/1212?fields=FULL&lang=en", true);
		response = RestAssured.given().get(url + "/products/" +  sProductCode + "/363?fields=FULL&lang=en");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	
	public Response get_Design_Outbound_API_EN(String url) {

		Log.message("url:- " + url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=DEFAULT", true);
		response = RestAssured.given().get(url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=DEFAULT");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
