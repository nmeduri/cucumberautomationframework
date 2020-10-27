package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OCCP_1184_Link_Existing_Card_Screen_Step extends BaseClass {
	
	public OCCP_1184_Link_Existing_Card_Screen_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("ability to go back cancel link should  be displayed")
	public void user_clicks_on_cancel_link() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayCancelLink();
	}
	
	@Then("link existing card screen should be displayed")
	public void existing_card_screen_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayTitleLinkYourExistingCardPage();
	}
	
	@And("header text should be displayed")
	public void header_text_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayHeaderText();
	}
	
	@And("sub header should be displayed")
	public void sub_header_text_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displaySubHeaderText();
	}
	
	@And("text header for input Card number starting with 6345 should be displayed")
	public void input_card_number_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayInputCardNumber();
	}
	
	@And("tool tip message and tool tip should be displayed")
	public void tooltip_message_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayTooltipMessage();
	}
	
	@And("continue cta should be displayed")
	public void continue_cta_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayContinueCTA();
	}
	
	@And("action button get one here link to move to generate card flow should be displayed")
	public void generate_card_link_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayGenerateCardLink();
	}
	
	@And("enter card number which is not in the correct format")
	public void enter_card_number_not_in_correct_format() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterCardNoIncorrectFormat();
	}
	
	@And("enter more than 16 characters including 4 prepopulated")
	public void enter_more_than_16_characters_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterLongCharCardNo();
	}
	
	@Then("inline error should be displayed")
	public void inline_error_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayInlineError();
	}

	@Then("system should not allow user to enter more than 16 characters including the 4 prepopulated")
	public void system_should_not_allow_more_than_16_characters() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).verifyNotAllowMoreCharacters();
	}
	
	@And("enter luhn check bad card number")
	public void enter_bad_card_number() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterBadCardNo();
	}
	
	@And("enter pending card number if threshold card balance greater than 100")
	public void enter_pending_card_number_balance_greater_100() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterThresholdCardNo();
	}
	
	@And("enter card number which is assigned to other account")
	public void enter_card_number_assigned_to_other_account() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterAlreadyLinkedCardNo();
	}

	@Then("respective bad card number error message should be displayed")
	public void bad_card_number_error_message_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayBadCardErrorMessage();
	}
	
	@Then("respective threshold card balance greater than 100 error message should be displayed")
	public void threshold_card_number_error_message_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayThresholdCardErrorMessage();
	}
	
	@Then("respective card assigned to other account error message should be displayed")
	public void already_linked_card_number_error_message_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayAlreadyLinkedCardErrorMessage();
	}
	
	@And("aem author with access navigates to link existing card screen")
	public void navigate_to_aem_link_existing_card_screen() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).navigateToLinkExistingCardScreen();
	}
	
	@And("click on aem link existing card title")
	public void click_on_link_existing_card_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).clickOnAemLinkExistingCardTitle();
	}
	

	@And("user should be able to author screen title")
	public void author_link_existing_card_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayTitle();
	}
	
	@And("access the title property and author the title")
	public void author_the_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTitle();
	}
	
	@And("user should be able to author screen sub title")
	public void author_link_existing_card_sub_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displaySubTitle();
	}
	
	@And("access the sub title property and author the title")
	public void author_sub_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataSubTitle();
	}
	
	@Then("the title and sub title changes should be reflected on ctc site")
	public void title_and_subtitle_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyTitleTextChangesReflected();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifySubTitleTextChangesReflected();
	}
	
	@And("user should be able to author tooltip label")
	public void user_should_able_to_author_tooltip_label() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayTooltipLabel();
	}
	
	@And("access the property and author the tooltip label")
	public void author_tooltip_label() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTooltipLabel();
	}
	
	@Then("the tooltip label changes should be reflected on ctc site")
	public void tooltip_label_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyTooltipLabelChangesReflected();
	}
	
	@And("user should be able to author Don't have a Triangle Rewards™ Card text")
	public void user_should_able_to_author_dont_have_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayDontHaveCardText();
	}
	
	@And("access the property and author the Don't have a Triangle Rewards™ Card text")
	public void author_dont_have_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataDontHaveCardText();
	}
	
	@And("user should be able to author label and link for 'Get one here' CTA")
	public void user_should_able_to_author_label_and_link() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayGetOneHereLabel();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayGetOneHereLink();
	}
	
	@And("access 'Get one here' CTA property and author link and label")
	public void author_label_and_link() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataGetOneHereLabel();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataGetOneHereLink();
	}
	
	@And("all the label and link changes should be reflected on ctc site")
	public void label_and_link_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyLabelChangesReflected();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyLinkChangesReflected();
	}
	
	@And("user should be able to author Cancel CTA")
	public void user_shoule_be_able_to_author_cancel() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayCancelCTA();
	}
	
	@And("access the property and author the Cancel text")
	public void author_cancel_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataCancelCTA();
	}
	
	@Then("cancel label changes should be reflected on ctc site")
	public void cancel_label_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyCancelChangesReflected();
	}
	
	@And("user should be able to author input field")
	public void user_shoule_be_able_to_author_input_field() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayInputField();
	}
	
	@And("access the property and author input field text")
	public void author_input_field_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataInputField();
	}
	
	@Then("input field label changes should be reflected on ctc site")
	public void input_field_label_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyInputFieldTextChangesReflected();
	}
	
	@And("user should be able to author tooltip text")
	public void user_shoule_be_able_to_author_tooltip_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayTooltipHeaderText();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayTooltipContent();
	}
	
	@And("access the property and author the tooltip text")
	public void author_tooltip_fields() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTooltipHeaderText();
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTooltipContent();
	}
	
	@Then("the tooltip text changes should be reflected on ctc site")
	public void tooltip_content_Field_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).VerifyTooltipHeaderTextChangesReflected();
	}
}
