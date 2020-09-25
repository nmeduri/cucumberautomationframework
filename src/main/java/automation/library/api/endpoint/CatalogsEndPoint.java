package automation.library.api.endpoint;


import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of Catalog's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 24/06/2020
 */

public class CatalogsEndPoint {

	
	private static String base_url;
	private static Response response;

	public String catalogs(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }
	
	public Response getCatalogDetails(String url) {

		Log.message("URL:- " + url, true);
		response = RestAssured.given().get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
