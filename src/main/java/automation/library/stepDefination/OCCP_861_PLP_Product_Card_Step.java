package automation.library.stepDefination;


import java.util.Set;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OCCP_861_PLP_Product_Card_Step extends BaseClass {
	PLP_Page plpPage;
	public OCCP_861_PLP_Product_Card_Step(TestContext context) throws Exception {
		testContext = context;
		plpPage = testContext.getPageObjectManager().getPLPPage();
		configFileReader = new ConfigFileReader();
	
	}

	@Then("rating and review section should not be displayed if customer rating is zero")
	public void display_of_review_section() throws Exception {
		testContext.getPageObjectManager().getPLPPage().notDisplayRatingSection();
		
		
	}
}
