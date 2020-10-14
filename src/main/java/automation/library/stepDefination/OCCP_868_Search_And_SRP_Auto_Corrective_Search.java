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
public class OCCP_868_Search_And_SRP_Auto_Corrective_Search extends BaseClass {

	public OCCP_868_Search_And_SRP_Auto_Corrective_Search(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure the corrective search message")
	public void aem_author_with_access_to_configure_the_corrective_search_message() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).navigateTo_Search_Page();
	}
	
	@And("login to AEM using the right credential as mentioned in the test data")
	public void login_to_aem_using_the_right_credential_as_mentioned_in_the_test_data() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickArrowIcon();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).enterUsername();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).enterPassword();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickSignInButton();
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickCloseButton();
	}
	
	@And("click on search page thumbnail image")
	public void click_on_search_page_thumbnail_image() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickThumbnailSRP();
	}
	
	@And("click on edit icon on header")
	public void click_on_edit_icon_on_header() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickEditIcon();
	}
	
	@And("click on aem search title")
	public void click_on_aem_search_title() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickSearchTitle();
	}
	
	@And("click on aem configure button")
	public void click_on_aem_configure_button() throws Exception {
		testContext.getPageObjectManager().getAEMCommonPage(PageObject.getDriver()).clickConfigureButton();
	}
	
	@And("user enter search title")
	public void user_enter_search_title() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataSearchTitle();
	}
	
	@And("user enter results label")
	public void user_enter_results_label() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataResultLabel();
	}
	
	@And("user enter not result title")
	public void user_enter_no_result_title() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataNoResultTitle();
	}
	
	@And("user enter similar result title")
	public void user_enter_similar_result_title() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataSimilarResultTitle();
	}
	
	@And("user enter suggestive message")
	public void user_enter_suggestive_message() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataSuggestiveMessage();
	}
	
	@And("user enter search result threshold")
	public void user_enter_search_reuslt_thershold() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataSearchResultThresholdMessage();
	}
	
	@And("user click on check button")
	public void user_click_on_check_button() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).clickCheckButton();
	}
	
	@And("configure the corrective search message")
	public void configure_the_corrective_search_message() throws Exception {
		testContext.getPageObjectManager().getAEMSearchAndSRPPage(PageObject.getDriver()).enterDataAutoCorrectiveSearchMessage();
	}
	
	
 
}
