package automation.library.selenium.exec.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This file create driver for Firefox
 */


public class Local_Firefox_Driver_Manager {
		    
           static WebDriver driver;
		    public static WebDriver createDriver() {
		    	WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				return driver;
		    }
    
    
} 