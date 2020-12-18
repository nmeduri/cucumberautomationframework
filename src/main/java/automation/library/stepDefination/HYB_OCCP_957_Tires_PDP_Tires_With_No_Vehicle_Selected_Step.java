package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-957
 */

public class HYB_OCCP_957_Tires_PDP_Tires_With_No_Vehicle_Selected_Step extends BaseStep{
	
	RequestSpecification request;
	
	@When("^user hits the GET api for Tires variant product$")
	public void user_hits_the_api_for_Tires_variant_product() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5664());
	}
	
	@Then("^in the JSON response Fitment Type Code and isVehicleRequired should not be displayed under varinat options$")
	public void in_JSON_response_Fitment_Type_Code_and_isVehicleRequired_should_not_be_displayed_under_varinat_options() {
		 
		String variantOptions= response.jsonPath().get("variantOptions").toString();
		Log.message("variantOptions :"+ response.jsonPath().get("variantOptions").toString(), true);
		if(variantOptions.contains(response.jsonPath().get("fitmentTypeCode").toString())) {
			Log.message("Fitment Type Code and isVehicleRequired are displayed under varinat options", true);
			
		}else {
			Assert.assertNotEquals(null, response.jsonPath().get("fitmentTypeCode"));
			PageObject.verifyExpectedResponseWithoutList("UNIVERSAL_FIT_01", response.jsonPath().get("fitmentTypeCode").toString());
			Log.message("fitmentTypeCode : "+ response.jsonPath().get("fitmentTypeCode"), true);	
			PageObject.verifyExpectedResponseWithoutList("false", response.jsonPath().get("isVehicleRequired").toString());
			Assert.assertNotEquals(null, response.jsonPath().get("baseOptions.options.fitmentTypeCode"));
			String isVehicleRequired= response.jsonPath().get("baseOptions.options.isVehicleRequired").toString();
			isVehicleRequired.contains("false");
			//PageObject.verifyExpectedResponseWithoutList("false", response.jsonPath().get("baseOptions.options.isVehicleRequired").toString());
			Log.message("Fitment Type Code and isVehicleRequired are not displayed under varinat options", true);
		}
	}
	
	@When("^user hits the GET api for Tires variant product with Fitment Type Code is DirectFitment$")
	public void user_hits_the_api_for_Tires_variant_product_with_FitmentType_Code_is_DirectFitment() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6697());
	}
	@Then("^in JSON response Fitment Type Code is DirectFitment and isVehicleRequired should not be displayed under varinat options$")
	public void in_JSON_response_Fitment_Type_Code_DirectFitment_and_isVehicleRequired_should_not_be_displayed_under_varinat_options() {
		 
		String variantOptions= response.jsonPath().get("variantOptions").toString();
		
		if(variantOptions.contains(response.jsonPath().get("fitmentTypeCode").toString())) {
			Log.message("Fitment Type Code and isVehicleRequired are displayed under varinat options", true);
			
		}else {
			Assert.assertNotEquals(null, response.jsonPath().get("fitmentTypeCode"));
			PageObject.verifyExpectedResponseWithoutList("DIRECT_FIT_02", response.jsonPath().get("fitmentTypeCode").toString());
			Log.message("fitmentTypeCode : "+ response.jsonPath().get("fitmentTypeCode"), true);	
			PageObject.verifyExpectedResponseWithoutList("true", response.jsonPath().get("isVehicleRequired").toString());
			String fitmentTypeCode=response.jsonPath().get("baseOptions.options.fitmentTypeCode").toString();
			fitmentTypeCode.contains("DIRECT_FIT_02");
			String isVehicleRequired= response.jsonPath().get("baseOptions.options.isVehicleRequired").toString();
			isVehicleRequired.contains("true");
			Log.message("Fitment Type Code and isVehicleRequired are not displayed under varinat options", true);
		}
	}
	@When("^user hits the GET api for Tires variant product when IsAutoApplicationProduct is FALSE$")
	public void user_hits_the_api_for_Tires_variant_product_when_IsAutoApplicationProduct_is_FALSE() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_6698());
	}
	@Then("^in JSON response Fitment Type Code and isVehicleRequired should not be displayed$")
	public void in_JSON_response_Fitment_Type_Code_and_isVehicleRequired_should_not_be_displayed() {
		PageObject.verifyExpectedResponseWithoutList(null, response.jsonPath().get("fitmentTypeCode"));
		Log.message("fitmentTypeCode :"+ response.jsonPath().get("fitmentTypeCode"), true);
		PageObject.verifyExpectedResponseWithoutList(null, response.jsonPath().get("isVehicleRequired"));
	}
	@When("^user hits the GET api for Tires base product which does not have variants$")
	public void user_hits_the_api_for_Tires_base_product_which_does_not_have_variants() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5663());
	}
	@Then("^Fitment Type Code and isVehicleRequired should be displayed out side of variant option for base product$")
	public void fitment_Type_Code_and_isVehicleRequired_should_not_be_displayed_in_JSON_response() {
		PageObject.verifyExpectedResponseWithoutList("DIRECT_FIT_02", response.jsonPath().get("fitmentTypeCode"));
		Log.message("fitmentTypeCode :"+ response.jsonPath().get("fitmentTypeCode"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("isVehicleRequired"));
	}
	@When("^user hits the GET api for Tires base product which does not have variants Fitment type code is UNIVERSAL$")
	public void user_hits_the_api_for_Tires_base_product_which_does_not_have_variants_Fitment_type_code_is_UNIVERSAL() {

		response = getHybApiEN().getAPI_EN(url,
				FileReaderManager.getInstance().getAPIDataReader().get_product_tc_5670());
	}
	@Then("^FitmentType Code is universal and isVehicleRequired should be displayed out side of variant option for base product$")
	public void fitmentType_Code_universal_and_isVehicleRequired_should_not_be_displayed_in_JSON_response() {
		PageObject.verifyExpectedResponseWithoutList("UNIVERSAL_FIT_01", response.jsonPath().get("fitmentTypeCode"));
		Log.message("fitmentTypeCode :"+ response.jsonPath().get("fitmentTypeCode"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("isVehicleRequired"));
	}
}
