package automation.library.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

public class Sign_Up_Page extends PageObject {
	
	TestContext testContext;
	

	public Sign_Up_Page(WebDriver driver) {
		
		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_Sign_Up_Page() throws Exception{
		
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getSignUpUrl());
		
	}

	public void clickOnAddToCartButton() throws Exception {

	    $(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();
	   
	}
	
	

}
