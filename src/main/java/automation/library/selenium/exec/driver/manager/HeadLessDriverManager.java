package automation.library.selenium.exec.driver.manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import automation.library.managers.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessDriverManager extends DriverManager {

	@Override
	public void createDriver() {

		// WebDriverManager.phantomjs().setup();
		// driver = new PhantomJSDriver();

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
	}

	@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}