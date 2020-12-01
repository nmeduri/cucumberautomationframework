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
		    
		    public void createDriver() {
		    	System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
				driver = new SafariDriver();
				driver.manage().window().maximize();
		    }
    
    
} 