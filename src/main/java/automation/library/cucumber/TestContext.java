package automation.library.cucumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import automation.library.managers.DriverManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.exec.driver.factory.DriverFactory;

public class TestContext {
	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;
	private WebDriver driver;
	
	public TestContext() {
		
		
		pageObjectManager = new PageObjectManager(DriverFactory.getInstance().driverManager().getDriver());
		scenarioContext = new ScenarioContext();
	}
	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}