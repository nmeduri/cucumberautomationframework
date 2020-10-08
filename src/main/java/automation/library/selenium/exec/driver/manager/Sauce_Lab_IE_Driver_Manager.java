package automation.library.selenium.exec.driver.manager;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/**
 * This file create driver of chrome (Web - Sauce Labs)
 */

public class Sauce_Lab_IE_Driver_Manager  {
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
    static WebDriver driver;
	public static WebDriver createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		    caps.setCapability("platform", "Windows 10");
		    caps.setCapability("version", "latest");
		    try {
		    driver = new RemoteWebDriver(new URL(URL), caps);
		    }catch(Exception e) {
		    	
		    }
		    return driver;
		
	}


}