package automation.library.selenium.exec.driver.manager;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.library.cucumber.Constant;
import automation.library.managers.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This file create driver of chrome (Headless)
 */

public class Local_Chrome_Driver_Manager {

	static String fileDownloadPath =  Constant.BASE_PATH;
	static WebDriver driver;
	
	public static WebDriver createDriver() {
		  Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		
		  ChromeOptions option = new ChromeOptions();
		  option.setExperimentalOption("prefs", prefsMap);
		  option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		  //option.addArguments("incognito");
		  WebDriverManager.chromedriver().version("87.0.4280.88").setup();
		  //WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		return driver;
	}

}