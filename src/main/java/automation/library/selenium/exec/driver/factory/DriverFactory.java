package automation.library.selenium.exec.driver.factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.exec.driver.manager.ChromeDriverManager;
import automation.library.selenium.exec.driver.manager.ChromeDriver_Headless_Manager;
import automation.library.selenium.exec.driver.manager.ChromeWideScreen_Headless_DriverManager;
import automation.library.selenium.exec.driver.manager.FirefoxDriverManager;
import automation.library.selenium.exec.driver.manager.HeadLessDriverManager;
import automation.library.selenium.exec.driver.manager.MobileChromeDriverManager;
import automation.library.selenium.exec.driver.manager.Mobile_Chrome_Sauce_Lab_DriverManager;
import automation.library.selenium.exec.driver.manager.SAP_Headless_DriverManager;
import automation.library.selenium.exec.driver.manager.Web_Chrome_Sauce_Lab_DriverManager;
import automation.library.selenium.exec.driver.manager.WideScreenChromeDriverManager;
import automation.library.selenium.exec.driver.manager.Wide_Screen_Sauce_Lab_DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory extends BaseClass {

	protected static WebDriver driver;
	Property prop;
	private static DriverFactory instance = new DriverFactory();
	ConfigFileReader configFileReader;

	protected DriverFactory() {
		prop = new Property();
		configFileReader = new ConfigFileReader();
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
		
		String String = (java.lang.String) conf.getProperty("className");
		Log.message("String:- " + String, true);
		switch (configFileReader.getServerType()) {
		case "saucelabs":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Web_Chrome_Sauce_Lab_DriverManager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner") || String.equalsIgnoreCase("Latest_Commit_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Mobile_Chrome_Sauce_Lab_DriverManager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Wide_Screen_Sauce_Lab_DriverManager());
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				driverManager.set(new SAP_Headless_DriverManager());
				break;
			}
			break;
		case "headless":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner") || String.equalsIgnoreCase("Latest_Commit_Runner") || String.equalsIgnoreCase("Last_Commit_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new ChromeDriver_Headless_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new Mobile_Chrome_Sauce_Lab_DriverManager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new ChromeWideScreen_Headless_DriverManager());
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				driverManager.set(new SAP_Headless_DriverManager());
				break;
			}
			break;
		case "without headless":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner") || String.equalsIgnoreCase("Latest_Commit_Runner") || String.equalsIgnoreCase("Last_Commit_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new ChromeDriverManager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new MobileChromeDriverManager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new WideScreenChromeDriverManager());
				break;
			} else if (String.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			} else if (String.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
				driver = new SafariDriver();
				driver.manage().window().maximize();
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new SAP_Headless_DriverManager());
				break;
			}

		}
		return driverManager.get();
	}
}
