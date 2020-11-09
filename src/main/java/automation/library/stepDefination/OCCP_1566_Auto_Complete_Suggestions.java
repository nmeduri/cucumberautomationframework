package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
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
 * This file contains the scenario of user stories OCCP-1680
 */
public class OCCP_1566_Auto_Complete_Suggestions extends BaseClass {

	public OCCP_1566_Auto_Complete_Suggestions(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("update the number of keyword suggesiton")
	public void update_the_number_of_keyword_suggestion() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateMaxNumberOfSuggestionsKeyword();
	}
	
	@And("revert the number of keyword suggesiton")
	public void revert_the_number_of_keyword_suggestion() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertMaxNumberOfSuggestionsKeyword();
	}
	
	@And("update the number of keyword category")
	public void update_the_number_of_keyword_category() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateMaxNumberOfCategoryKeyword();
	}
	
	@And("revert the number of keyword category")
	public void revert_the_number_of_keyword_category() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertMaxNumberOfCategoryKeyword();
	}
	
	@And("update the number of product suggestion")
	public void update_the_number_of_keyword_product_suggestion() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateMaxNumberOfCategoryKeyword();
	}
	
	@And("revert the number of product suggestion")
	public void revert_the_number_of_product_suggestion() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertMaxNumberOfCategoryKeyword();
	}
	
	@And("update the product terms")
	public void update_the_product_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateProductLabel();
	}
	
	@And("revert the product terms")
	public void revert_the_product_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertProductLabel();
	}
	
	@And("update the categories terms")
	public void update_the_categories_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateCategoryLabel();
	}
	
	@And("revert the categories terms")
	public void revert_the_categories_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertCategoryLabel();
	}
	
	@And("update the suggestions terms")
	public void update_the_suggestions_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).updateSuggestionsLabel();
	}
	
	@And("revert the suggestions terms")
	public void revert_the_suggestions_terms() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).revertSuggestionsLabel();
	}
	
	@And("enable the overlay")
	public void enable_the_overlay() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickOnAutoCompleteEnable();
	}
	
	@And("disable the overlay")
	public void disable_the_overlay() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickOnAutoCompleteDisable();
	}
	
 
}
