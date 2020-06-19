package automation.library.selenium.exec.driver.manager;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
     
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		    @Override
		    public void createDriver() {
		    	System.setProperty(FIREFOX_DRIVER_PROPERTY,
						FileReaderManager.getInstance().getConfigReader().getGeckoDriverPath());
				driver = new FirefoxDriver();
				driver.get("http://www.google.com/");
		    }
	

	@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub
		
	}
    
    
} 