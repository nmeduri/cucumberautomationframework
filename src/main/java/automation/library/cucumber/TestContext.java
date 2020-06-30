package automation.library.cucumber;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import automation.library.managers.PageObjectManager;
import automation.library.selenium.exec.driver.factory.DriverFactory;

public class TestContext {
	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;
	private WebDriver driver;

	private static List<TestContext> threads = new ArrayList<TestContext>();
	
	private Map<String, Object> testdata = null;
	private Map<String, Object> fwSpecificData = null;
	private long threadToEnvID;

	public TestContext() {
		pageObjectManager = new PageObjectManager(DriverFactory.getInstance().driverManager().getDriver());
		scenarioContext = new ScenarioContext();
	}

	private TestContext(long threadID) {
		this.threadToEnvID = threadID;
	}

	public static synchronized TestContext getInstance() {
		long currentRunningThreadID = Thread.currentThread().getId();
		for (TestContext thread : threads) {
			if (thread.threadToEnvID == currentRunningThreadID) {
				return thread;
			}
		}
		TestContext temp = new TestContext(currentRunningThreadID);
		threads.add(temp);
		return temp;
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