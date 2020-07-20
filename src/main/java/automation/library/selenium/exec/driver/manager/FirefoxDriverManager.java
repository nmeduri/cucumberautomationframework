package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
     
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		    //@Override
		    public void createDriver() {
		    	WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get("http://www.google.com/");
		    }
	

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub
		
	}
    
    
} 