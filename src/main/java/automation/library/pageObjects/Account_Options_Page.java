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
 * This file contains the functions of Options in Account 
 * 
 */
public class Account_Options_Page extends PageObject {

	
	TestContext testContext;

	public Account_Options_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function display preferences option */
	public void display_PreferencesOption() throws Exception {
		//$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PreferencesOption()));
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PreferencesOption())), 10);
	}
	
	/** This function display wishlist option */
	public void display_WishListOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_WishlistOption()));
	}
	
	/** This function display personal info option */
	public void display_PersonalInfoOption() throws Exception {

		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PersonalInfoOption()));
	}
	
	/** This function display order history option */
	public void display_OrderHistory() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_OrderHistory()));
	}
	
	/** This function display Payment Information option */
	public void display_PaymentInfo() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PaymentInfo()));
	}
	
	/** This function display Address option */
	public void display_Address() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Address()));
	}
	
	/** This function display Reward option */
	public void display_Reward() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Reward()));
	}
	
	/** This function display preference option */
	public void display_Preference() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Preference()));
	}
	
	/** This function clicks on preferences option */
	public void Click_PreferencesOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PreferencesOption()));
	}
	
	/** This function clicks on Wishlist option */
	public void Click_WishListOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_WishlistOption()));
	}
	
	/** This function clicks on Personal Information option */
	public void Click_PersonalInfoOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PersonalInfoOption()));
	}
	
	/** This function click on order history option */
	public void Click_OrderHistory() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_OrderHistory()));
	}
	
	/** This function click on Payment information option */
	public void Click_PaymentInfo() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_PaymentInfo()));
	}
	
	/** This function click on Address option */
	public void Click_Address() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Address()));
	}
	
	/** This function click on Reward option */
	public void Click_Reward() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Reward()));
	}
	
	/** This function click on Preference option */
	public void Click_Preference() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_Preference()));
	}
	/** This function display sign option */
	public void display_SignIn() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_SignInOption()));
	}
	
	/** This function display Registration option */
	public void display_Registration() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_RegistrationOption()));
	}
	
	/** This function display SignOut option */
	public void display_SignOut() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_SignOutOption()));
	}
	
	/** This function Click SignOut option */
	public void click_SignOut() throws Exception {

		$click($(Loc.XPATH, testContext.getPageObjectManager().getAccount_Options_Page_Locator().get_SignOutOption()));
	}

}
