package automation.library.stepDefination;



import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class HYB_OCCP_1670_PDP_Special_Buy_Price_step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET method for base product")

	public void user_hits_the_api_without_locale() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1953());

	}
	
	@Then("user should to see Special Buy badge under badges container")
	public void user_should_to_see_Special_Buy_badge_under_badges_container() {
        
		Log.message("Response badge:- "  + response.jsonPath().get("badges"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("badges"), "SPECIALBUY");

	}
	
	@When("user hits the GET method for baseproduct has no variants")
	public void user_hits_the_api_without_locale_for_no_variants() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1954());

	}
	
	@When("user hits the GET method for baseproduct has variants and price is same for all variants")
	public void user_hits_the_GET_method_for_baseproduct_has_variants_and_price_is_same_for_all_variants() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1955());

	}
	
	@When("user hits the GET method for variant product")
	public void user_hits_the_GET_method_for_variant_product() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1957());

	}
	
	@When("user hits the GET method for Color variant product")
	public void user_hits_the_GET_method_for_Color_variant_product() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1959());

	}
	
	@And("Color variant is displayed")
	public void Color_variant_is_displayed() {
		Log.message("Response Colour:- "  + response.jsonPath().get("variantMatrix.parentVariantCategory.code"), true);
		PageObject.verifyExpectedResponse(response.jsonPath().get("variantMatrix.parentVariantCategory.code"), "COLOUR");
		
		
	}
	
	@When("user hits the GET method for baseproduct has variants and price is different for all variants")
	public void user_hits_the_GET_method_for_baseproduct_has_variants_and_price_is_different_for_all_variants() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1956());

	}
}
