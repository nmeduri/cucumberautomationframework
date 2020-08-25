package automation.library.api.stepDefination;
import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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


	RequestSpecification request;
	


	@Given("product Info EN_CA url is available.")
	public void product_info_en_ca_url_is_available() {
		

		url =	getHybApiENCA().HYB_API_EN_CA(FileReaderManager.getInstance().getAPIDataReader().getProductInformationAPI());
	}

	@When("user hits get Product Info EN_CA API.")
	public void user_hits_get_product_info_en_ca_api() {     

		response = getHybApiENCA().getAPI_EN_CAURL(url, FileReaderManager.getInstance().getAPIDataReader().get_product_Code());

		
	}

	
	@Then("user gets the Product Info EN_CA list.")
	public void user_gets_the_product_info_en_ca_list() {
		

		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());

	}
	
	@Then("user gets the Product Info EN list.")
	public void user_gets_the_product_info_en_list() {
		
		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());

	}

}
