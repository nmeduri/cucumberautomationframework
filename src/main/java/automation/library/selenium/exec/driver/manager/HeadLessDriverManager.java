package automation.library.selenium.exec.driver.manager;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import automation.library.managers.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		
		WebDriverManager.phantomjs().setup();
		driver = new PhantomJSDriver();
	}

	@Override
	public void updateResults(String result) {
		// TODO Auto-generated method stub

	}

}