package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of the user stories OCCP-3881 
 */
public class OCCP_1042_CustomerService_Accordion_Authorable extends BaseClass{


	public OCCP_1042_CustomerService_Accordion_Authorable(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	@When ("customerservice informational url for FR locale is available")
	public void customerservice_informational_copy_url_FR_is_available() throws Exception {
		
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).navigateTo_Customer_Service_Page_FR();
	}
	@Then ("validate the accordion plus icon is displayed")
	public void accordion_plus_icon_is_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Accordions_Plus_icon();

		}
	@Then ("click on accordion plus icon")
	public void click_accordion_plus_icon() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).click_Accordion_Plus_icon();

	}
	@Then ("validate the accordion Minus icon is displayed")
	public void accordion_minus_icon_is_displayed() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Accordions_Minus_icon();

	}
	@Then ("scroll down to accordion pannel")
	public void ScrollDown_to_accordion() throws Exception {
		testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).clickOnAccordionComponent();

	}
	@Then ("click on accordion minus icon")
	public void click_accordion_minus_icon() throws Exception {
		testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).click_Accordion_minus_icon();

	}
	@Then ("update title of Accordion")
	public void update_accordion_title() throws Exception {
		testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).updateAccordionTitle();

	}
	@Then ("validate the accordion title change is displayed on site")
	public void display_updated_accordion_title_on_site() throws Exception {
		testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).displayUpdatedAccordionTitle();

	}
	@Then ("update Header of Accordion")
	public void update_accordion_Header() throws Exception {
		testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).UpdateAccordionHeader();

	}
	
	  @Then ("validate the accordion header change is displayed on site") public
	  void accordion_header_is_displayed() throws Exception {
	  testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).displayUpdatedAccordionHeader();
	  
	 }
	 

	

}
