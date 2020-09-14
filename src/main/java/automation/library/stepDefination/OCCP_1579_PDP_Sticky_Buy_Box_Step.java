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

public class OCCP_1579_PDP_Sticky_Buy_Box_Step extends BaseClass   {
		PDP_Page pdpPage;
		
      public OCCP_1579_PDP_Sticky_Buy_Box_Step(TestContext context) throws Exception {
    	  testContext = context;
    	  pdpPage = testContext.getPageObjectManager().getPDPPage();
		
    	  configFileReader = new ConfigFileReader();
		}
	
	@When("user scrolls down past the buy box")
	public void user_scrolls_down_past_buy_box() throws Exception {
		testContext.getPageObjectManager().getPDPPage().scrollDownToStickyAddToCart();
		
	}

	@Then("Sticky Add to Cart with product information must be displayed")
	public void display_of_sticky_add_to_cart() throws Exception {
		testContext.getPageObjectManager().getPDPPage().displayStickyAddToCart();
	}
	
	
}

