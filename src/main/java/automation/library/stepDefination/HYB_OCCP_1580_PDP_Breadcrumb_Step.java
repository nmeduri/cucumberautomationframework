package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

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

/**
 * This file contains the scenario of user stories OCCP-1580
 */

public class HYB_OCCP_1580_PDP_Breadcrumb_Step extends BaseStep {

	RequestSpecification request;
	
	@Then("user should be able to find category code and name")
	public void user_should_be_able_to_find_category_code_and_name() {

		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.id"));
		PageObject.notNullAttributeInResponseInList(response.jsonPath().get("ctcCategories.name"));

	}
 
}
