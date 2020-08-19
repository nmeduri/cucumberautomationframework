package automation.library.api.endpoint;

import org.json.JSONObject;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class HYB_Authorization_EndPoint {
	
	private static String base_url;
	private static Response response;
	private RequestSpecification request = RestAssured.given();

	
	public String HYB_Auth_Url(String baseUrl) {
		base_url = baseUrl;
		return base_url;
    }
	
	public Response getAuthorizationToken(String url) {
		response = 
				RestAssured.given()
	    	.auth().preemptive().basic("trusted_client", "secret")
	    	.contentType("application/x-www-form-urlencoded").log().all()
	    	.formParam("grant_type", "password")
	    	.formParam("username", "praful.rajawat@cantire.com")
	    	.formParam("password", "nimda")
	    	     .when()
	    	.post(url);
    	

    	    JSONObject jsonObject = new JSONObject(response.getBody().asString());
    	    String accessToken = jsonObject.get("access_token").toString();
    	    String tokenType = jsonObject.get("token_type").toString();
    	    
    	    Log.message("Oauth Token with type " + tokenType + "   " + accessToken, true);
		return response;

	}
	
	public Response getAPI_Field_Default(String url, String accessToken, String product) {

		Log.message("API:- " + url + "product/" + product, true);
		request.header("Authorization", "Bearer " + accessToken);
	    response = request.put(url + "product/" + product);
		return response;

	}
	
	public Response delete_HYB_Add_Wishlist_API(String url, String accessToken, String product) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("API:- " + url + "product/" + product,  true);
		response = request.delete(url + "product/" + product);
	return response;

	}
	
	public Response get_Wishlist_API(String url, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("API:- " + url,  true);
		response = request.get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
	return response;

	}

}
