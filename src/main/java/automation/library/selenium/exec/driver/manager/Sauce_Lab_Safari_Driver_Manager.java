package automation.library.selenium.exec.driver.manager;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
/**
 * This file create driver of chrome (Web - Sauce Labs)
 */

public class Sauce_Lab_Safari_Driver_Manager {
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
    static WebDriver driver;
	public static WebDriver createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("screenResolution", "1024x768");

		SafariOptions browserOptions = new SafariOptions();
		browserOptions.setCapability("platformName", "macOS 10.15");
		browserOptions.setCapability("browserVersion", "13.1");
		browserOptions.setCapability("sauce:options", sauceOptions);
		try {
			driver = new RemoteWebDriver(new URL(URL), browserOptions);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
	}


}