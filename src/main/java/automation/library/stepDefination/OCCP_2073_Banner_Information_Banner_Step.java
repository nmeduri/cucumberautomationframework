package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
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


}
