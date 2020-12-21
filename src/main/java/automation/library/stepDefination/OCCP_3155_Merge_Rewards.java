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
public class OCCP_3155_Merge_Rewards extends BaseClass {

	public OCCP_3155_Merge_Rewards(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("login to backend system of merge rewards")
	public void login_to_backend_system_of_merge_rewards() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).navigate_to_merge_rewards_author_page();
	}
	
	@And("click on merge rewards panel")
	public void click_on_merge_rewards_panel() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).clickOnMergeRewardsPanel();
	}
	
	@And("click on merge cards tab")
	public void clickOnMergeCardsTab() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).clickOnMergeCardsTab();
	}
	
	@And("configure merge rewards card title")
	public void configure_merge_rewards_card_title() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureMergeCardTitle();
	}
	
	@And("revert merge rewards card title")
	public void revert_merge_rewards_card_title() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertMergeCardTitle();
	}
	
	@And("configure sub title merge rewards cards")
	public void configure_sub_title_merge_rewards_cards() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureMergeCardSubTitle();
	}
	
	@And("revert sub title merge rewards cards")
	public void revert_sub_title_merge_rewards_cards() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertMergeCardSubTitle();
	}
	
	@And("navigate to merge rewards cards page")
	public void navigate_to_merge_rewards_cards_page() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).navigate_to_merge_rewards_page();
	}
	
	@Then("configured merge rewards title is displayed")
	public void configured_merge_rewards_title_is_displayed() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredMergeRewardsCardsTitleDisplayedOnPublishPage();
	}
	
	@Then("configured sub title merge rewards is displayed")
	public void configured_sub_title_merge_rewards_is_displayed() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredMergeRewardsCardsSubTitleDisplayedOnPublishPage();
	}
	
	@And("click on merge two cards model tab")
	public void click_on_merge_two_cards_model_tab() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).clickOnMergeTwoCardsModelTab();
	}
	
	@And("configure card input label")
	public void configure_card_input_label() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureCardInputLabel();
	}
	
	@When("enter email 6228 detail")
	public void enter_email_6228_detail() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).enterData_Email(FileReaderManager.getInstance().getDataReader().get_UserName_6228());
	}
	
	@And("revert card input label")
	public void revert_card_input_label() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertCardInputLabel();
	}
	
	@And("click on merge card button")
	public void click_on_merge_card_button() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).clickOnMergeCardsButton();
	}
	
	@Then("configured input card label is displayed on publish page")
	public void configured_input_card_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredCardInputLabelDisplayedOnPublishPage();
	}
	
	@And("configure the text for tooltip field")
	public void configure_the_text_for_tooltip_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureToolTiptText();
	}
	
	@And("revert the text for tooltip field")
	public void revert_the_text_for_tooltip_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertToolTiptText();
	}
	
	@And("click on tool tip merge card")
	public void click_on_tool_tip_merge_card() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).clickOnToolTipButton();
	}
	
	@Then("configured tool tip text is dsiplayed on publish page")
	public void configured_tool_tip_text_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredToolTipTextDisplayedOnPublishPage();
	}
	
	@And("configure the label for tooltip field")
	public void configure_the_label_for_tooltip_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureToolTiptLabel();
	}
	
	@And("revert the label for tooltip field")
	public void revert_the_label_for_tooltip_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertToolTiptLabel();
	}
	
	@Then("configured tool tip label is dsiplayed on publish page")
	public void configured_tool_tip_label_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredToolTipLabelDisplayedOnPublishPage();
	}
	
	@And("configure merge card image field")
	public void configure_merge_card_image_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configureMergeCardImageDetails();
	}
	
	@And("revert merge card image field")
	public void revert_merge_card_image_field() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).revertMergeCardImageDetails();
	}
	
	@Then("configured merge image detail is displayed on publish page")
	public void configured_merge_image_detail_is_displayed_on_publish_page() throws Exception {
		testContext.getPageObjectManager().getMergeRewardsPage(PageObject.getDriver()).configuredMergeCardImagwDisplayedOnPublishPage();
	}
}
