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
		Log.message("Password:- " + FileReaderManager.getInstance().getAPIDataReader().getAuthenticatedUserPassword(), true);
		response = 
				RestAssured.given()
				.auth().preemptive().basic("trusted_client", "secret")
				.contentType("application/x-www-form-urlencoded").log().all()
				.formParam("grant_type", "password")
				.formParam("username", FileReaderManager.getInstance().getAPIDataReader().get_Authenticated_User())
				//.formParam("password", "nimda")
				.formParam("password", FileReaderManager.getInstance().getAPIDataReader().getAuthenticatedUserPassword())
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
		Log.message("Delete API:- " + url + "product/" + product,  true);
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

	public Response get_Create_Cart_AuthUser_Post_API(String url, String accessToken) {
		request.header("Authorization", "Bearer " + accessToken);
		//Log.message("Token 2:- " + accessToken,  true);
		Log.message("Create Cart API:- " + url,  true);
		response = request.post(url);
		Log.message("Create Cart Response:- " + response.getBody().asString(), true);
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
	 */


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
		/*String bodyvalue="{\n" + 
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
				"}";*/
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product1+""+"\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"BOPIS\"\n" + 
				"            },\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product2+""+"\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"STH\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  + code +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + code+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response get_Createcart_GuestUser_Post_API(String url) {
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
	public Response post_HYB_AddToCart_AnonymousUserAPI(String url, String guid, String product1,String product2) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product1+""+"\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"BOPIS\"\n" + 
				"            },\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"323\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \""+product2+""+"\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"STH\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer " );
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("API:- " + url  + guid +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + guid+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response post_HYB_AddToCart_AnonymousUserAPI_STH(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        \n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \"" +product1 +""+ "\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"STH\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer " );
		Log.message("Add to Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Add to Cart API:- " + url  + guid +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + guid+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response patch_HYB_UpdateCart_AnonymousUserAPI_STH(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"    \"storeZoneIds\": {\n" + 
				"        \"parcelZoneId\": \"QC_BS_PCL\",\n" + 
				"        \"bulkZoneId\": \"AB_BS_BLK\",\n" + 
				"        \"storeDistance\": 13\n" + 
				"    },\n" + 
				"    \"quantity\": 3,\n" + 
				"    \"deliveryMode\": {\n" + 
				"        \"code\": \"STH\"\n" + 
				"    },\n" + 
				"    \"product\": {\n" + 
				"        \"code\": \"" +product1 +""+ "\"\n" + 
				"    },\n" + 
				"    \"deliveryPointOfService\": {\n" + 
				"        \"name\": \"\"\n" + 
				"    }\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer " );
		Log.message("Update Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Update Cart API:- " + url  + guid +"/entries/0?fields=FULL&baseStoreId=ctr", true);
		response = request.patch(url + guid+ "/entries/0?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response get_Cart_API_AnonymousUser(String url,String guid) {
		Log.message("Get Cart API AnonymousUser :- " + url+ guid+"?fields=FULL",  true);
		response = request.get(url+guid+ "?fields=FULL");
		return response;
	}
	public Response patch_HYB_UpdateCart_AnonymousUserAPI_BOPIS(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"	\"storeZoneIds\": { \n" + 
				"		\"parcelZoneId\": \"AB_BS_PCL\", \n" + 
				"		\"bulkZoneId\": \"AB_BS_BLK\", \n" + 
				"		\"storeDistance\": 13 \n" + 
				"	},\n" + 
				"	\"quantity\":2 ,\n" + 
				"	\"deliveryMode\":{\n" + 
				"	    \"code\": \"BOPIS\" \n" + 
				"	},\n" + 
				"	\"product\":{\n" + 
				"		\"code\": \"" +product1 +""+"\" \n" + 
				"	},\n" + 
				"	\"deliveryPointOfService\":{\n" + 
				"		\"name\": \"363\"   \n" + 
				"	}\n" + 
				"	\n" + 
				"    \n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		Log.message("Update Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Update Cart API:- " + url  + guid +"/entries/0?fields=FULL", true);
		response = request.patch(url + guid+ "/entries/0?fields=FULL");
		return response;	
	}
	public Response patch_HYB_UpdateCart_AnonymousUserAPI_404NotFound(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"    \"storeZoneIds\": {\n" + 
				"        \"parcelZoneId\": \"QC_BS_PCL\",\n" + 
				"        \"bulkZoneId\": \"AB_BS_BLK\",\n" + 
				"        \"storeDistance\": 13\n" + 
				"    },\n" + 
				"    \"quantity\": 3,\n" + 
				"    \"deliveryMode\": {\n" + 
				"        \"code\": \"STH\"\n" + 
				"    },\n" + 
				"    \"product\": {\n" + 
				"        \"code\": \"" +product1 +""+ "\"\n" + 
				"    },\n" + 
				"    \"deliveryPointOfService\": {\n" + 
				"        \"name\": \"\"\n" + 
				"    }\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		Log.message("Update Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Update Cart API:- " + url  + guid +"/entri/0?fields=FULL", true);
		response = request.patch(url + guid+ "/entri/0?fields=FULL");
		return response;	
	}

	public Response post_HYB_AddToCart_AuthUserAPI_BOPIS(String url, String code, String product1, String accessToken) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \"" +product1 +""+ "\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"BOPIS\"\n" + 
				"            },\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"        \n" + 
				"    ]\n" + 
				"}";
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Add to Cart bodyvalue :"+ bodyvalue, true);
		Log.message("Add to Cart API:- " + url  + code +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + code+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response post_HYB_AddToCart_AuthUserAPI_STH(String url, String code, String product1, String accessToken) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        \n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \"" +product1 +""+ "\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"STH\"\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("bodyvalue :"+ bodyvalue, true);
		Log.message("Add to Cart API Authenticated user :- " + url  + code +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + code+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response get_Cart_API_Authenticated_User(String url,String code,String accessToken) {
		Log.message("Get Cart API AuthenticatedUser :- " + url+ code+"?fields=FULL",  true);
		request.header("Authorization", "Bearer " + accessToken);
		response = request.get(url+code+ "?fields=FULL");
		return response;
	}
	public Response post_HYB_AddToCart_AnonymousUserAPI_BOPIS(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \"" +product1 +""+ "\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"BOPIS\"\n" + 
				"            },\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"        \n" + 
				"    ]\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer " );
		Log.message("Add to Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Add to Cart API:- " + url  + guid +"/entries?fields=FULL&baseStoreId=ctr", true);
		response = request.post(url + guid+ "/entries?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response patch_HYB_UpdateCart_AuthenticatedUserAPI_STH(String url, String code, String product1,String accessToken) {
		String bodyvalue="{\n" + 
				"    \"storeZoneIds\": {\n" + 
				"        \"parcelZoneId\": \"QC_BS_PCL\",\n" + 
				"        \"bulkZoneId\": \"AB_BS_BLK\",\n" + 
				"        \"storeDistance\": 13\n" + 
				"    },\n" + 
				"    \"quantity\": 3,\n" + 
				"    \"deliveryMode\": {\n" + 
				"        \"code\": \"STH\"\n" + 
				"    },\n" + 
				"    \"product\": {\n" + 
				"        \"code\": \"" +product1 +""+ "\"\n" + 
				"    },\n" + 
				"    \"deliveryPointOfService\": {\n" + 
				"        \"name\": \"\"\n" + 
				"    }\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Update Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Update Cart API Auth :- " + url  + code +"/entries/0?fields=FULL&baseStoreId=ctr", true);
		response = request.patch(url + code+ "/entries/0?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response patch_HYB_UpdateCart_AuthenticatedUserAPI_BOPIS(String url, String code, String product1,String accessToken) {
		String bodyvalue="{\n" + 
				"	\"storeZoneIds\": { \n" + 
				"		\"parcelZoneId\": \"AB_BS_PCL\", \n" + 
				"		\"bulkZoneId\": \"AB_BS_BLK\", \n" + 
				"		\"storeDistance\": 13 \n" + 
				"	},\n" + 
				"	\"quantity\":2 ,\n" + 
				"	\"deliveryMode\":{\n" + 
				"	    \"code\": \"BOPIS\" \n" + 
				"	},\n" + 
				"	\"product\":{\n" + 
				"		\"code\": \"" +product1 +""+"\" \n" + 
				"	},\n" + 
				"	\"deliveryPointOfService\":{\n" + 
				"		\"name\": \"363\"   \n" + 
				"	}\n" + 
				"	\n" + 
				"    \n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer " + accessToken);
		Log.message("Update Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Update Cart API Auth :- " + url  + code +"/entries/0?fields=FULL&baseStoreId=ctr", true);
		response = request.patch(url + code+ "/entries/0?fields=FULL&baseStoreId=ctr");
		return response;	
	}
	public Response post_HYB_AddToCart_AnonymousUser_Default_API_(String url, String guid, String product1) {
		String bodyvalue="{\n" + 
				"    \"orderEntries\": [\n" + 
				"        {\n" + 
				"            \"product\": {\n" + 
				"                \"code\": \"" +product1 +""+ "\"\n" + 
				"            },\n" + 
				"            \"deliveryMode\": {\n" + 
				"                \"code\": \"BOPIS\"\n" + 
				"            },\n" + 
				"            \"storeZoneIds\": {\n" + 
				"                \"parcelZoneId\": \"ON_BS_PCL\",\n" + 
				"                \"bulkZoneId\": \"AB1_BS_BLK\",\n" + 
				"                \"storeDistance\": 13\n" + 
				"            },\n" + 
				"            \"quantity\": 1,\n" + 
				"            \"deliveryPointOfService\": {\n" + 
				"                \"name\": \"363\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"        \n" + 
				"    ]\n" + 
				"}";	
		request.body(bodyvalue);
		request.header("Content-Type", "application/json");
		//request.header("Authorization", "Bearer " );
		Log.message("Add to Cart Bodyvalue :"+ bodyvalue, true);
		Log.message("Add to Cart API:- " + url  + guid +"/entries?fields=DEFAULT&baseStoreId=ctr", true);
		response = request.post(url + guid+ "/entries?fields=DEFAULT&baseStoreId=ctr");
		return response;	
	}
	public Response get_Cart_API_AnonymousUser_Default(String url,String guid) {
		Log.message("Get Cart API AnonymousUser :- " + url+ guid+"?fields=FULL",  true);
		response = request.get(url+guid+ "?fields=DEFAULT");
		return response;
	}
}
