package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class HYB_OCCP_4098_PLP_Update_implemented_OCC_API_to_include_baseStoreId_Step extends BaseStep{
RequestSpecification request;
	
	@When("user hits pdp get method api without base store id")
	public void user_pdp_get_method_api_without_base_store_id() {
		response = getApiProduct().getApiProduct_WithoutBaseStoreID(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3110());
	}
	
	@Then("user hits addtoCart api for authenticated user without base store id")
	public void user_hits_Add_to_Cart_api() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI_WithoutBaseStoreID(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2167(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_2167_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
