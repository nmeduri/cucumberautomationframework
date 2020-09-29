package automation.library.selenium.exec.driver.manager;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This file create driver for chrome (Mobile)
 */

public class IPadHeadlessChromeDriverManager  extends DriverManager{

	//@Override
	public void createDriver() {
		
		WebDriverManager.chromedriver().setup();
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "iPad");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("headless");
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}