package automation.library.api.endpoint;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class HYB_API_Wishlist_End_Point {

	
	private static String base_url;
	private static Response response;
	
	
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

}
