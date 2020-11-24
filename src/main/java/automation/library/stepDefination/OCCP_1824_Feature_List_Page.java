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
public class OCCP_1824_Feature_List_Page extends BaseClass {

	public OCCP_1824_Feature_List_Page(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("AEM author with access to configure feature list authorable page")
	public void aem_author_with_access_to_configure_feature_list_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).navigateTo_Feature_List_Author_Page();
	}
	
	@Given("AEM author with access to configure informational feature list authorable page")
	public void aem_author_with_access_to_configure_informational_feature_list_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).navigateTo_informational_Feature_List_Author_Page();
	}
	
	@Given("navigate to feature list page")
	public void navigate_to_feature_list_page() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).navigateTo_Feature_List_Page();
	}
	
	@And("click on feature list panel")
	public void click_on_feature_list_panel() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).clickFeatureListPanel();
	}
	
	@And("configure the feature list component on the authored page")
	public void configure_the_feature_list_component_on_the_authored_page() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).enterFeatureSubTitle();
	}
	
	@And("reverse the feature list component changes")
	public void reverse_the_customer_service_section_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).reverseSubTitleDetails();
	}
	
	@And("reverse the feature list image changes")
	public void reverse_the_feature_list_image_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).reverseFLImageSubTitleDetails();
	}
	
	@And("do not fill the mandotary fields")
	public void do_not_fill_the_mandotary_fields() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).clearMandatoryFields();
	}
	
	@Then("user should see authoring error message as  the mandatory fields are not entered")
	public void user_should_see_authoring_error_message_as_the_mandatory_fields_are_not_entered() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).displayAlertForImageMandatoryField();
	}
	
	@And("reverse the image one changes")
	public void reverse_the_image_one_changes() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).reverseImageOneDetails();
	}
	
	@And("fill minimum thershold value with less than min")
	public void fill_minimum_thershold_value_with_less_than_min() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).clickSelectTypeDropDown();
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).selectImageOptionSelectTypeFeaturedListDropDown();
	}
	
	@Then("user should see error authoring message as the mininum thershold")
	public void user_should_see_error_authoring_message_as_the_minimum_thershold() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).veifyAuthoringMinimumThersholdErrorMessage();
	}
	
	@And("configure the destination url of learn more on featured list")
	public void configure_the_destination_url_of_learn_more_on_featured_list() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).enterLearnMoreLinkDetail();
	}
	
	@And("click on learn more link")
	public void click_on_learn_more_link() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).clickLearnMoreLinkFirst();
	}
	
	@Then("user should be redirected to defined destination on same tab")
	public void user_should_be_redirected_to_defined_destination_on_same_tab() throws Exception {
		testContext.getPageObjectManager().getFeatureListPage(PageObject.getDriver()).verifyLearnMoreLinkNavigateOnDefinedUrl();
	}
	
	@Then("verify the configured informational feature list component")
	public void verify_the_configured_informational_feature_list_component() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyFeaturedListInfomationalSubTitle();
	}
	
	@And("verify the configured image feature list component")
	public void verify_the_configured_image_featue_list_component() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyLearnMoreUrlUpdateOnPage();
	}
	
	@And("configure the url for tile")
	public void configure_the_url_for_tile() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).enterLearnMoreLinkDetail();
	}
	
	@And("revert the url for tile")
	public void revert_the_url_for_tile() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).revertLearnMoreLinkDetail();
	}
	@Then ("verify title on the card when field is not authored in AEM")
	public void Title_not_authored() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyTitlenotauthored();
	}
	@Then ("verify description on the card when field is not authored in AEM")
	public void description_not_authored() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyDescriptionnotauthored();
	}
	@Then ("verify learn more CTA on the card when field is not authored in AEM")
	public void LearnMore_CTA_not_authored() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyLearnMorenotauthored();
	}
	@Then ("verify destination URL on the card when field is not authored in AEM")
	public void destinationURL_not_authored() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).verifyLearnmoreLinknotauthored();
	}
	@And  ("verify title on the card is not displayed when field is not authored")
	public void TitleNotDisplayed() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).titletextnotdisplayedWhenNotAuthored();
	}	
	@And  ("verify description on the card is not displayed when field is not authored")
	public void descriptionNotDisplayed() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).descriptiontextnotdisplayedWhenNotAuthored();
	}
	@And  ("verify learn more CTA Text on the card is not displayed when field is not authored")
	public void CTANotDisplayed() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).LearnmoretextnotdisplayedWhenNotAuthored();
	}
	@Then ("verify title on the card when field is authored in AEM")
	public void titleOnCardAuthored() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).enterDescriptiveTitleDetail();
	}
	@And ("verify title on the card is displayed when field is authored")
	public void titleOnCardDisplayed() throws Exception {
		testContext.getPageObjectManager().getAEMFeatureListPage(PageObject.getDriver()).titletextdisplayedWhenAuthored();
	}
}
