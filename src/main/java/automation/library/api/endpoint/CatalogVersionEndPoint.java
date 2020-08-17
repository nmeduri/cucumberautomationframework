package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of BVT's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 26/06/2020
 */

public class CatalogVersionEndPoint {

	
	private static String base_url;
	private static Response response;

	public String catalogVersion(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getCatalogVersionDetails(String url) {

		Log.message("URL:- " + url, true);
		response = RestAssured.given().get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
