package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This file create driver for Firefox
 */


public class Local_Firefox_Driver_Manager extends DriverManager {
		    

		    public void createDriver() {
		    	WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
		    }
    
    
} 