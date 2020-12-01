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
public class OCCP_869_PDP_Specifications extends BaseClass {

	public OCCP_869_PDP_Specifications(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure the product specifications section")
	public void aem_author_with_access_to_configure_the_product_specifications_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).navigateTo_PDP_Page();
	}
	
	@And("click on specifications section")
	public void click_on_specifications_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickSpecificationsSection();
	}
	
	@And("update the view more specifications label")
	public void update_the_view_more_specifications_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateViewMoreSpecificationLabel();
	}
	
	@And("update set number of specifications")
	public void update_set_number_of_specifications() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateSetNumberOfSpecificationsa();
	}
	
	@And("update the view less specifications label")
	public void update_the_view_less_specifications_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateViewLessSpecificationLabel();
	}
	
	@And("update specifications label")
	public void update_specifications_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateSpecificationLabel();
	}
	
	@Then("changes are reflected on ctc site")
	public void changes_are_reflected_on_ctc_site() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyChangesReflectOnSite();
	}
	
	@And("revert specification changes")
	public void revert_specification_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).reverSpecificationsChanges();
	}
	
	
 
}
