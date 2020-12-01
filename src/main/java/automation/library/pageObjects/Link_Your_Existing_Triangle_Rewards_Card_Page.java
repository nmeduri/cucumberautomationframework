package automation.library.pageObjects;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java8.Pa;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Rewards Terms And Condtions Page
 * 
 */

public class Link_Your_Existing_Triangle_Rewards_Card_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public Link_Your_Existing_Triangle_Rewards_Card_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function enters deactivated card number */
	public void enterData_Deactivated_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_Deactivated_Card_Number());
	}

	/** This function enters closed card number */
	public void enterData_Closed_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_Closed_Card_Number());
	}
	/** This function enters nonExisting card number */
	public void enterData_NonExisting_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_NonExisting_Card_Number());
	}
	/** This function enters activated card number */
	public void enterData_activated_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_Activated_Card_Number());
	}
	/** This function enters loyalty card number */
	public void enterData_loyalty_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_Loyalty_Card_Number());
	}
	
	/** This function enters card number */
	public void enter_Card_Number(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 40);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), data);
	}
	
	/** This function clicks on Continue button */
	public void click_Continue_Button() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Continue_Button())), 40);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Continue_Button()));
	}
	
	/** This function verify that Try Again button is displayed */
	public void display_TryAgain_Button() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button()));
	}
	
	/** This function clicks on try again button */
	public void click_TryAgain_Button() throws Exception {
		Thread.sleep(3000);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button())));
	}
	
	/** This function verify that user able to enter loyalty number */
	public void verfiyAbleToEnterLoyaltyNumber(String data) throws Exception {
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), "value");
		Log.message("Data:- " + data, true);
		Log.message("Atual Data:- " + actualValue.replace(" ", ""), true);
		Assert.assertEquals(data, actualValue.replace(" ", ""));
	}
	
	/** This function verify that Card number is not prepopulated */
	public void verify_CardNo_Not_Prepopulated() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()));
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), "value");
		Assert.assertNotEquals(actualValue, FileReaderManager.getInstance().getDataReader().get_Deactivated_Card_Number());
	}
	
	/** This function clicks on Cancel button */
	public void click_Cancel_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button()));
	}
	
	/** This function is verify that click button is displayed */
	public void displayClickButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button()));
	}
	/** This function verify that Deactivated Error message is displayed */
	public void display_Deactivated_Error_Message() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Deactivated_Error_Message())), 40);
	}
	/** This function verify that Closed card Error message is displayed */
	public void display_Closed_Error_Message() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_ClosedCard_Error_Message()));
	}
	/** This function verify that non-existing card Error message is displayed */
	public void display_nonexisting_Error_Message() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_nonExistingCard_Error_Message()));
	}
	
	/** This function verify that Error Image is displayed */
	public void display_Error_Image() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Error_Image()));
	}
	
	/** This function verify that user is able to see error image */
	public void displayErrorImageNotBlank() throws Exception {
		Assert.assertNotEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Error_Image()), "src"), "");
	}
	
	/** This function verify that Deactivated Error Text is displayed */
	public void verify_Deactivated_Error_Text() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Deactivated_Error_Text()));	
	}
	
	/** This function verify that Triangle ID Logo is displayed */
	public void display_TriangleId_Logo() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TriangleId_Logo()));
	}
	
	/** This function verify display of loyalty card number input field */
	public void display_Existing_Card_Screen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()));
	}
	
	/** This function verify that Cancel button is displayed */
	public void display_Cancel_Button() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button())),40);
	}
	
	/** This function verify that Triangle Reward card is displayed */
	public void display_Triangle_Reward_Card() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_Triangle_Reward_Card())), 40);
	}
	
	/** This function verify that title link your existing card is displayed */
	public void displayTitleLinkYourExistingCardPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Link_Existing_Card_Title()));
	}
	
	/** This function verify link card is displayed without card number details */
	public void verify_link_card_is_displayed_without_card_number_details() throws Exception {
		String actualValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), "value");
		
		Log.message("Atual Data:- " + actualValue.replace(" ", ""), true);
		Assert.assertEquals("", actualValue.replace(" ", ""));
	}
	
	/** This function enters pending loyalty card number */
	public void enterData_Pending_Card_Number() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_Pending_Loyalty_Card_Number());
	}
	
	/** This function verify cancel link is displayed */
	public void displayCancelLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button()));
	}
	
	/** This function verify header text is displayed */
	public void displayHeaderText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Header()));
	}
	
	/** This function verify sub header text is displayed */
	public void displaySubHeaderText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Sub_Header()));
	}
	
	/** This function verify input card number is displayed */
	public void displayInputCardNumber() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Sub_Header()));
	}
	
	/** This function verify Tooltip message and Icon is displayed */
	public void displayTooltipMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Tooltip_Message()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Tooltip()));
	}
	
	/** This function verify continue cta button is displayed */
	public void displayContinueCTA() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Continue_Button()));
	}
	
	/** This function verify generate card link is displayed */
	public void displayGenerateCardLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Generate_Card_link()));
	}
	
	/** This function enters incorrect format card number */
	public void enterCardNoIncorrectFormat() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Incorrect_Format_Card_Number()); 
	}
	
	/** This function enters long character card number */
	public void enterLongCharCardNo() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Long_Card_Number()); 
	}
	
	/** This function verify Inline error is displayed */
	public void displayInlineError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Inline_Error()));
	}
	
	/** This function verify not more than 16 characters are present */
	public void verifyNotAllowMoreCharacters() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()));
		Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Long_Card_Number(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), "value").replaceAll(" ", ""));
		Assert.assertTrue("restricted to 16 characters including 4 prepopulated", (($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), "value").replaceAll(" ", "")).length() <=12));
	}
	
	/** This function enters invalid or bad card number */
	public void enterBadCardNo() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Bad_Card_Number()); 
	}
	
	/** This function enters threshold card number */
	public void enterThresholdCardNo() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Threshold_Card_Number()); 
	}
	
	/** This function enters already linked card number */
	public void enterAlreadyLinkedCardNo() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Already_Linked_Card_Number()); 
	}
	
	/** This function verify Bad card error is displayed */
	public void displayBadCardErrorMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Bad_Card_Error()));
	}
	
	/** This function verify threshold card error is displayed */
	public void displayThresholdCardErrorMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Threshold_Card_Error()));
	}
	
	/** This function verify already linked card error is displayed */
	public void displayAlreadyLinkedCardErrorMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Already_Linked_Card_Error()));
	}

	/** This function verify that Header Text is displayed */
	public void displayActiveValidationHeaderText() throws Exception {
		$display(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Ownership_Validation_HeaderText())),40);
	}
	
	/** This function verify that Sub Header Text is displayed */
	public void displayActiveValidationSubHeaderText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Ownership_Validation_Sub_HeaderText()));
	}
	
	/** This function verify that Postal code is displayed */
	public void displayPostalCodeField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()));
	}
	
	/** This function verify that Year of birth is displayed */
	public void displayActiveYearOfBirthField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_YOB_CYP()));
		//$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 5);
	}
	
	/** This function verify that Year of birth is displayed */
	public void enterDataPendingCardNo() throws Exception {
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 5, FileReaderManager.getInstance().getDataReader().get_Active_Ownership_Card_Number());
	}
	
	/** This function verify not more than 7 characters are present */
	public void validatePostalCodeRestrictCharacters() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())), 5, FileReaderManager.getInstance().getDataReader().get_Long_Postal_Code()); 
		Assert.assertNotEquals(FileReaderManager.getInstance().getDataReader().get_Long_Postal_Code(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()), "value").replaceAll(" ", ""));
		Assert.assertTrue("restricted to 7 characters", (($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()), "value").replaceAll(" ", "")).length() <=7));
	}
	
	/** This function verify if AEM Input field is present */
	public void displayInlineErrors() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Mandatory_Postal_Code_Inline_Error()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Mandatory_YOB_Inline_Error()));
	}
	
	/** This function verify if AEM Input field is present */
	public void displayIncorrectPostalCodeInlineError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Incorrect_Postal_Code_Inline_Error()));
	}
	
}
