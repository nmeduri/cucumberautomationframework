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
public class OCCP_983_PDP_Features_Step extends BaseClass {
      PDP_Page pdpPage;
	public OCCP_983_PDP_Features_Step(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage();
		configFileReader = new ConfigFileReader();
	}
	
	@Then("user must see all features of the product displayed in a bulleted list")
	public void product_features_displayed_in_bulleted_list() throws Exception {
		
		testContext.getPageObjectManager().getPDPPage().displayFeaturesSection();
		testContext.getPageObjectManager().getPDPPage().displayFeaturesInBulletList();
	}
}
	