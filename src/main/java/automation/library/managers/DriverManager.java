package automation.library.managers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import automation.library.selenium.exec.driver.manager.ChromeDriverManager;
import automation.library.selenium.exec.driver.manager.FirefoxDriverManager;
import automation.library.selenium.exec.driver.manager.HeadLessDriverManager;
import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Class to get the driver path , reate/quit manager and get the wat duration
 */
public abstract  class DriverManager {

	protected static WebDriver driver;
	protected WebDriverWait wait;
	private Property property = new Property();
	private ConfigFileReader configFileReader = new ConfigFileReader();

	public WebDriver returnDriver() {
		return driver;
	}
	
	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}
	
	protected abstract void createDriver();

	public WebDriverWait getWait() {
		if (wait == null) {
			wait = new WebDriverWait(driver, getWaitDuration());
		}
		return wait;
	}

	public String getDriverPath(String drivername) {
		String driver = drivername
				+ (System.getProperty("os.name").split(" ")[0].equalsIgnoreCase("Windows") ? ".exe" : "");
		String path = Property.getVariable("cukes.driverPath");
		return (path == null ? "lib/drivers/" : path) + System.getProperty("os.name").split(" ")[0].toLowerCase() + "/"
				+ driver;
	}

	/** Returns duration for specified waits */
	public int getWaitDuration() {

		final int defaultWait = 10;
		int duration;
		try {
			duration = property.getProperties(Constant.SELENIUM_CONFIGURATION).getInt("defaultWait");
		} catch (Exception e) {
			duration = defaultWait;
		}
		return duration;
	}

	public static void closeDriver(WebDriver driver) throws Exception {

		driver.close();
	}

}