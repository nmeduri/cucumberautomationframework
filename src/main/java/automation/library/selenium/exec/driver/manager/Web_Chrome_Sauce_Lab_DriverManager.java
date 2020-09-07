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


public class Web_Chrome_Sauce_Lab_DriverManager  extends DriverManager{
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");
	//@Override
	public void createDriver() {
		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("screenResolution", "800x600");
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
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