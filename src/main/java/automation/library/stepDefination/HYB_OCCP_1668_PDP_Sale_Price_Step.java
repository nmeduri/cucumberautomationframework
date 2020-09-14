package automation.library.stepDefination;

import java.util.List;

import org.junit.Assert;

import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

public class HYB_OCCP_1668_PDP_Sale_Price_Step extends BaseStep{
	RequestSpecification request;
	
	@When("user hits the GET method for product has no variant section")
	public void user_hits_the_api_without_locale_for_no_variant_section() {
		
		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1945());

	}
	
	@And("Regular Price is displayed")
	public void Regular_Price_is_displayed() {
		List<String> list= response.jsonPath().get("productPrices.ctcPriceType");
		Assert.assertTrue(list.contains("REGULAR"));
	}
	
	@And("Sale Price is displayed")
	public void Sale_Price_is_displayed() {
		List<String> list= response.jsonPath().get("productPrices.ctcPriceType");
		//PageObject.notNullAttributeInResponse(response.jsonPath().get("productPrices.ctcPriceType"));
		Assert.assertTrue(list.contains("SALE"));
	}
	
	@When("user hits the GET method for product has variants with no price difference")
	public void user_hits_the_GET_method_for_product_has_variants_with_no_price_difference() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1946());	
	}
	
	@When("user hits the GET method for product has variants with price difference")
	public void user_hits_the_GET_method_for_product_has_variants_with_price_difference() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1947());	
	}
	
	@When("user hits the GET method for variants product on Sale")
	public void user_hits_the_GET_method_for_variants_product_on_Sale() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1948());	
	}
	
	@When("user hits the GET method for variants product not on Sale")
	public void user_hits_the_GET_method_for_variants_product_not_on_Sale() {

		 response = getApiProduct().getApiProduct(url, FileReaderManager.getInstance().getAPIDataReader().get_product_tc_1949());	
	}
}
