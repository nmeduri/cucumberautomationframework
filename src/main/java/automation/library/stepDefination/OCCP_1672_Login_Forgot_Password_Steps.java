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
public class OCCP_1672_Login_Forgot_Password_Steps extends BaseClass{

	public OCCP_1672_Login_Forgot_Password_Steps(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user click back to sign in")
	public void display_Back_To_Sign_In() throws Exception {
		testContext.getPageObjectManager().getForgotPasswordPage(PageObject.getDriver()).click_Back_To_Sign_In();
	}
	
	@And("user enter incorrect email")
	public void user_enter_incorrect_email() throws Exception {
		testContext.getPageObjectManager().getForgotPasswordPage(PageObject.getDriver()).enterData_Email(FileReaderManager.getInstance().getDataReader().get_Invalid_Email());
	}
	
	@And("user click on send button")
	public void user_click_on_send_button() throws Exception {
		testContext.getPageObjectManager().getForgotPasswordPage(PageObject.getDriver()).click_Send_Button();
	}
	
	@And("user friendly inline error is displayed")
	public void user_friendly_inline_error_is_displayed() throws Exception {
		testContext.getPageObjectManager().getForgotPasswordPage(PageObject.getDriver()).displayMessageInvalidForgotPasswordEmail();
	}

}
