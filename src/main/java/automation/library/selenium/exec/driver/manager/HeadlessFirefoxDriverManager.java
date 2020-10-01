package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * This file create driver for Firefox
 */

public class HeadlessFirefoxDriverManager extends DriverManager {
     
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		    //@Override
		    public void createDriver() {
		    	FirefoxOptions options = new FirefoxOptions();
		        options.setHeadless(true);
		        
		        //pass the options parameter in the Firefox driver declaration
		        WebDriverManager.firefoxdriver().setup();
		         driver = new FirefoxDriver(options);
		    }
	

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub
		
	}
    
    
} 