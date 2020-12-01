package automation.library.selenium.exec.driver.manager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This file create driver of Chrome (Sauce Labs)
 */

public class Sauce_Lab_IOS_Mobile_Driver_Manager {

	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
    static WebDriver driver;
	public static WebDriver createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps11 = DesiredCapabilities.chrome();
		caps11.setCapability("testobject_platform_name", "iOS");
		caps11.setCapability("browserName", "Safari");
		caps11.setCapability("platformName", "iOS");
		caps11.setCapability("version", "");
		caps11.setCapability("deviceName", "iPhone_X_Beta_IOS14_2_real_us");
		caps11.setCapability("platform", "platform");

		try {
			driver = new RemoteWebDriver(new URL(URL), caps11);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;

	}

}