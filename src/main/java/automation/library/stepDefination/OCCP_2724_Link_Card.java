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
public class OCCP_2724_Link_Card extends BaseClass {

	public OCCP_2724_Link_Card(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure link master card page load on the page")
	public void aem_author_with_access_to_configure_link_master_card_page_load_on_the_page() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).navigateTo_Link_Card_Page();
	}
	
	@And("click on link card Pannel")
	public void click_on_link_card_pannel() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).clickLinkCardPannel();
	}
	
	@And("click on error screen tab")
	public void click_on_error_screen_tab() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).clickErrorScreenTab();
	}
	
	@And("update the image field")
	public void updage_the_image_field() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).enterErrorImageContent();
	}
	
	@And("user enter account detail")
	public void user_enter_account_details() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).enter_link_master_card_details();
	}
	
	@Then("error images are reflect on site")
	public void error_images_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyErrorImageChangesReflectOnSite();
	}
	
	@And("reverse the error image changes")
	public void reverse_the_error_image_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).reverseErrorImageChanges();
	}
	
	@And("update the image text field")
	public void updage_the_image_text_field() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).enterErrorImageText();
	}
	
	@Then("error images text are reflect on site")
	public void error_images_text_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).verifyErrorImageTextChangesReflectOnSite();
	}
	
	@And("reverse the error image text changes")
	public void reverse_the_error_image_text_changes() throws Exception {
		testContext.getPageObjectManager().getAEMLinkCardPage(PageObject.getDriver()).reverseErrorImageTextChanges();
	}
 
}
