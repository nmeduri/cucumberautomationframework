package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.cucumber.TestContext;
import automation.library.datatable.Data_Map;
import automation.library.locator.HomePageLocator;
import automation.library.pageObjects.HomePage;
import automation.library.selenium.core.PageObject;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private Data_Map dataMap;
	private HomePageLocator homePageLocator;
	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public Data_Map getDataMapPage() {

		return (dataMap == null) ? dataMap = new Data_Map() : dataMap;

	}
	
	public HomePageLocator getHomePageLocator() {
		
		return (homePageLocator == null) ? homePageLocator = new HomePageLocator() : homePageLocator;
		
	}

}