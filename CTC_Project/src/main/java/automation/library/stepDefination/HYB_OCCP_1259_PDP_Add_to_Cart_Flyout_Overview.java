package automation.library.stepDefination;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

/**
 * This file contains the scenario of user stories OCCP-1259
 */
public class HYB_OCCP_1259_PDP_Add_to_Cart_Flyout_Overview extends BaseStep{
	RequestSpecification request;
	
	@When("Anonymous user Add to cart api is available")
	public void anonymous_User_Add_To_Cart_Api() {
		url = getAuthorizationUrl().HYB_Auth_Url(FileReaderManager.getInstance().getAPIDataReader().getAddToCartAnonymousUser());	
	}
	@Then("guid is available in response JSON")
	public void response_should_have_guid() {
		Assert.assertNotEquals(null, response.jsonPath().get("guid"));
		guid= response.jsonPath().get("guid").toString();
		Log.message("Section 'guid' is displayed in JSON response."+ guid, true);
	}
	@When("3970-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3970() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3970_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3970_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@Then("ctcproduct container is available in response")
	public void ctcproduct_Container_Is_Available_In_Response() {
		Assert.assertNotEquals(null,response.jsonPath().get("cartModifications.entry.ctcProduct"));
	}
	@And("code should be available in ctcproduct container")
	public void code_Should_Be_Available_Ctcproduct_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.code"));
		Log.message("Code in ctcproduct container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.code").toString(), true);
	}
	@And("description should be available in ctcproduct container")
	public void description_Should_Be_Available_Ctcproduct_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.description"));
		Log.message("Description in ctcproduct container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.description").toString(), true);
	}
	@And("name should be available in ctcproduct container")
	public void name_Should_Be_Available_Ctcproduct_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.name"));
		Log.message("Name in ctcproduct container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.name").toString(), true);
	}
	@And("productReferences container is available in response")
	public void productReferences_Container_Is_Available_In_Response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences"));
	}
	@And("description is available in productReferences container")
	public void description_Is_Available_In_ProductReferences_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.description"));
		Log.message("Description in productReferences container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.description").toString(), true);
	}
	@And("quantity is available in productReferences container")
	public void quantity_Is_Available_In_ProductReferences_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.quantity"));
		Log.message("Quantity in productReferences container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.quantity").toString(), true);
	}
	@And("referenceType is available in productReferences container")
	public void referenceType_Is_Available_In_ProductReferences_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.referenceType"));
		Log.message("ReferenceType in productReferences container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.referenceType").toString(), true);
	}
	@And("variantMatrix container is available in response")
	public void variantMatrix_Container_Is_Available_In_Response() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix"));
	}
	@And("elements container is available in variantMatrix container")
	public void elements_Container_Is_Available_In_VariantMatrix_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements"));
		Log.message("elements container in variantMatrix container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements").toString(), true);
	}
	@And("variant code is available in parentVariantCategory container")
	public void variant_Code_Is_Available_In_ParentVariantCategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.parentVariantCategory.code"));
		Log.message("Variant code in parentVariantCategory container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.parentVariantCategory.code").toString(), true);
	}
	@And("displayName is available in variantValueCategory container")
	public void displayName_Is_Available_In_VariantValueCategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.displayName"));
		Log.message("DisplayName in variantValueCategory container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.displayName").toString(), true);
	}
	@And("name is available in variantValueCategory container")
	public void name_Is_Available_In_VariantValueCategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.name"));
		Log.message("Name in variantValueCategory container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.name").toString(), true);
	}
	@And("sequence is available in variantValueCategory container")
	public void sequence_Is_Available_In_VariantValueCategory_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.sequence"));
		Log.message("sequence in variantValueCategory container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.variantMatrix.elements.variantValueCategory.sequence").toString(), true);
	}
	@And("description is available in target container")
	public void description_Is_Available_In_Target_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.target.description"));
		Log.message("Description in target container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.target.description").toString(), true);
	}
	@And("name is available in target container")
	public void name_Is_Available_In_Target_Container() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.target.name"));
		Log.message("Name in target container :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.target.name").toString(), true);
	}
	@And("preselected value should be true")
	public void preselected_Value_Should_Be_True() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.preselected"));
		Log.message("Preselected Value :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productReferences.preselected").toString(), true);
	}
	@And("productBrand should be displayed")
	public void productBrand_Should_Be_Displayed() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.productBrand"));
		Log.message("productBrand Value :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.productBrand").toString(), true);
	}
	@And("medias container should be displayed")
	public void medias_Container_Should_Be_Displayed() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias"));
		Log.message("medias container with all the fields :- " + response.jsonPath().get("cartModifications.entry.ctcProduct.medias").toString(), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.altText"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.code"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.damPath"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.isListingThumbnailImage"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.isPrimary"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.mediaType"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.name"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.order"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.url"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.videoImageThumbnailDAMPath"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("cartModifications.entry.ctcProduct.medias.videoImageThumbnailURL"));
	}
	@And("user should not able to add base product to the cart")
	public void user_Should_Not_Able_To_Add_BaseProduct_To_The_Cart() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("errors.message"));
		Log.message("Error messgae :- " + response.jsonPath().get("errors.message").toString(), true);
		response.jsonPath().get("errors.message").toString().contains("Choose a variant instead of the base product");
	}
	@When("3976-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3976() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3970_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3970_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3969-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3969() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3975-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3975() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3969_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3967-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3967() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().product_tc_3967_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3967_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3973-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3973() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().product_tc_3967_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3967_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3968-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3968() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().product_tc_3968_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3968_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3974-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3974() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().product_tc_3968_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3968_P1(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3966-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3966() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().product_tc_3966_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3966_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3972-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3972() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().product_tc_3966_P1(),FileReaderManager.getInstance().getAPIDataReader().product_tc_3966_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3971-user hits add to Cart api for authenticated user")
	public void user_hits_Add_to_Cart_api_Tc_3971() {
		response = getAuthorizationUrl().post_HYB_AddToCart_RegUserAPI(url, code,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3965_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3965_P2(), accessToken);
		Log.message("Response:- " + response.getBody().asString(), true);
	}
	@When("3965-user hits add to Cart api for Anonymous user")
	public void user_Hits_Add_To_Cart_Api_Anonymous_3965() {
		response = getAuthorizationUrl().post_HYB_AddToCart_AnonymousUserAPI(url, guid,FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3965_P1(),FileReaderManager.getInstance().getAPIDataReader().get_product_tc_3965_P2());
		Log.message("Response:- " + response.getBody().asString(), true);
	}
}
