package automation.library.api.endpoint;

import org.json.JSONObject;

import automation.library.logdetail.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HYB_Authorization_EndPoint {
	
	private static String base_url;
	private static Response response;
	
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

}
