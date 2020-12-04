package automation.library.stepDefination;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
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
 * This file contains the scenario of PDP Page
 */

public class OCCP_1622_PDP_With_Product_Reviews_Buybox_Steps extends BaseClass {
      
	public OCCP_1622_PDP_With_Product_Reviews_Buybox_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("pdp one review product url is available")
	public void pdp_no_review_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_Page(FileReaderManager.getInstance().getDataReader().get_Product_One_Reviews());
	}
	
	@And("click on reviews section on buybox")
	public void click_on_reviews_section_on_buybox() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).clickReviewsSectionBuyBox();
	}
	
	@Given("fr pdp one review product url is available")
	public void fr_pdp_no_review_product_url_is_available() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).navigate_To_PDP_Product_FR_Page(FileReaderManager.getInstance().getDataReader().get_Product_One_Reviews());
	}
	
	@Then("the numeral zero is displayed in parentheses")
	public void the_nmeral_zero_is_displayed_in_parentheses() throws Exception {
		testContext.getPageObjectManager().getPDPPage(PageObject.getDriver()).verifhyZeroRatingCountInParentheses();
	}
	
}
