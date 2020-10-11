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
import automation.library.dataProviders.ConfigFileReader;
import automation.library.pageObjects.PDP_Page;

/**
 * This file contains the scenario of user stories OCCP-2073
 */
public class OCCP_2073_BANNER_Information_Banner extends BaseClass{
	PDP_Page pdpPage;

	public OCCP_2073_BANNER_Information_Banner(TestContext context) throws Exception {
		testContext = context;
		pdpPage = testContext.getPageObjectManager().getPDPPage(driver);
		configFileReader = new ConfigFileReader();
	}
	@Then("verify user is on the page where info banner is loaded")
	public void display_Information_Banner() throws Exception {

		testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBanner();
	}
	@And ("verify all the content configured in info banner page")
	public void display_Information_Banner_Content() throws Exception {

		testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBannerLink();
		testContext.getPageObjectManager().get_Header_Locator_Page().get_informationBannerText();

	}
}