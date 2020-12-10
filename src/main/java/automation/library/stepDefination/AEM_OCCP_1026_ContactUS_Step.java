/**
 * 
 */
package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

/**
 * @author naveen.kumar.meduri
 *
 */
public class AEM_OCCP_1026_ContactUS_Step extends BaseClass{
	public AEM_OCCP_1026_ContactUS_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	

	@When("^AEM author with access to contact us Page$")
	public void AEM_author_with_access_to_contact_us_Page() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).navigateTo_Contact_Us_CN_Author_Page();
	}
	
	@When("^AEM author with access to store details Page$")
	public void AEM_author_with_access_to_store_details_Page() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).navigateTo_Store_Details_CN_Author_Page();
	}
	
	@And("^click on contact us component for Canada$")
	public void click_on_contact_us_component_for_CN() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).clickContactUsComponentforCN();
	}
	
	@And("^enter data in title form$")
	public void enter_data_in_title_form() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).enterdataContactInfoTitle();
	}
	
	@And("^enter data in subject label$")
	public void enter_data_in_subject_label() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).enterdataSubjectLabel();
	}
	
	@And("^click on store details component for Canada$")
	public void click_on_store_details_component_for_Canada() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).clickonStoreDetails();
	}
	
	@And("^verify availability of components in desired order$")
	public void verify_availability_of_components_in_desired_order() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).verifyStoreDetailsComponents();
	}
	
	@And("^verify fields are editable$")
	public void verify_fields_are_editable() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).editfield();
	}
	
	@And("^revert direction label data$")
	public void revert_direction_label_data() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).reverteditfield();
	}
}

