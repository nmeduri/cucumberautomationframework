package automation.library.selenium.exec.driver.factory;

import static org.testng.Assert.fail;

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
import automation.library.selenium.exec.driver.manager.Without_Headless_Chrome_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Headless_Chrome_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Headless_Chrome_Wide_Screen_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Without_Headless_Firefox_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Without_Headless_Ipad_Chrome_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Without_Headless_Chrome_Mobile_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Chrome_Mobile_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Chrome_Wide_Screen_Driver_Manager;
import automation.library.selenium.exec.driver.manager.SAP_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Without_Headless_Safari_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Chrome_Tablet_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Chrome_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Edge_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Firefox_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_IE_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Sauce_Lab_Safari_Driver_Manager;
import automation.library.selenium.exec.driver.manager.Without_Headless_Chrome_Wide_Screen_Driver_Manager;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This file contains the Driver Manage Engine 
 */

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

	/** return driver manager */
	public DriverManager driverManager() {
		return driverManager.get();
	}

	/** return driver */
	public WebDriver getDriver() {
		return driverManager.get().getDriver();
	}

	/** return driver */
	public WebDriver returnDriver() {
		return driverManager.get().returnDriver();
	}

	
	/** return wait */
	public WebDriverWait getWait() {
		return driverManager.get().getWait();
	}

	/** This function call to server and browser */
	public DriverManager setDM() {
		
		String String = (java.lang.String) conf.getProperty("className");
		Log.message("String:- " + String, true);
		switch (configFileReader.getServerType()) {
		case "saucelabs":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Mobile_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Sauce Lab" + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Wide_Screen_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				driverManager.set(new SAP_Driver_Manager());
				break;
			}else if (String.equalsIgnoreCase("Adobe_Regression_Tablet_Runner")) {
				Log.message("Headless " + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Tablet_Driver_Manager());
			}else if (String.equalsIgnoreCase("Adobe_Regression_Web_firefox_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new Sauce_Lab_Firefox_Driver_Manager());
				break;
			}else if (String.equalsIgnoreCase("Adobe_Regression_Web_Safari_Runner")) {
				driverManager.set(new Sauce_Lab_Safari_Driver_Manager());
				break;
			}
			else if (String.equalsIgnoreCase("Adobe_Regression_Web_Internet_Explore_Runner")) {
				Log.message("Without Headless " + String, true);
				driverManager.set(new Sauce_Lab_IE_Driver_Manager());
			}
			else if (String.equalsIgnoreCase("Adobe_Regression_Web_Edge_Runner")) {
				Log.message("Without Headless " + String, true);
				driverManager.set(new Sauce_Lab_Edge_Driver_Manager());
			}
			break;
		case "headless":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner") || String.equalsIgnoreCase("Latest_Commit_Runner") || String.equalsIgnoreCase("Last_Commit_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new Headless_Chrome_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Mobile_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Heeadless " + String, true);
				driverManager.set(new Headless_Chrome_Wide_Screen_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				driverManager.set(new SAP_Driver_Manager());
				break;
			}else if (String.equalsIgnoreCase("Adobe_Regression_Tablet_Runner")) {
				Log.message("Without Headless " + String, true);
				driverManager.set(new Sauce_Lab_Chrome_Tablet_Driver_Manager());
			}
			break;
		case "without headless":
			if (String.equalsIgnoreCase("Adobe_BVT_Runner") || String.equalsIgnoreCase("Adobe_Regression_Web_Runner") || String.equalsIgnoreCase("Adobe_Regression_Runner") || String.equalsIgnoreCase("Latest_Commit_Runner") || String.equalsIgnoreCase("Last_Commit_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new Without_Headless_Chrome_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Mobile_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new Without_Headless_Chrome_Mobile_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Wide_Screen_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new Without_Headless_Chrome_Wide_Screen_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Web_firefox_Runner")) {
				Log.message("Without Heeadless " + String, true);
				driverManager.set(new Without_Headless_Firefox_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Adobe_Regression_Web_Safari_Runner")) {
				driverManager.set(new Without_Headless_Safari_Driver_Manager());
				break;
			} else if (String.equalsIgnoreCase("Sap_BVT_Runner") || String.equalsIgnoreCase("Sap_Regression_Runner")) {
				Log.message("Without Headless " + String, true);
				driverManager.set(new SAP_Driver_Manager());
				break;
			}else if (String.equalsIgnoreCase("Adobe_Regression_Tablet_Runner")) {
				Log.message("Without Headless " + String, true);
				driverManager.set(new Without_Headless_Ipad_Chrome_Driver_Manager());
			}else {
				Log.message("browser not found", true);
				return null;
			}
			}
			
			

		
		return driverManager.get();
	}
}
