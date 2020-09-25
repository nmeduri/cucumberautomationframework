package automation.library.pageObjects;

import java.util.List;
import java.util.Set;

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
 * This file contains the functions of Get Personalized Offers Page
 * 
 */

public class Get_Personalized_Offers_Page extends PageObject {

	
	TestContext testContext;

	public Get_Personalized_Offers_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function click on next button */
	public void click_Next_Button() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Next_Button())), 60);
	}
	
	/** This function is verify that Header 'Get Personalized Offers' is displayed */
	public void display_Header_Get_Personalized_Offers() throws Exception{
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Header_Get_Personalized_Offers_Page())), 60);
	}
	
	/** This function is verify that CASL Checkbox is displayed */
	public void display_CASL_Checkbox() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_CASL_Checkbox()));
	}
	
	/** This function is verify that Opt In is displayed */
	public void display_Opt_In() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Opt_In()));
	}
	
	/** This function is verify that 'Email Me About Offers And Sales' is displayed */
	public void display_Email_Me_About_Offers_And_Sales() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Email_Me_About_Offers_And_Sales()));
	}
	
	/** This function click on Tool Tip Email Me About Offers and Sales */
	public void click_Tool_Tip_Email_Me_About_Offers_And_Sales() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Opt_In()));
	}
	
	/** This function is verify that Message Email Me About Offers and Sales */
	public void display_Message_Email_Me_About_Offers_And_Sales() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Message_Email_Me_About_Offers_And_Sales()));
	}
	
	/** This function click on Tool Tip Close Button */
	public void click_Tool_Tip_Close_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Tool_Tip_Close_Button()));
	}
	
	/** This function is verify that 'Tool Tip Close' button is not displayed */
	public void not_Display_Tool_Tip_Close_Button() throws Exception {
		Assert.assertFalse($display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Message_Email_Me_About_Offers_And_Sales())));
	}
	
	/** This function is verify that CASL Subscription Toggle' is by default off */
	public void display_CASL_Subscription_Toogle_Off_Bydefault() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_CASL_Subscription_Toogle_Off_Bydefault()));
	}
	
	/** This function click on CASL Subscription Toggle Off Button */
	public void click_CASL_Subscription_Toogle_Off_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_CASL_Subscription_Toogle_Button()));
	}
	
	/** This function is verify that user is able to click on CASL Subscription Toggle Off Button */
	public void verify_Able_Click_On_CASL_Subscription_Toogle_Off_Button() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Able_CASL_Subscription_Toogle_Button()));
	}
	
	/** This function is verify that Subscription Toggle Button is off */
	public void verify_Off_Subscription_Toogle_Button() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Off_CASL_Subscription_Toogle_Button()));
	}

}
