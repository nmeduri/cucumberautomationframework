package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of Product Info EN's APIs and
 * Execute the APIs method
 * 
 * @author Shashank Bansal
 * @date 30/06/2020
 */

public class HYB_API_EN_End_Point {

	
	private static String base_url;
	private static Response response;
	private RequestSpecification request = RestAssured.given();
	
	public String HYB_API_EN(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response getAPI_EN(String url, String sProductCode) {

		Log.message("url:- " + url + "/products/" +  sProductCode + "/363?fields=FULL&baseStoreId=ctr&lang=en", true);
		response = RestAssured.given().get(url + "/products/" +  sProductCode + "/363?fields=FULL&baseStoreId=ctr&lang=en");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	
	public Response get_Design_Outbound_API_EN(String url) {

		Log.message("url:- " + url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=DEFAULT", true);
		response = RestAssured.given().get(url + "/catalogs/ctcCanadianTireProductCatalog/Online/categories/tools-hardware?fields=DEFAULT");

		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	public Response post_HYB_ProductList_EN(String url,String product1, String product2, String product3) {
		String bodyvalue="{\n" + 
				"  \"productCodes\": [\n" + 
				"    \""+product1+"\""+",\""+product2+ "\""+",\""+ product3+ "\""+"\n" + 
				"  ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer ");
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  +"363?fields=FULL&baseStoreId=CTR&lang=en", true);
		response = request.post(url + "363?fields=FULL&baseStoreId=CTR&lang=en");
		return response;	
	}
	
	public Response post_HYB_2ProductList_EN(String url,String product1, String product2) {
		String bodyvalue="{\n" + 
				"  \"productCodes\": [\n" + 
				"    \""+product1+"\""+",\""+product2+"\""+"\n" + 
				"  ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  +"363?fields=FULL&baseStoreId=CTR&lang=en", true);
		response = request.post(url + "363?fields=FULL&baseStoreId=CTR&lang=en");
		return response;	
	}
	public Response post_HYB_ProductList_EN_Without_BaseStoreID(String url,String product1, String product2) {
		String bodyvalue="{\n" + 
				"  \"productCodes\": [\n" + 
				"    \""+product1+"\""+",\""+product2+"\""+"\n"+
				"  ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer ");
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  +"363?fields=FULL&lang=en", true);
		response = request.post(url + "363?fields=FULL&lang=en");
		return response;	
	}
	public Response post_HYB_ProductList_EN_SingleProduct(String url,String product1) {
		String bodyvalue="{\n" + 
				"  \"productCodes\": [\n" + 
				"    \""+product1+"\""+"\n" + 
				"  ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  +"363?fields=FULL&baseStoreId=CTR&lang=en", true);
		response = request.post(url + "363?fields=FULL&baseStoreId=CTR&lang=en");
		return response;	
	}
}
