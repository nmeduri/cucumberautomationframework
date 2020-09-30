
package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of Product Info's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 03/07/2020
 */

public class HYB_Api_Product_End_Point {

	private static Response response;
	private static String base_url;
	private RequestSpecification request = RestAssured.given();
	
	
	public static String HYB_Api_Product(String baseUrl) {
		
		base_url = baseUrl;
		return base_url;
	}

	public Response getApiProduct(String url, String sProductCode) {
		
        Log.message("API:- " + url + "/products/" +  sProductCode + "/363?fields=FULL&baseStoreId=ctr", true);
		response = RestAssured.given().get(url + "/products/" +  sProductCode + "/363?fields=FULL&baseStoreId=ctr");
        
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}

}
