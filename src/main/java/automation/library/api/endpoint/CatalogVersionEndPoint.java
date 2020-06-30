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

	
	private static Response response;
	private static RequestSpecification request = RestAssured.given();

	public CatalogVersionEndPoint(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        request = RestAssured.given();
        
    }

	public static IRestResponse<Catalog_BVT_Response> getCatalogVersionDetails() {

		response = request.get();
		Log.message("Response:- " + response.getBody().asString(), true);
		return new RestResponse<Catalog_BVT_Response>(Catalog_BVT_Response.class, response);

	}

}
