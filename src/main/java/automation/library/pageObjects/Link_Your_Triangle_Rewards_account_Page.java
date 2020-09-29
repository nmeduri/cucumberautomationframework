package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Link Your Triangle Rewards Account Page
 * 
 */

public class Link_Your_Triangle_Rewards_account_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Link_Your_Triangle_Rewards_account_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that Title 'Link Your Triangle Rewards Account' is displayed */
	public void displayLinkYourTriangleRewardsAccountTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_Link_Your_Triangle_Rewards_Account_Title())), 3);
	}
	
	/** This function click on Get New Triangle Rewards Card */
	public void clickGetNewTriangleRewardsCard() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_A_New_Triangle_Rewards_Account_Title()));
	}
	
	/** This function click on Triangle Reward Card */
	public void click_Triangle_Reward_Card() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_Triangle_Reward_Card())), 40);
	}
	
	/** This function clicks on Try Again button */
	public void click_TryAgain_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button()));
	}
	
	
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
	
	/** This function verify that Error Image is displayed */
	public void display_Error_Image() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_Error_Image()));
	}
	
	/** This function verify that Triangle ID Logo is displayed */
	public void display_TriangleId_Logo() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_TriangleId_Logo()));
	}
	
	/** This function verify that Deactivated Error Text is displayed */
	public void verify_Deactivated_Error_Text() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountLocator().get_Deactivated_Error_Text()));
		
		
	}
}
