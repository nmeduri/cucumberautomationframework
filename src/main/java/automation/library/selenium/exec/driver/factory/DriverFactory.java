package automation.library.selenium.exec.driver.factory;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.DriverManager;
import automation.library.selenium.exec.driver.manager.ChromeDriverManager;
import automation.library.selenium.exec.driver.manager.FirefoxDriverManager;
import automation.library.selenium.exec.driver.manager.HeadLessDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	protected static WebDriver driver;
	Property prop;
	private static DriverFactory instance = new DriverFactory();
	ConfigFileReader configFileReader;
	public static String USERNAME = System.getenv("SAUCE_USERNAME");
	public static String API_KEY = System.getenv("SAUCE_ACCESS_KEY");

	public DriverFactory() {
		prop = new Property();
		configFileReader = new ConfigFileReader();
	}

	public static DriverFactory getInstance() {
		return instance;
	}

	ThreadLocal<DriverManager> driverManager = new ThreadLocal<DriverManager>();

	public DriverManager driverManager() {
		return driverManager.get();
	}

	public WebDriver returnDriver() {
		return driverManager.get().returnDriver();
	}

	public WebDriverWait getWait() {
		return driverManager.get().getWait();
	}

	public WebDriver getDriver(String String) throws Exception {
		ChromeOptions options = new ChromeOptions();

		String URL = "https://" + USERNAME + ":" + API_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

		switch (configFileReader.getServerType()) {
		case "saucelabs":
			switch (String) {
			case "chrome":
				Log.message("Sauce Lab Web" + String, true);
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "Windows 10");
				caps.setCapability("version", "latest");
				caps.setCapability("screenResolution", "800x600");
				driver = new RemoteWebDriver(new URL(URL), caps);
				break;
			
		case "android-emulator": 
			Log.message("Sauce Lab Web" + String, true);
			DesiredCapabilities caps1 = DesiredCapabilities.android();
			caps1.setCapability("appiumVersion", "1.9.1");
			caps1.setCapability("deviceName","Android Emulator");
			caps1.setCapability("deviceOrientation", "portrait");
			caps1.setCapability("browserName", "Chrome");
			caps1.setCapability("platformVersion", "8.0");
			caps1.setCapability("platformName","Android");
			driver = new RemoteWebDriver(new URL(URL), caps1);
			break;
			
		case "mobile-chrome": 
			Log.message("Sauce Lab Web" + String, true);
			DesiredCapabilities caps11 = DesiredCapabilities.chrome();
		    caps11.setCapability("testobject_platform_name", "android");
		    caps11.setCapability("browserName","Chrome");
		    caps11.setCapability("platformName", "android");
		    caps11.setCapability("version","");
		    caps11.setCapability("deviceName","Samsung_Galaxy_S5_real");
		    caps11.setCapability("platform","platform");
		    driver = new RemoteWebDriver(new URL(URL), caps11);
			break;	
		}
			break;
		case "headless":
			switch (String) {
			case "chrome":
				Log.message("Head less", true);
				WebDriverManager.chromedriver().setup();
				options.addArguments("headless");
				options.addArguments("window-size=1200x600");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				break;
			case "headless mobile":
				Log.message("Head less", true);
				WebDriverManager.phantomjs().setup();
				driver = new PhantomJSDriver();
				break;
			case "mobile-chrome":
				Log.message("Headless Mobile:- " + String, true);
				WebDriverManager.chromedriver().setup();
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("headless");
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				driver = new ChromeDriver(chromeOptions);
				break;
			case "chrome - widescreen":
				Log.message("Head less", true);
				WebDriverManager.chromedriver().setup();
				options.addArguments("headless");
				options.addArguments("window-size=1200x600");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				break;		
			}
			break;
		case "without headless":
			switch (String) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "safari":
				System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
				driver = new SafariDriver();
				driver.manage().window().maximize();
				break;
			case "mobile-chrome":
				Log.message("Mobile:- " + String, true);
				WebDriverManager.chromedriver().setup();
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				driver = new ChromeDriver(chromeOptions);
				break;
			case "chrome - widescreen":
				Log.message("chrome - Wide Screen", true);
				WebDriverManager.chromedriver().setup();
				options.addArguments("window-size=2560x3500");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				break;	
			}
			break;

		default:

		}
		return driver;

	}

}
