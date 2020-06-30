package automation.library.managers;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * Class to get the driver path , reate/quit manager and get the wat duration
 */
public abstract class DriverManager {

	protected WebDriver driver;
	protected WebDriverWait wait;
	private Property property = new Property();
	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	public WebDriver returnDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		if (wait == null) {
			wait = new WebDriverWait(driver, getWaitDuration());
		}
		return wait;
	}

	public String getDriverPath(String drivername) {
		String driver = drivername
				+ (System.getProperty("os.name").split(" ")[0].equalsIgnoreCase("Windows") ? ".exe" : "");
		String path = Property.getVariable("cukes.driverPath");
		return (path == null ? "lib/drivers/" : path) + System.getProperty("os.name").split(" ")[0].toLowerCase() + "/"
				+ driver;
	}

	/** Returns duration for specified waits */
	public int getWaitDuration() {
		
		final int defaultWait = 10;
		int duration;
		try {
			duration = property.getProperties(Constant.SELENIUM_CONFIGURATION).getInt("defaultWait");
		} catch (Exception e) {
			duration = defaultWait;
		}
		return duration;
	}

	protected abstract void createDriver();

	public abstract void updateResults(String result);

	public void closeDriver() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(Constant.BASE_PATH + "/screenshot/"+ System.currentTimeMillis() +".png"));
		driver.close();
	}

}