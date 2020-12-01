package automation.library.selenium.exec.driver.manager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This file create driver of chrome (Headless - Wide Screen)
 */

public class Headless_Chrome_Wide_Screen_Driver_Manager {
    static WebDriver driver;
	public static WebDriver createDriver() {
		ChromeOptions options = new ChromeOptions();
		Log.message("Head less", true);
		WebDriverManager.chromedriver().setup();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
	}

}