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

public class Rewards_Terms_Conditions_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	ArrayList<Integer> rating = new ArrayList<Integer>();
	List<Float> price = new ArrayList<Float>();

	public Rewards_Terms_Conditions_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that header Rewards Terms And Conditions is displayed */
	public void displayHeaderRewardsTermsAndConditions() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Header_Rewards_Terms_Conditions()));
	}
	
	/** This function clicks on register card button */
	public void clickRegisterCardButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Button_Register_Card()));
	}
	
	/** This function is verify that button register card is displayed */
	public void displayRegisterCardButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Button_Register_Card()));
	}
	
	/** This function is verify that button cancel is displayed */
	public void displayCancdlButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Cancel_Button()));
	}
	
	/** This function clicks on cancel button */
	public void clickCancdlButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Cancel_Button()));
	}
	
	/** This function is verify that file open in .pdf format */
	public void verifyRewardsLinkInPdf() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Rewards_Link()));
		String href = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Rewards_Link()), "href");
		Assert.assertTrue(href.contains(".pdf"));
	}
	
	/** This function is verify that button register card is enabled */
	public void enableRegisterCardButton() throws Exception {
		$findElement($By(Loc.XPATH, testContext.getPageObjectManager().getRewardsTermsAndConditionsLocator().get_Button_Register_Card())).isEnabled();
	}
}
