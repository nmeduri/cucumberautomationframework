package automation.library.stepDefination;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.Login_Page;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-2809
 */
public class OCCP_2809_TriangleID_FailureCases_BalanceValidation_Card_Status_check_Step  extends BaseClass{
	
       Login_Page loginPage;
	    public OCCP_2809_TriangleID_FailureCases_BalanceValidation_Card_Status_check_Step(TestContext context) throws Exception {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage(driver);
		configFileReader = new ConfigFileReader();
	}
		@And ("user enters a closed loyalty card number")
		public void enter_closed_card_number() throws Exception {
			testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterData_Closed_Card_Number();
		}
		@Then ("verify an error message is displayed informing card is closed")
		public void display_card_Closed_error_message() throws Exception {
			testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_Closed_Error_Message();
		}
		@And ("user enters a Non-Existing card number")
		public void user_enter_nonexisting_card_number() throws Exception {
			testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterData_NonExisting_Card_Number();
		}
		@Then ("verify an error message is displayed informing card does not exist")
		public void display_card_nonExisting_error_message() throws Exception {
			testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).display_nonexisting_Error_Message();
		}

}