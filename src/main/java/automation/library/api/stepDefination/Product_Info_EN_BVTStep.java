package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.cucumber.TestContext;
import automation.library.api.pojo.response.CTBVT_Response;
import automation.library.api.pojo.response.Catalogs_List_BVT_Response;
import automation.library.api.pojo.response.Product_Info_EN_BVT_Response;
import automation.library.api.pojo.response.Product_Info_FR_BVT_Response;
import automation.library.logdetail.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class Product_Info_EN_BVTStep extends BaseStep {


	IRestResponse<Product_Info_EN_BVT_Response> productInfoenBVTResponse;
	RequestSpecification request;
	
	public Product_Info_EN_BVTStep(TestContext testContext) {
		super(testContext);
	}


	@Given("product Info EN_CA url is available.")
	public void product_info_en_ca_url_is_available() {
		
		
	}

	@SuppressWarnings("static-access")
	@When("user hits get Product Info EN_CA API.")
	public void user_hits_get_product_info_en_ca_api() {     

		productInfoenBVTResponse = getProductInfoENEndPoint().getProductListENDetails();
		
	}

	
	@Then("user gets the Product Info EN_CA list.")
	public void user_gets_the_product_info_en_ca_list() {
		
		Log.message("Status Code:- " + productInfoenBVTResponse.getStatusCode(), true);		
		Assert.assertEquals(200, productInfoenBVTResponse.getStatusCode());
	}

}
