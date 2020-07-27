package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalog_BVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class HYB_OCCP_874_PDP_Warranty_Step extends BaseStep {

	RequestSpecification request;
	
	@When("user hits the GET additional warranty api with locale en")
	public void user_hits_the_additional_warranty_api_with_locale_en() {     

		response = getHybApiEN().getAPI_EN(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1413());
		
	}

	
	@Then("returned JSON should have warranty section in en_CA locale")
	public void returned_json_should_have_warranty_section_en_ca_locale() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		
	}
	
	@Then("returned JSON should have warranty section in fr_ca locale")
	public void returned_json_should_have_warranty_section_fr_ca_locale() {

		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));

	}
	
	@Then("returned JSON should have warranty section in en locale")
	public void returned_response_should_have_warranty_section_in_en_locale() {
		
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		
	}
	
	@Then("returned JSON should have additional warranty message name and value")
	public void returned_response_should_have_additional_warranty_message_name_and_vale() {

		Assert.assertNotEquals(null, response.jsonPath().get("warranty.additionalWarrantyMessage"));
		Log.message("'Warranty Addional Message' is not null.", true);

	}
	
	@Then("returned JSON should have warranty section without additional Warranty Message name and value")
	public void returned_response_should_have_warranty_section_without_additional_warranty_message_name_and_value() {
		
		
		Assert.assertEquals(null, response.jsonPath().get("warranty.additionalWarrantyMessage"));
		Log.message("'Additional Warranty Message' is not Displayed.",true);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		Log.message("Section 'Warranty' is Displayed without additional Warranty Message and value.",true);
		
		
	}
	
	@Then("returned JSON should not have warranty section without names and values")
	public void returned_response_should_not_have_warranty_section_without_warranty_message_name_and_value() {
		
		
		Assert.assertEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
		Log.message("'Warranty Message and Value' are not displayed.", true);
		Assert.assertEquals(null, response.jsonPath().get("warranty"));
		Log.message("Warranty section is not displayed without names and values.", true);
		
	}
	
	@Then("returned JSON should have warranty section without locale")
	public void returned_response_should_have_warranty_section_without_locale() {
		Assert.assertNotEquals(null, response.jsonPath().get("warranty"));
		Log.message("Section 'Warranty' is Displayed.", true);
	}

	@And("returned JSON should have warranty type name and value")
	public void returned_response_have_warranty_type() {

		Log.message("Warranty Type :- " + response.jsonPath().get("warranty.warrantyType"), true);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyType"));
		Log.message("Section 'Warranty Type' is Displayed.", true);
	}

	@And("value should display in default locale as en")
	public void value_should_display_in_default_locale_as_en() {

		Assert.assertEquals("Expressed", response.jsonPath().get("warranty.warrantyType"));

	}
	
	@And("returned JSON should have additional warranty message name and its value in en_ca locale")
	public void returned_json_should_have_additonal_warranty_message() {
		
		String sActualWarrantyAddionalMessage = response.jsonPath().get("warranty.additionalWarrantyMessage").toString();
		Assert.assertEquals("This product carries a 1 year exchange warranty redeemable at any Canadian Tire store", sActualWarrantyAddionalMessage);
	}
	
	@And("returned JSON should have additional warranty message and value in en locale")
	public void returned_response_should_have_additional_warranty_message_value_in_en_locale() {
		String sActualWarrantyAddionalMessage = response.jsonPath().get("warranty.additionalWarrantyMessage").toString();
		Assert.assertEquals("This product carries a 1 year exchange warranty redeemable at any Canadian Tire store", sActualWarrantyAddionalMessage);
	}
	
	@And("returned JSON should have additional warranty message name value should display in default locale as en")
	public void returned_response_should_have_addional_warranty_message_in_default_local_as_en() {

		Assert.assertEquals("This product carries a 1 year exchange warranty redeemable at any Canadian Tire store",
				response.jsonPath().get("warranty.additionalWarrantyMessage"));

	}
	
	@And("returned JSON should have additional warranty message name and its value in fr_ca locale")
	public void returned_json_should_have_additonal_warranty_message_fr_ca() {
		
		Assert.assertEquals(
				"Si cet article est défectueux, il est couvert par la garantie du fabricant. Dans le cas où aucune garantie n'est indiquée, cet article est couvert par une garantie de un an honorée dans tout magasin Canadian Tire.",
				response.jsonPath().get("warranty.additionalWarrantyMessage"));

	}
	
	@And("returned JSON should have warranty message name and its value in en_ca locale")
	public void returned_response_should_have_warranty_messge_name_and_value_in_en_ca_locale() {
		Log.message("Warrany Message:- " + response.jsonPath().get("warranty.warrantyMessage"), true);
		String sWarrantyMessage = response.jsonPath().get("warranty.warrantyMessage");
		Assert.assertEquals("warfr", sWarrantyMessage);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
	}
	
	@And("returned JSON should have warranty message name and its value in en locale")
	public void returned_response_should_have_warranty_messge_name_and_value_in_en_locale() {
		Log.message("Warrany Message:- " + response.jsonPath().get("warranty.warrantyMessage"), true);
		String sWarrantyMessage = response.jsonPath().get("warranty.warrantyMessage");
		Assert.assertEquals("Chair", sWarrantyMessage);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
	}
	
	@And("returned JSON should have warranty name and its value in fr_ca locale")
	public void returned_response_should_have_warranty_name_and_value_in_fr_ca_locale() {

		Log.message("Warrany Message:- " + response.jsonPath().get("warranty.warrantyMessage"), true);
		String sWarrantyMessage = response.jsonPath().get("warranty.warrantyMessage");
		Assert.assertEquals("warca", sWarrantyMessage);
		Assert.assertNotEquals(null, response.jsonPath().get("warranty.warrantyMessage"));
	}
	
	
	
	

}
