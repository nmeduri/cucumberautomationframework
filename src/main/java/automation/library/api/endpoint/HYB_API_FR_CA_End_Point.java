package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of Product Info FR CA's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @date 02/07/2020
 */

public class HYB_API_FR_CA_End_Point {

	
	private static String base_url;
	private static Response response;
	private RequestSpecification request = RestAssured.given();
	
	
	public String HYB_API_FR_CA(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_FR_CA(String url, String sProductCode) {

		Log.message("API:- " + url + "/products/" +  sProductCode + "/363?fields=FULL&lang=fr_ca",true);
		response = RestAssured.given().get(url + "/products/" +  sProductCode + "/363?fields=FULL&baseStoreId=ctr&lang=fr_ca");
      
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	
	public Response get_Design_Outbound_API_FR_CA(String url) {

		Log.message("url:- " + url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=FULL&lang=fr_ca", true);
		response = RestAssured.given().get(url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=FULL&baseStoreId=ctr&lang=fr_ca");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	
	
	public Response post_HYB_ProductList_fr_CA(String url,String product1, String product2) {
		String bodyvalue="{\n" + 
				"  \"productCodes\": [\n" + 
				"    \""+product1+"\""+",\""+product2+ "\"\n" + 
				"  ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer ");
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  +"363?fields=FULL&baseStoreId=CTR&lang=fr_CA", true);
		response = request.post(url + "363?fields=FULL&baseStoreId=CTR&lang=fr_CA");
		return response;	
	}
}
