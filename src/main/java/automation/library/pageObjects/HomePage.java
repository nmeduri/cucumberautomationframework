package automation.library.pageObjects;

import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;

public class HomePage extends PageObject {

	TestContext testContext;

	public HomePage(WebDriver driver) {
		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_HomePage() {

		DriverFactory.getInstance().getDriver()
				.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	}

	public void clickOnProduct() throws Exception {

		$(Loc.XPATH, testContext.getPageObjectManager().getHomePageLocator().getAutomativeLocator()).click();
	}

}
