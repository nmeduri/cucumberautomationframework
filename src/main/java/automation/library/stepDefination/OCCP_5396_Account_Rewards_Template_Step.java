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
}
