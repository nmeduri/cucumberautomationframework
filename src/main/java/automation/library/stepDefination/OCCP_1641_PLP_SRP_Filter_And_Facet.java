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
public class OCCP_1641_PLP_SRP_Filter_And_Facet extends BaseClass {

	public OCCP_1641_PLP_SRP_Filter_And_Facet(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("click on facet panel")
	public void click_on_facet_panel() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).clickFacetPannel();
	}
	
	@And("configure facet author on plp template")
	public void configure_facet_author_on_plp_template() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateFacetTitleOnSite();
	}
	
	@And("revert facet title")
	public void revert_facet_title() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertFacetTitleOnSite();
	}
	
	@And("click on sort facet")
	public void clickSortFacet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickSortFacet();
	}
	
	@Then("content author updates the facet tile")
    public void content_author_updates_the_facet_title() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifyFacetTitleUpdateOnSite();
	}
	
	@And("configure selected label on plp template")
	public void configure_selected_label_on_plp_template() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).updateSelectedLabel();
	}
	
	@And("revert selected label")
	public void revert_selected_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).revertSelectedLabel();
	}
	
	@Then("content author updates the selected label")
    public void content_author_updates_the_selected_label() throws Exception {
		testContext.getPageObjectManager().getAEMPLPPage(PageObject.getDriver()).verifySelectedLabelUpdateOnSite();
	}
	
	@And("click on color facet")
	public void click_on_color_facet() throws Exception {
		testContext.getPageObjectManager().getPLPPage(PageObject.getDriver()).clickColorFacet();
	}
	
 
}
