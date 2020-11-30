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
 * This file contains the scenario of user stories OCCP-2803
 */

public class OCCP_2803_Active_Ownership_Validation_Screen_Step extends BaseClass {
	
	public OCCP_2803_Active_Ownership_Validation_Screen_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("user should be redirected to active ownership validation screen")
	public void redirect_to_active_ownership_validation_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationHeaderText();
	}
	
	@And("in the screen header text should be present")
	public void header_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationHeaderText();
	}
	
	@And("sub header text should be present")
	public void sub_header_text_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveValidationSubHeaderText();
	}
	
	@And("postal code property should be present")
	public void postal_code_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayPostalCodeField();
	}
	
	@And("year of birth property should be present")
	public void year_of_birth_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayActiveYearOfBirthField();
	}
	
	@And("user should be able to enter pending activation loyalty card number")
	public void enter_pending_loyalty_card_no() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterDataPendingCardNo();
	}
	
	//AEM
	
	@And("click on active ownership validation tab")
	public void active_ownership_validation_tab() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).clickOnActiveValidationTab();
	}
	
	@And("user should be able to author active rewards card title")
	public void user_should_be_able_to_author_active_rewards_card_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayActiveRewardsCardTitle();
	}
	
	@And("access the active rewards card title property and author the title")
	public void author_active_rewards_card_title() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataActiveRewardsCardTitle();
	}
	
	@And("user should be able to author active rewards card sub title")
	public void user_should_be_able_to_author_active_rewards_card_subtitle() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayActiveRewardsCardSubTitle();
	}
	
	@And("access the active rewards card sub title property and author the title")
	public void author_active_rewards_card_subtitle() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataActiveRewardsCardSubTitle();
	}
	
	@Then("the active rewards card title and sub title changes should be reflected on ctc site")
	public void title_subtitle_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyTitleAndSubTitleChangesReflected();
	}
	
	@And("user should be able to author yob")
	public void user_should_be_able_to_author_yob() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayYobInput();
	}
	
	@And("access and author the yob property")
	public void author_yob() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataYobInput();
	}
	
	@And("user should be able to author postal code")
	public void user_should_be_able_to_author_postal_code() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayPostalCodeInput();
	}
	
	@And("access and author the postal code property")
	public void author_postal_code() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataPostalCodeInput();
	}
	
	@Then("the yob and postal code changes should be reflected on ctc site")
	public void yob_and_postalcode_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyYobAndPostalCodeChangesReflected();
	}
	
	@And("user should be able to author continue cta")
	public void user_should_be_able_to_author_continue_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayContinueCta();
	}
	
	@And("access and author the continue cta property")
	public void author_continue_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataContinueCta();
	}
	
	@Then("the continue label changes should be reflected on ctc site")
	public void continue_label_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyContinueChangesReflected();
	}
	
	@And("user should be able to author cancel cta")
	public void user_should_be_able_to_author_cancel_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayCancelCta();
	}
	
	@And("access and author the cancel cta property")
	public void author_cancel_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataCancelCta();
	}
	
	@Then("the cancel label changes should be reflected on ctc site")
	public void cancel_label_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyActiveCardCancelChangesReflected();
	}
	
	@And("in error screen user should be able to author error image for active validation")
	public void in_active_validation_error_screen_user_should_be_able_to_author_error_image() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayErrorImageAEM();
	}
	
	@And("access and author the error image for active validation")
	public void in_active_validation_error_screen_author_error_image() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataErrorImage();
	}
	
	@And("enter postal code")
	public void enter_postal_code() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataPostalCode();
	}
	
	@And("enter year of birth")
	public void enter_year_of_birth() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataYob();
	}
	
	@Then("the error image changes should be reflected on ctc site")
	public void verify_error_image_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyErrorImageChangesReflected();
	}
	
	@And("in error screen user should be able to author error text for active validation")
	public void in_active_validation_error_screen_user_should_be_able_to_author_error_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayErrorTextAEM();
	}
	
	@And("access and author the error text for active validation")
	public void in_active_validation_error_screen_author_error_text() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataErrorText();
	}
	
	@Then("the error text changes should be reflected on ctc site")
	public void verify_error_text_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyErrorTextChangesReflected();
	}
	
	@And("in error screen user should be able to author tryagain cta")
	public void in_error_screen_user_should_be_able_to_author_continue_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayTryagainCta();
	}
	
	@And("access and author the error tryagain cta")
	public void in_active_validation_error_screen_author_continue_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataTryAgainCta();
	}
	
	@Then("the trygain cta changes should be reflected on ctc site")
	public void verify_error_continue_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyTryAgainChangesReflected();
	}
	
	@And("in error screen user should be able to author cancel cta")
	public void in_error_screen_user_should_be_able_to_author_cancel_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).displayErrorScreenCancelCta();
	}
	
	@And("access and author the error cancel cta")
	public void in_active_validation_error_screen_author_cancel_cta() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).enterDataErrorScreenCancelCta();
	}
	
	@Then("the cancel cta changes should be reflected on ctc site")
	public void verify_error_cancel_changes_should_be_reflected() throws Exception {
		testContext.getPageObjectManager().getAEMLinkExistingCardPage(PageObject.getDriver()).verifyCancelChangesReflected();
	}
	
	@And("validate the postal code does not enter more than 7 characters")
	public void validate_postal_code_field_property() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).validatePostalCodeRestrictCharacters();
	}

	@Then("postal code and yob inline errors should be displayed")
	public void inline_errors_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayInlineErrors();
	}
	
	@Then("incorrect postal code inline error should be displayed")
	public void incorrect_inline_error_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).displayIncorrectPostalCodeInlineError();
	}
}
