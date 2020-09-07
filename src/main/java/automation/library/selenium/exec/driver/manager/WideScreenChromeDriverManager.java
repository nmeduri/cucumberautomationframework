package automation.library.selenium.exec.driver.manager;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WideScreenChromeDriverManager  extends DriverManager{

	//@Override
	public void createDriver() {
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("window-size=2560x3500");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}