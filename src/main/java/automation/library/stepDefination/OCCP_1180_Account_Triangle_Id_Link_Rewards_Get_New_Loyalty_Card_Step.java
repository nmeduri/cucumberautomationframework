package automation.library.stepDefination;

import static org.testng.Assert.fail;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OCCP_1180_Account_Triangle_Id_Link_Rewards_Get_New_Loyalty_Card_Step extends BaseClass {
	
	public OCCP_1180_Account_Triangle_Id_Link_Rewards_Get_New_Loyalty_Card_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user clicks on cancel link")
	public void user_clicks_on_cancel_link() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).cickCancelLink();
	}
	
	@Then("user should be returned to initial link cards screen")
	public void user_should_returned_to_initial_link_card_screen() throws Exception {
		testContext.getPageObjectManager().getLinkYourTriangleRewardsAccountPage(PageObject.getDriver()).displayLinkYourTriangleRewardsAccountTitle();
	}
	
	@Then("user should navigate to success screen")
	public void user_should_navigate_to_success_screen() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).displayNewLoyaltyCardSuccessScreen();
	}
	
	@And("verify a mandatory field which is empty")
	public void user_verify_mandatory_field_empty() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).emptyPhoneNumber();
	}
	@Then("an inline error message should be displayed below the field")
	public void user_should_see_inline_error_message() throws Exception {
		testContext.getPageObjectManager().getANewTriangleRewardsCardPage(PageObject.getDriver()).displayPhoneNoInlineError();
	}

}
