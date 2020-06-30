package automation.library.stepDefinitions;


import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.logdetail.Log;
import automation.library.pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class HomePageSteps {

	
	TestContext testContext;
    HomePage homePage;
    private WebDriver driver;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage =  testContext.getPageObjectManager().getHomePage();
	
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		homePage.navigateTo_HomePage();
		
		
	}

	@When("^User click on any product$")
	public void user_click_on_any_product() throws Throwable {
		
		homePage.clickOnProduct();
	}

}
