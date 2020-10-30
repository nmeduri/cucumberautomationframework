package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;

import automation.library.cucumber.TestContext;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of AEM Registration Page
 * 
 */
public class AEM_Registration_Page extends PageObject {
TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Registration_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
}
