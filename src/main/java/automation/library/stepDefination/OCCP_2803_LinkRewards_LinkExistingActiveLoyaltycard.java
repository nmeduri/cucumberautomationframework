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
public class OCCP_2803_LinkRewards_LinkExistingActiveLoyaltycard  extends BaseClass{
	
       Login_Page loginPage;
	public OCCP_2803_LinkRewards_LinkExistingActiveLoyaltycard(TestContext context) throws Exception {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage(PageObject.getDriver());
		configFileReader = new ConfigFileReader();
	}
	@And ("user enters a loyalty card number that is active")
	public void user_enter_activated_card_number() throws Exception {
		Thread.sleep(2000);
		testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsCardPage(PageObject.getDriver()).enterData_activated_Card_Number();
	}
}