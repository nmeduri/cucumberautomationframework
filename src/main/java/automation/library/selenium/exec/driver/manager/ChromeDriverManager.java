package automation.library.selenium.exec.driver.manager;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.library.cucumber.Constant;
import automation.library.managers.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This file create driver of chrome (Headless)
 */

public class ChromeDriverManager  extends DriverManager{

	String fileDownloadPath =  Constant.BASE_PATH;
	//@Override
	public void createDriver() {
		  Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		
		  ChromeOptions option = new ChromeOptions();
		  option.setExperimentalOption("prefs", prefsMap);
		  option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
	}

	//@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}