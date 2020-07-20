package automation.library.selenium.exec.driver.factory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.selenium.exec.driver.manager.ChromeDriverManager;
import automation.library.selenium.exec.driver.manager.FirefoxDriverManager;
import automation.library.selenium.exec.driver.manager.HeadLessDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	protected static WebDriver driver;
	Property prop;
	private static DriverFactory instance = new DriverFactory();
	ConfigFileReader configFileReader;

	public DriverFactory() {
		prop = new Property();
		configFileReader = new ConfigFileReader();
	}

	public static DriverFactory getInstance() {
		return instance;
	}

	ThreadLocal<DriverManager> driverManager = new ThreadLocal<DriverManager>();

	public DriverManager driverManager() {
		return driverManager.get();
	}

	public WebDriver returnDriver() {
		return driverManager.get().returnDriver();
	}

	public WebDriverWait getWait() {
		return driverManager.get().getWait();
	}

	public WebDriver getDriver(String String) throws Exception {

		switch (configFileReader.getServerType()) {
		case "saucelabs":
			Log.message("sauce labs", true);
			break;
		case "headless":
			switch (String) {
			case "chrome":
				Log.message("Head less", true);
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				options.addArguments("window-size=1200x600");
				driver = new ChromeDriver(options);
				break;
			case "headless mobile":
				Log.message("Head less", true);
				WebDriverManager.phantomjs().setup();
				driver = new PhantomJSDriver();
				break;
			}
			break;
		case "without headless":
			switch (String) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "mobile-chrome":
				WebDriverManager.chromedriver().setup();
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				driver = new ChromeDriver(chromeOptions);
				break;
			}
			break;

		default:

		}
		return driver;

	}

}
