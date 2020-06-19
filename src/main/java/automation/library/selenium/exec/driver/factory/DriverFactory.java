package automation.library.selenium.exec.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.selenium.exec.driver.manager.ChromeDriverManager;
import automation.library.selenium.exec.driver.manager.FirefoxDriverManager;

public class DriverFactory {

	Property prop;
	private static DriverFactory instance = new DriverFactory();
	protected DriverFactory() {
		prop = new Property();
	}

	

	public static DriverFactory getInstance() {
		return instance;
	}

	ThreadLocal<DriverManager> driverManager = new ThreadLocal<DriverManager>() {
		protected DriverManager initialValue() {
			return setDM();
		}
	};

	public DriverManager driverManager() {
		return driverManager.get();
	}

	public WebDriver getDriver() {
		return driverManager.get().getDriver();
	}

	public WebDriver returnDriver() {
		return driverManager.get().returnDriver();
	}

	public WebDriverWait getWait() {
		return driverManager.get().getWait();
	}

	public DriverManager setDM() {
		
		String browserType = ConfigFileReader.getProperty(Constant.SELENIUM_CONFIGURATION, "browser");
        Log.message("Browser:- " + browserType, true);
		switch (browserType) {

		case "chrome":
			driverManager.set(new ChromeDriverManager());
			break;
		case "firefox":
			driverManager.set(new FirefoxDriverManager());
			break;
		}

		return driverManager.get();

	}

}
