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
public class OCCP_3881_Customer_Service_Informational_Copy_Step extends BaseClass{
	

		public OCCP_3881_Customer_Service_Informational_Copy_Step(TestContext context) throws Exception {
			testContext = context;
			driverFactory = new DriverFactory();
			configFileReader = new ConfigFileReader();
		}
		
		@Given("customerservice informational copy url is available") 
		public void customerservice_informational_copy_url_is_available() throws Exception {
			
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).navigateTo_Customer_Service_Page();
		}
		
		@Then("customerservice page is displayed")
		public void customerservice_page_is_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Customer_Service_Page();
		}
		@And("title of customer service should be displayed")
		public void title_of_customer_service_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Title_Customer_Service_Page();
		}
		@And("description should be displayed")
		public void description_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Description_Customer_Service_Page();
		}
		@And("accordions should be displayed")
		public void accordions_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Accordions_Customer_Service_Page();
		}
		@And("multiple topics should be displayed on the page")
		public void multiple_topics_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Multiple_Topics_Customer_Service_Page();
		}
		@And("section Separators should be displayed between topics to divide information")
		public void section_separators_should_be_displayed_between_topics_to_divide_information() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Section_Separators_Customer_Service_Page();
		}
		
		@And("stacked link list is displayed on mobile")
		public void stacked_link_list_is_displayed_on_mobile() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Multiple_Topics_Customer_Service_Page();
		}
		
		@And("links description should be displayed")
		public void links_description_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Links_Description();
		}
		
		@And("clickable title should be displayed")
		public void clickable_title_should_be_displayed() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).clickable_Title_Is_Displayed();
		}
		@Then("when clicks on the title,customer should be redirected to the subpage")
		public void clicks_on_the_title() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).verify_Redirected_To_The_Subpage_When_clicks_On_The_Title();
		}
		@When("AEM author with access to configure customer service page component")
		public void aem_author_with_access_to_configure_customer_service_page_component() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).navigate_To_Author_Customer_Service_Page_Url();
		}
		@And("click on title and content component")
		public void click_on_title_and_content_component() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).clickOnTitleAndContentComponent();
		}
		@And("click on Accordion component")
		public void click_on_Accordion_component() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).clickOnAccordionComponent();
		}
		@Then("update title of customer service")
		public void update_title_of_customer_service() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).updateTitleOfCustomerService();
		}
		@And("title changes should be reflected on ctc site")
		public void title_changes_should_be_reflected_on_ctc_site() throws Exception {
			testContext.getPageObjectManager().getCustomerServicePage(PageObject.getDriver()).display_Title_Customer_Service_Page();
		}
		@When("AEM author with access to configure to fr locale customer service page component")
		public void aem_author_with_access_to_configure_to_fr_locale_customer_service_page_component() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).navigate_To_Author_Customer_Service_Page_Url_Fr();
		}
		@Then("update subtitle of customer service")
		public void update_subtitle_of_customer_service() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).updateSubTitleOfCustomerService();
		}
		@And("sub title changes should be reflected on ctc site")
		public void subtitle_changes_should_be_reflected_on_ctc_site() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).displaySubTitleOfCustomerService();
		}
		@And("click on link list component")
		public void click_on_link_list_component() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).clickOnLinkListComponent();
		}
		@Then("update title of link list")
		public void update_title_of_link_list() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).updateTitleOfLinkList();
		}
		@Then("update description of link list")
		public void update_description_of_link_list() throws Exception {
			testContext.getPageObjectManager().getAEMCustomerServiceInformationalCopyPage(PageObject.getDriver()).updateDescriptionOfLinkList();
		}
		
}
