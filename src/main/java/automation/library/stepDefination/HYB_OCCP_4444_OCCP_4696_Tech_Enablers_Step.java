package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
/**
 * This file contains the scenario of user stories OCCP-4444- OCCP-4696
 */
public class HYB_OCCP_4444_OCCP_4696_Tech_Enablers_Step extends BaseStep{
	RequestSpecification request;

	@Given("Product api is available")
	public void access_token_is_available_for_create_cart() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getCreteCart_GuestUser_API());		
	}

	@When("user hits the GET method for warranty message product")
	public void user_hits_the_GET_method_for_warranty_message_product() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3061());
	}

	@Then("returned JSON should display additionalWarrantyMessage")
	public void returned_should_display_additionalWarrantyMessage() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("warranty.additionalWarrantyMessage"));	
		String msg= response.jsonPath().get("warranty.additionalWarrantyMessage");
		if(msg.length()==1024) {
			Log.message("additionalWarrantyMessage length is equals to 1024 :"+msg.length(),true);
		}else
			Log.message("additionalWarrantyMessage length is NOT equals to 1024 :"+msg.length(),true);
		//Assert.fail("additionalWarrantyMessage length is NOT equals to 1024");

	}

	@Then("returned JSON should display warrantyMessage")
	public void returned_should_display_warrantyMessage() {
		PageObject.notNullAttributeInResponse(response.jsonPath().get("warranty.warrantyMessage"));	
		String msg= response.jsonPath().get("warranty.warrantyMessage");
		if(msg.length()==1024) {
			Log.message("warrantyMessage length is equals to 1024 :"+msg.length(),true);
		}else
			Log.message("warrantyMessage length is NOT equals to 1024 :"+msg.length(),true);
		//Assert.fail("warrantyMessage length is NOT equals to 1024");

	}
	
	@When("Variant product -user hits the GET method for warranty message")
	public void user_hits_the_GET_method_for_warranty_message_Variant_product() {

		response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3062());
	}
}
