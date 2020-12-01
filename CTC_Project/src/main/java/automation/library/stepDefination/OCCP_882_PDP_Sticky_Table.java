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
public class OCCP_882_PDP_Sticky_Table extends BaseClass {

	public OCCP_882_PDP_Sticky_Table(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access to configure the product sticky toc section")
	public void aem_author_with_access_to_configure_the_product_sticky_toc_section() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page();
	}
	
	@Given("pdp sticky toc url is available")
	public void pdp_stick_toc_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Add_To_Cart_Product_FlyOut());
	}
	
	@And("click on sticky toc pannel")
	public void click_on_sticky_toc_pannel() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).clickStickyTOC();
	}
	
	@And("update the label for text field")
	public void update_the_label_for_text_field() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_More_Sections_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_overview_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_specifications_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_resources_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_availability_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_rating_and_reviews_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_videos_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).update_questions_and_answer_label_Sticky_TOC();
	}
	
	@And("revert the label for text field")
	public void revert_the_label_for_text_field() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_More_Sections_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_overview_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_specifications_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_resources_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_availability_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_rating_and_reviews_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_videos_label_Sticky_TOC();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).revert_questions_and_answer_label_Sticky_TOC();
	}
	
	@Then("verify the changes published are correctly reflected")
	public void verify_the_changes_published_are_correctly_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyOverviewChangesPublish();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifySpecificationsChangesPublish();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyResourcesChangesPublish();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyRatingReviewChangesPublish();
		testContext.getPageObjectManager().getAEMPDPPage(PageObject.getDriver()).verifyQuestionAnswerChangesPublish();
	}
	
 
}
