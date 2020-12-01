package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OCCP_2073_Banner_Information_Banner_Step extends BaseClass {
	
	public OCCP_2073_Banner_Information_Banner_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@When("AEM author with access navigates to configure information banner authorable page")
	public void navigate_to_information_banner_page() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).navigateToInformationBanner();
	}
	
	@And("click on information banner component")
	public void click_on_information_banner() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).clickOnInformationBanner();
	}
	
	@And("do not fill the information text mandotary field")
	public void do_not_fill_information_text() throws Exception {
		testContext.getPageObjectManager().getAEMHeaderPage(PageObject.getDriver()).doNotEnterdataInformationText();
	}
	
	@Then("access the header and verify if information banner is present above the header")
	public void information_banner_is_present() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayInformationBanner();
	}
	
	@And("user should be able to see configured text and background")
	public void verify_text_and_background() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayInformationBannerText();
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayInformationBannerBackgroundColor();
	}
	
	@And("verify if user is able to see configured hyperlink")
	public void verify_configured_hyperlink() throws Exception {
		testContext.getPageObjectManager().getHeaderPage(PageObject.getDriver()).displayInformationBannerHyperlink();
	}


}
