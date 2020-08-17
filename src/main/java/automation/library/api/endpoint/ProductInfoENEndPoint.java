package automation.library.api.endpoint;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.RestResponse;
import automation.library.api.cucumber.Route;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Product_Info_EN_BVT_Response;
import automation.library.api.pojo.response.Product_Info_FR_BVT_Response;
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
public class ProductInfoENEndPoint {

	
	private static Response response;
	private static RequestSpecification request = RestAssured.given();

	public ProductInfoENEndPoint(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        request = RestAssured.given();
        
    }

	public static IRestResponse<Product_Info_EN_BVT_Response> getProductListENDetails() {

		response = request.get();
		Log.message("Response:- " + response.getBody().asString(), true);
		return new RestResponse<Product_Info_EN_BVT_Response>(Product_Info_EN_BVT_Response.class, response);

	}

}
