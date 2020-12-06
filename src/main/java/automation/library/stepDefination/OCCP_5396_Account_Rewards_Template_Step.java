package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OCCP_5396_Account_Rewards_Template_Step extends BaseClass{

	public OCCP_5396_Account_Rewards_Template_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}

	@When("AEM author with access to configure Account Rewards Page")
	public void AEM_author_with_access_to_configure_Account_Rewards_Page() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.navigateTo_Account_Rewards_Template_AEM();
	}
	
	@When("AEM author with access to configure Account Addresses Page")
	public void AEM_author_with_access_to_configure_Account_Addresses_Page() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.navigateTo_Account_Addresses_Template_AEM();
	}
	
	@When("AEM author with access to configure orderhistory Page")
	public void AEM_author_with_access_to_configure_orderhistory_Page() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.navigateTo_Account_OrderHistory_Template_AEM();
	}
	
	@And("click on drag components")
	public void click_on_drag_components() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.clickonDragComponent();
	}
	@And("verify user selects components from order history")
	public void verify_user_selects_components_from_orderhistory() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.clickonOrderHistory();
	}
	@And("click on insert component")
	public void click_on_insert_component() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.clickonInsert();
	}

	@And("user selects component to configure")
	public void user_selects_component_to_configure() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.selectComponent();
	}
	
	@And("verify all components are featured and banner related in the list")
	public void verify_all_components_are_featured_and_banner_related_in_the_list() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.verifyComponents();
	}
	@When("AEM author with access to configure Account Payment Information Page")
	public void When_AEM_author_with_access_to_configure_Account_Payment_Information_Page() throws Exception{
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
		.navigateTo_Account_PaymentInformation_Template_AEM();
	}
	
	@And("user selects Account Payment Options component to configure")
	public void user_selects_Account_Payment_Options_component_to_configure() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.selectMyAccountPaymentOptions();
	}
	
	@When("AEM author with access to configure Account Preferences Template Page")
	public void AEM_author_with_access_to_configure_Account_Preferences_Template_Page() throws Exception{
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
		.navigateTo_Account_PaymentPreferences_Template_AEM();
	}

   	@And("user selects Account Preferences component to configure")
	public void use_selects_Account_Preferences_component_to_configure() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.selectMyAccountPreferences();
	}
   	
   	@When("AEM author with access to configure Account Personal Information my account profile page")
   	public void AEM_author_with_access_to_configure_Account_Personal_Information_my_account_profile_page() throws Exception{
   		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
		.navigateTo_Account_Personal_Information_Template_AEM();
   	}
     	
   	@And("click on myaccount profile component")
	public void click_on_myaccount_profile_component() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.clickonMyAcctProfile();
	}
   	
   	@And("verify user is able to access my profile template")
	public void verify_user_is_able_to_access_my_profile_template() throws Exception {
		testContext.getPageObjectManager().getAccountRewardsTemplatePage(PageObject.getDriver())
				.verifyMyProfilepage();
	}
}
