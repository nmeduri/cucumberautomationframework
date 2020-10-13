package automation.library.api.endpoint;

import org.json.JSONObject;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class generate the tokens for Authorization APIs.
 * Execute the APIs method
 * 
 * @author Shashank Bansal
 * @date 07/07/2020
 */

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
	    	.formParam("username", FileReaderManager.getInstance().getAPIDataReader().get_Authenticated_User())
	    	.formParam("password", "nimda")
	    	     .when()
	    	.post(url);
    	

    	    JSONObject jsonObject = new JSONObject(response.getBody().asString());
    	    Log.message("Response:- " + jsonObject, true);
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
		Log.message("Token 2:- " + accessToken,  true);
		Log.message("API:- " + url,  true);
		response = request.get(url);
		Log.message("Response:- " + response.getBody().asString(), true);
	return response;

	}

	public Response get_Addtocart_Post_API(String url, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Token 2:- " + accessToken,  true);
		Log.message("API:- " + url,  true);
		response = request.post(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	public Response post_HYB_AddToCart_API(String url, String guid, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Get Url:- " + url + "?guid=" +  guid , true);
		response = request.post(url + "?guid="+ guid);
		Log.message("Get Response:- " + response.getBody().asString(), true);
		return response;

	}
	public Response put_HYB_AddToCart_API_Invalid_url(String url, String guid, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Get Url:- " + url + "0e?guid=" +  guid, true);
		response = request.put(url + "0e?guid="+ guid);
		Log.message("Get Response:- " + response.getBody().asString(), true);
		return response;
	}
		
	public Response get_HYB_Add_Product_API(String url, String product, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("API:- " + url + "/products/" + product +"/363?fields=FULL&baseStoreId=ctr", true);
		response = request.get(url + "/products/" + product +"/363?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	/*public Response get_HYB_Product_API(String url, String product) {
		request.header("Authorization", "Bearer ");
		Log.message("API:- " + url + "/products/" + product +"/363?fields=FULL&baseStoreId=ctr", true);
		response = request.get(url + "/products/" + product +"/363?fields=FULL&baseStoreId=ctr");
		return response;	
	}
=======*/
		
	
	public Response put_API_Field_Default(String url, String accessToken, String product) {

		Log.message("API:- " + url + "/product/" + product, true);
		request.header("Authorization", "Bearer " + accessToken);
	    response = request.put(url + "/product/" + product);
		return response;

	}
	public Response get_Addtocart_Put_API(String url, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Token 2:- " + accessToken,  true);
		Log.message("API:- " + url,  true);
		response = request.put(url);
		Log.message("Response:- " + response.getBody().asString(), true);
	return response;

	}
	public Response post_HYB_AddToCart_RegUserAPI(String url, String code, String product1, String product2, String accessToken) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product1+""+"\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"product\": {\n"
				+ "                \"code\": \""+product2+""+"\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  + code +"/entries?fields=DEFAULT&baseStoreId=ctr", true);
		response = request.post(url + code+ "/entries?fields=DEFAULT&baseStoreId=ctr");
		return response;	
	}
	public Response get_Addtocart_GuestUser_Post_API(String url) {
		Log.message("API:- " + url,  true);
		response = request.post(url);
		Log.message("Response:- " + response.getBody().asString(), true);
		return response;

	}
	public Response post_HYB_AddToCart_RegUserAPI_WithoutBaseStoreID(String url, String code, String product1, String product2, String accessToken) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product1+""+"\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"product\": {\n"
				+ "                \"code\": \""+product2+""+"\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  + code +"/entries?fields=DEFAULT", true);
		response = request.post(url + code+ "/entries?fields=DEFAULT");
		return response;	
	}
	
}
