package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OCCP_1042_Customer_Service_Accordion_Configure_Description_Step extends BaseClass {
	public OCCP_1042_Customer_Service_Accordion_Configure_Description_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
//   @And("click on aem wrench button")
//   public void click_on_aem_wrench_button() throws Exception{
//	   testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).clickWrenchToEdit();
//   }
	
	@Then("update description of customer service")
	public void update_description_of_customer_service() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).updateDescription();
	}
	

	@Then("the configured description is displayed on the screen")
	public void configured_description_is_displayed_on_the_screen() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).assertDescriptiononPublish();
	}
	
	@And("revert description of customer service")
	public void revert_description_of_customer_service() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).revertDescription();
	}
}
