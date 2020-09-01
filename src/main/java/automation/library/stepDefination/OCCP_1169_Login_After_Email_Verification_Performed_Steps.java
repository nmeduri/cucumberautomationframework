package automation.library.stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class OCCP_1169_Login_After_Email_Verification_Performed_Steps extends BaseClass{

	public OCCP_1169_Login_After_Email_Verification_Performed_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user click on forgot password")
	public void user_click_on_forgot_password() throws Exception {
		testContext.getPageObjectManager().getLoginPage(PageObject.getDriver()).click_Forgot_Password();
	}
	
	@Then("forgot password page is displayed")
	public void forgot_password_page_is_displayed() throws Exception {
		testContext.getPageObjectManager().getForgotPasswordPage(PageObject.getDriver()).display_Header_Forgot_Password_Page();
	}

}
