package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


/*
 * This class calls the URL of Catalog List's APIs and
 * Execute the APIs method
 * 
 * @author Shashank Bansal
 * @date 24/06/2020
 */

public class CatalogsListEndPoint {

	
	private static String base_url;
	private static Response response;

	public String catalogList(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getCatalogsListDetails(String url) {

		response = RestAssured.given().get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;
	}

}
