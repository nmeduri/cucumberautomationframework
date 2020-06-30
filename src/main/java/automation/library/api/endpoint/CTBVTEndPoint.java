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

	
	private static Response response;
	private static RequestSpecification request = RestAssured.given();

	public CTBVTEndPoint(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        request = RestAssured.given();
        
    }

	public static IRestResponse<CTBVT_Response> getCTBVTDetails() {

		response = request.get();
		Log.message("Response:- " + response.getBody().asString(), true);
		return new RestResponse<CTBVT_Response>(CTBVT_Response.class, response);

	}

}
