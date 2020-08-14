package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CTBVTEndPoint {

	private static String base_url;
	private static Response response;

	public String CT_BVT(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getCTBVTDetails(String url) {

		Log.message("URL:- " + url, true);
		response = RestAssured.given().get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
