package automation.library.selenium.exec.driver.manager;


import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	@Override
	public void createDriver() {
//		System.setProperty(CHROME_DRIVER_PROPERTY,
//				FileReaderManager.getInstance().getConfigReader().getChromeDriverPath());
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup(); driver =
				  new ChromeDriver();

	}

	@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}