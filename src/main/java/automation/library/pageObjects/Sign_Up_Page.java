package automation.library.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

/**
 * This file contains the functions of Sign Up Page
 * 
 */

public class Sign_Up_Page extends PageObject {
	
	TestContext testContext;
	

	public Sign_Up_Page(WebDriver driver) {
		
		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to sign up page */
	public void navigateTo_Sign_Up_Page() throws Exception{
		Log.message("URL:- " + FileReaderManager.getInstance().getConfigReader().getSignUpUrl(), true);
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getSignUpUrl());
		
	}

	/** This function click on add to cart button */
	public void clickOnAddToCartButton() throws Exception {

	    $(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();
	   
	}
	
	/** This function navigate to sign up page for fr Locale */
	public void navigateTo_Sign_Up_Page_Fr_Locale() throws Exception{
		Log.message("URL:- " + FileReaderManager.getInstance().getConfigReader().getSignUpUrl_Fr(), true);
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getSignUpUrl_Fr());
		
	}
	/** This function is verify that sign up page header is displayed */
	public void display_Sign_Up_Header_Fr() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Your_Triangle_Header_Fr())), 15);
	}
	/** This function is verify that Registration page is displayed */
	public void display_Registration_Page() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getCreateTriangleIDPageLocatorPage().get_Create_Your_Triangle_ID_Header())), 20);
	}


}
