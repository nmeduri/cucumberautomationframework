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
public class OCCP_870_PDP_Product_Information extends BaseClass {

	public OCCP_870_PDP_Product_Information(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on overview section")
	public void click_on_overview_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickOverviewAuthorableSection();;
	}
	
	@And("update the configure overview label")
	public void update_the_configure_overview_label() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).udpate_overview_label();
	}
	
	@Then("the overview changes are reflect on site")
	public void the_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyOverviewChangesReflectOnSite();
	}
	
	@And("reverse overview changes")
	public void reverse_overview_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).reverse_overview_changes();
	}
	
	@And("click on resource section")
	public void click_on_resource_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickResourceAuthrableSection();
	}
	
	@And("update the user manual information")
	public void update_the_user_manual_information() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).updateUseManualInformation();
	}
	
	@Then("the user manual changes are reflect on site")
	public void the_user_manual_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyUserManualChangesReflectOnSite();
	}
	
	@And("reverse user manual changes")
	public void reverse_user_manual_changes() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).reverse_user_manual_changes();
	}
	
 
}
