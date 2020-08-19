package automation.library.api.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
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

public class HYB_OCCP_2726_Bazaar_Voice_Tech_Enabler_Product_Rating_Reviews_Step extends BaseStep {

	RequestSpecification request;
	
	@Then("user able to see rating values as numberOfReviews")
	public void user_able_to_see_rating_values_as_numberofreviews() {

		Log.message("Nuber of Reviews:- " + response.jsonPath().get("rating.numberOfReviews"), true);
		String numberReview = response.jsonPath().get("rating.numberOfReviews").toString();
		PageObject.notNullAttributeInResponse(numberReview);
		

	}
	
	@And("user should be able to see rating value as averageRating")
	public void user_should_be_able_to_see_rating_value_as_averageRating() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("rating.averageRating"));
	}
	
	
	@Then("user able to see rating values as numberOfReviews for CA FR")
	public void user_able_to_see_rating_values_as_numberofreviews_ca_fr() {

		Log.message("Nuber of Reviews:- " + response.jsonPath().get("rating.numberOfReviews"), true);
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("rating.numberOfReviews"));

	}
	
	@And("user should be able to see rating value as averageRating CA FR")
	public void user_should_be_able_to_see_rating_value_as_averageRating_ca_fr() {
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("rating.averageRating"));
	}
 
}
