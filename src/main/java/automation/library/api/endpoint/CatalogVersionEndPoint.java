package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CatalogVersionEndPoint {

	
	private static String base_url;
	private static Response response;

	public String catalogVersion(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getCatalogVersionDetails(String url) {

		response = RestAssured.given().get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
