package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This file create driver for Firefox
 */

public class Without_Headless_Firefox_Driver_Manager extends DriverManager {
     
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		    //@Override
		    public void createDriver() {
		    	WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
		    }
	

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub
		
	}
    
    
} 