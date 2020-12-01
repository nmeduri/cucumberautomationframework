package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class calls the URL of Wish List's APIs and
 * Execute the APIs method
 * 
 * @author Shashank Bansal
 * @date 07/07/2020
 */

public class HYB_API_Wishlist_End_Point {

	
	private static String base_url;
	private static Response response;
	private static Response response1;
	private RequestSpecification request = RestAssured.given();
	
	
	public String HYB_Wishlist_API(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }

	public Response put_HYB_Wishlist_API(String url, String sProductCode) {

		response = RestAssured.given().put(url + "/users/anonymous/wishlist/product/" +  sProductCode);
		return response;

	}
	
	
	public Response put_HYB_Add_Wishlist_API(String url, String sProductCode, String guid) {

		Log.message("url:- " + url + "/users/anonymous/wishlist/product/" +  sProductCode + "?guid=" + guid, true);
		response = RestAssured.given().put(url + "/users/anonymous/wishlist/product/" +  sProductCode + "?guid=" + guid);
		return response;

	}
	
	public Response delete_HYB_Add_Wishlist_API(String url, String sProductCode, String guid) {

		Log.message("url:- " + url + "/users/anonymous/wishlist/product/" +  sProductCode + "?guid=" + guid, true);
		response = RestAssured.given().delete(url + "/users/anonymous/wishlist/product/" +  sProductCode + "?guid=" + guid);
		Log.message("Status Code Delete:- " + response.getStatusCode(), true);
		return response;

	}
	
	
	public Response get_HYB_Wishlist_API(String url, String guid) {
		
		Log.message("Get Url:- " + url + "/users/anonymous/wishlist?guid=" +  guid , true);
		response = RestAssured.given().get(url + "/users/anonymous/wishlist?guid=" +  guid);
		Log.message("Get Response:- " + response.getBody().asString(), true);
		return response;

	}
	public Response put_HYB_Wishlist_API_AuthenticatedUser(String url, String sProductCode ,String cartCode,String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("PUT wishlist Url:- " + url +  "product/" +  sProductCode + "?cartid="+ cartCode, true);
		response = request.put(url + "product/" +  sProductCode + "?cartid="+ cartCode);
		return response;
	}
	
	public Response get_HYB_Wishlist_API_AuthenticatedUser(String url, String code,String accessToken) {
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Get Url Wishlist :- " + url , true);
		response = request.get(url);
		Log.message("Get Response:- " + response.getBody().asString(), true);
		return response;
	}

}
