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

public class HomePage extends PageObject {
	
	TestContext testContext;
	

	public HomePage(WebDriver driver) {
		
		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_HomePage() throws Exception{
		
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		Thread.sleep(5000);
		Log.message("Driver:- " + driver.getTitle(), true);
		
		Thread.sleep(5000);
		driver.findElement(By.className("global-store__content__section__arrow")).click();
		Thread.sleep(5000);
		Log.message("Driver:- " + driver.getTitle(), true);
	}

	public void clickOnProduct() throws Exception {
    
		//$(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getArrow()).click();

	    $(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getAutomativeLocator()).click();
	   
	}
	
	public void clickOnMenuIcon() throws Exception {
		
		 $(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getMenuIcon()).click();
		 

	    
		
	}

}
