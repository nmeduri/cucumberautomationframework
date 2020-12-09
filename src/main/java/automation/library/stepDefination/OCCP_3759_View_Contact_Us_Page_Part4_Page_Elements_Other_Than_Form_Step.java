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
 * This file contains the scenario of user stories OCCP-3759
 */

public class OCCP_3759_View_Contact_Us_Page_Part4_Page_Elements_Other_Than_Form_Step extends BaseClass{

	public OCCP_3759_View_Contact_Us_Page_Part4_Page_Elements_Other_Than_Form_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();

	}
	
	@Given("AEM author with access to configure Contact us authorable page")
	public void aem_author_with_access_to_configure_contact_us_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).navigateTo_Contact_Us_Author_Page();
	}
	@And("^click on contact us component$")
	public void click_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).clickContactUsComponent();
	}
	@Then("configure the select icon for email section on contact us component")
	public void configure_the_select_icon_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).selectIconForEmailSectionContactUsComponent();
	}
	@And("configure the email title for email section on contact us component")
	public void configure_the_email_title_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).enterEmailTitleForEmailSection();
	}
	@And("configure the select format for promo tiles for email section on contact us component")
	public void configure_the_select_format_for_promo_tiles_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).selectFormatForPromoTiles();
	}
	@And("configure the email link label for email section on contact us component")
	public void configure_the_email_link_label_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).enterEmailLinkLabelForEmailSection();
	}
	@And("configure the email link value for email section on contact us component")
	public void configure_the_email_link_value_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).enterEmailLinkValueForEmailSection();
	}
	@And("configure the Select target to open the email link for email section on contact us component")
	public void configure_the_select_target_to_open_the_email_link_for_email_section_on_contact_us_component() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).selectTargetToOpenTheEmailLink();
	}
	@Then("verify the configured contact us details are displayed")
	public void verify_the_configured_contact_us_details_are_displayed() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).verifyContactUsDetails();
	}
	@Given("AEM author with access to configure Contact us fr locale authorable page")
	public void aem_author_with_access_to_configure_contact_us_fr_locale_authorable_page() throws Exception {
		testContext.getPageObjectManager().getAEMContactUsPage(PageObject.getDriver()).navigateTo_Contact_Us_Author_Fr_Locale_Page();
	}
	
}
