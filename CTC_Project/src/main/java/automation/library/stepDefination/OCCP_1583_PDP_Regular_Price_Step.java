package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * This file contains the scenario of user stories OCCP-1583
 */

public class OCCP_1583_PDP_Regular_Price_Step extends BaseClass   {
		
		
      public OCCP_1583_PDP_Regular_Price_Step(TestContext context) throws Exception {
    	  testContext = context;
  		driverFactory = new DriverFactory();
  		configFileReader = new ConfigFileReader();
		}
	
      @Then("Product Unit Price must be displayed")
  		public void display_of_product_price() throws Exception {
  			testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayProductPrice();
  			testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).scrollDownToStickyAddToCart();
  			testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayProductPrice();
  	}
      
      @Then("user must see product unit price for mobile")
    	public void display_of_product_price_mobile() throws Exception {
    	  	testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).displayProductPrice();
}
}
