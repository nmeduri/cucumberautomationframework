package automation.library.stepDefination;


import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.HomePage;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HomePageSteps {

	
	TestContext testContext;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	DriverFactory driverFactory;
	ConfigFileReader configFileReader;

	private WebDriver driver;

	public HomePageSteps(TestContext context) throws Exception {
		testContext = context;
		
		configFileReader = new ConfigFileReader();
		homePage =  testContext.getPageObjectManager().getHomePage();
	}

//	@Given("^Adobe author url is up$")
//	public void adobe_author_url_is_up() throws Exception {
//		driver = driverFactory.getDriver(configFileReader.getBrowser());
//		pageObjectManager = new PageObjectManager();
//		homePage = new HomePage(driver);
//		testContext.getPageObjectManager().getHomePage(PageObject.getDriver());
//		homePage.navigateTo_HomePage();
//		
//	}
	
	@Given("^Adobe author url is up$")
	public void adobe_author_url_is_up() throws Exception {
		
		homePage.navigateTo_HomePage();
		
	}
	
	@Given("^User is on Home Page.$")
	public void user_is_on_Home_Pages() throws Exception{

	}

	@When("^user launches the author url$")
	public void user_launches_the_author_url() throws Throwable {
		
	}
	
	@Then("^Adobe author signin page is displayed$")
	public void adobe_author_signin_page_is_displayed() throws Throwable {
		
		
	}
	
	
	@Given("^SAP base url is up$")
	public void sap_base_url_is_up() throws Exception {
		
	}

	@When("^user launches the base url$")
	public void user_launches_the_base_url() throws Throwable {
		
	}
	
	@Then("^SAP Base site is displayed$")
	public void sap_base_site_is_displayed() throws Throwable {
		
		
	}

}
