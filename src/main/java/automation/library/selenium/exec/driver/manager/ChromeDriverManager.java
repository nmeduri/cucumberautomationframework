package automation.library.selenium.exec.driver.manager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ChromeDriverManager  extends DriverManager{

	//@Override
	public void createDriver() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}