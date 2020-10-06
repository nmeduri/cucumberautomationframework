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

public class Sauce_Lab_Chrome_Mobile_Driver_Manager  extends DriverManager{
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
	//@Override
	public void createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps11 = DesiredCapabilities.chrome();
		caps11.setCapability("testobject_platform_name", "android");
		caps11.setCapability("browserName", "Chrome");
		caps11.setCapability("platformName", "android");
		caps11.setCapability("version", "");
		caps11.setCapability("deviceName", "Samsung_Galaxy_Note_10_plus_real_us");
		caps11.setCapability("platform", "platform");
	    
		try {
			driver = new RemoteWebDriver(new URL(URL), caps11);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}