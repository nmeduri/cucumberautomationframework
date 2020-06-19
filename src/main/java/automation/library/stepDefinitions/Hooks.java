package automation.library.stepDefinitions;


import automation.library.cucumber.TestContext;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;

	}

	@Before
	public void BeforeSteps() {
		
	}

	@After
	public void AfterSteps() {
		
		DriverFactory.getInstance().driverManager().closeDriver();
	}

}
