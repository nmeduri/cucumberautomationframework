package automation.library.stepDefination;
import org.junit.Assert;


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

/**
 * This file contains the scenario of Product Info FR BVT
 */

public class Product_Info_FR_BVTStep extends BaseStep {




	@Given("product Info FR_CA url is available.")
	public void product_info_fr_ca_url_is_available() {

		url =	getHybApiFRCA().HYB_API_FR_CA(FileReaderManager.getInstance().getAPIDataReader().getProductInformationAPI());
		
	}

	@When("user hits get Product Info FR_CA API.")
	public void user_hits_get_product_info_fr_ca_api() {     

		response = getHybApiFRCA().getAPI_FR_CA(url, FileReaderManager.getInstance().getAPIDataReader().get_product_Code());

		
	}

	
	@Then("user gets the Product Info FR_CA list.")
	public void user_gets_the_product_info_fr_ca_list() {
	
		Log.message("Status Code:- " + response.getStatusCode(), true);		
		Assert.assertEquals(200, response.getStatusCode());

	}

}
