package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OCCP_3323_Link_Rewards_By_Triangle_Master_Card_OMP_Cards_Step extends BaseClass {
	
	
	public OCCP_3323_Link_Rewards_By_Triangle_Master_Card_OMP_Cards_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("enter OMP card details")
	public void enter_already_linked_mastercard_details() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).enterDataForOMPCardDetails();
	}
	
	@Then("user should be redirected to error screen")
	public void redirrected_to_error_screen() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).displayOMPCardErrorScreen();
	}
	
	@Then("scroll down to continue button in mobile")
	public void scroll_down_to_copyright_footer_component() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).scrollDownToContinue();
	}
		
	@And("user click on ompCard continue button")
	public void user_click_on_ompCard_continue_button() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).clickOnOmpCardContinueButton();
	}
	
	@And("user click on contact number")
	public void user_click_on_contact_number() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).clickOnContactNumber();
	}

	@Then("call popup should be displayed")
	public void call_popup_should_be_displayed() throws Exception {
		testContext.getPageObjectManager().getLinkMasterCardPage(PageObject.getDriver()).displayCallPopUpScreen();
	}
	
	
	
}


