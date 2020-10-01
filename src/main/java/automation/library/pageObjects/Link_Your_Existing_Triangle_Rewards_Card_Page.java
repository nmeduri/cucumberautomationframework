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
	
	/** This function enters card number */
	public void enter_Card_Number(String data) throws Exception {
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
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button()));
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
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Deactivated_Error_Message()));
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
	
}
