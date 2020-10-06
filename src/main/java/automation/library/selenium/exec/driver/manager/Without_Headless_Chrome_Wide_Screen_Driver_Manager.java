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
 * This file create driver of chrome (Wide Screen)
 */

public class Without_Headless_Chrome_Wide_Screen_Driver_Manager  extends DriverManager{

	//@Override
	public void createDriver() {
		Map<String, Object> prefsMap = new HashMap<String, Object>();
		prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", System.getProperty("user.dir"));
		  
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefsMap);
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