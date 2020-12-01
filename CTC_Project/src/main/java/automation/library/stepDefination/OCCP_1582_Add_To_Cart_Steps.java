package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
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
 * This file contains the scenario of user stories - 1582
 */

public class OCCP_1582_Add_To_Cart_Steps extends BaseClass {
     
	public OCCP_1582_Add_To_Cart_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user enter number in the quantity box that is greater than maximum quantity")
	public void user_enter_number_in_the_quantity_box_that_is_greater_than_maximum_quantity() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).enterQuantityGreaterThanMaxixmum();
	}
	
	@Then("greater than maximum quantity is not updated in the quantity box")
	public void greater_Than_Maximum_Quantity_Is_Not_Updated_In_The_Quantity_Box() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifyQuantityGreaterThanMaximumNotUpdate();
	}
}
