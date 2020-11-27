package automation.library.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
/**
 * This file contains the functions of Home Page
 * 
 */
public class HomePage extends PageObject {
	
	TestContext testContext;
	

	public HomePage(WebDriver driver) {
		
		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Home Page */
	public void navigateTo_HomePage() throws Exception{
		
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		
	}
		/** This function click on Product */
	public void clickOnProduct() throws Exception {
	    $(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getAutomativeLocator()).click();
	   
	}
	
	/** This function click on Menu Icon */
	public void clickOnMenuIcon() throws Exception {
		
		 $(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getMenuIcon()).click(); 
		
	}
	
	/** This function navigate to account address  */
	public void navigateTo_account_address() throws Exception{
		
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Account_Address_URL());
		
	}
	

}
