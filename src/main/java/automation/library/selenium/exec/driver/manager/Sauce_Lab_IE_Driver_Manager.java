package automation.library.selenium.exec.driver.manager;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.library.managers.DriverManager;
/**
 * This file create driver of chrome (Web - Sauce Labs)
 */

public class Sauce_Lab_IE_Driver_Manager  extends DriverManager{
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
	//@Override
	public void createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		    caps.setCapability("platform", "Windows 10");
		    caps.setCapability("version", "latest");
		    try {
		    driver = new RemoteWebDriver(new URL(URL), caps);
		    }catch(Exception e) {
		    	
		    }
		
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}