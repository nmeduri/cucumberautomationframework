package automation.library.stepDefination;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-3082
 */
public class HYB_OCCP_3082_Featured_List_Product_List_Authorable extends BaseStep {

	RequestSpecification request;
	
	@When("user hits PLP GET api")
	public void user_Hits_Plp_Get_Api_3961() {
		response = getHybApiEN().post_HYB_SingleProductList_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3961());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	
	@And("user should able to see the product brand value in the JSON response")
	public void user_Should_Able_To_See_The_Product_Brand_Value_3961() {
		Log.message("Brand:- "+ response.jsonPath().get("productsList.productBrand").toString(), true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("productsList.productBrand").toString());
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
	@When("user hits PLP single variant product GET api")
	public void user_Hits_Plp_Single_Variant_Product_Get_Api_3962() {
		response = getHybApiEN().post_HYB_SingleProductList_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3962());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@And("user should able to see the variant product brand value in the JSON response")
	public void user_Should_Able_To_See_The_Variant_Product_Brand_Value_3962() {
		Log.message("Brand:- "+ response.jsonPath().get("productsList.productBrand").toString(), true);
		PageObject.notNullAttributeInResponse(response.jsonPath().get("productsList.productBrand").toString());
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
	@When("user hits PLP multiple base products GET api")
	public void user_Hits_Plp_Multiple_Base_Products_Get_Api_3963() {
		response = getHybApiEN().post_HYB_ProductList_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3963_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3963_P2(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3963_P3());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@And("user should able to see the multiple base products brand value in the JSON response")
	public void user_Should_Able_To_See_The_Multiple_Base_Products_Brand_Value_3963() {
		Log.message("Brand:- "+ response.jsonPath().get("productsList.productBrand").toString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.productBrand"));
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
	@When("user hits PLP multiple variant products GET api")
	public void user_Hits_Plp_Multiple_Variant_Products_Get_Api_3963() {
		response = getHybApiEN().post_HYB_ProductList_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3964_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3964_P2(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3964_P3());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@And("user should able to see the multiple variant products brand value in the JSON response")
	public void user_Should_Able_To_See_The_Multiple_Variant_Products_Brand_Value_3963() {
		Log.message("Brand:- "+ response.jsonPath().get("productsList.productBrand").toString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("productsList.productBrand"));
		Log.message("Product Brand Title's value is displayed in JSON Response", true);
	}
}
