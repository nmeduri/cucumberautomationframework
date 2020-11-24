package automation.library.pageObjects;

import static org.testng.Assert.fail;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Checkout Page
 * 
 */
public class Checkout_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Checkout_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}
	
	/** This function navigate to PDP Page */
	public void navigateTo_Checkout_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getCheckoutPageUrl());

	}
	/** This function is verify that Checkout Page is displayed */
	public void display_Checkout_Page_Title() throws Exception {

		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("Automation_SimpleheaderCheckout")) {
		Log.message("Checkout page is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Checkout page is not displayed", true);
			fail();
		}
	}
	/** This function is verify that Brand Logo is displayed */
	public void displayBrandLogo() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Brand_Logo())), 10);
	}
	/** This function is verify that Customer Service Contact Number is displayed */
	public void displayCustomerServiceContactNumber() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Customer_Service_Contact_Number())), 10);
	}
	/** This functionclick on Customer Service Contact Number  */
	public void clickCustomerServiceContactNumber() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Customer_Service_Contact_Number())), 10);
	}
	/** This function is verify that Site Language Selector is displayed */
	public void displaySiteLanguageSelector() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Site_Language_Selector())), 10);
	}
	/** This function click on Brand Logo */
	public void click_On_Brand_Logo() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getCheckoutPageLocator().get_Brand_Logo())), 40);
	}
	/** This function is verify that Home Page is displayed */
	public void display_Home_Page() throws Exception {

		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("Shop Canada’s Top Department Store Online & at 500+ Locations | Canadian Tire")) {
		Log.message("Home page is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Home page is not displayed", true);
			fail();
		}
	}
	
}
