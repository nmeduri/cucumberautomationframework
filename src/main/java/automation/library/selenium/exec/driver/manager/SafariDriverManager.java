package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * This file create driver for Firefox
 */

public class SafariDriverManager extends DriverManager {
     
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		    //@Override
		    public void createDriver() {
		    	System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
				driver = new SafariDriver();
				driver.manage().window().maximize();
		    }
	

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub
		
	}
    
    
} 