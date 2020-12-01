package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * This file create driver for Firefox
 */

public class Local_Safari_Driver_Manager {
	        static WebDriver driver; 
		    public static WebDriver createDriver() {
		    	System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
				driver = new SafariDriver();
				driver.manage().window().maximize();
				return driver;
		    }
    
    
} 