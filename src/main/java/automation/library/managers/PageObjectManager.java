package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.datatable.Data_Map;
import automation.library.locator.HomePageLocator;
import automation.library.locator.PDP_PageLocator;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.core.PageObject;

public class PageObjectManager {

	private HomePage homePage;
	private PDP_Page pdpPage;
	private Sign_Up_Page signUpPage;
	private Data_Map dataMap;
	private HomePageLocator homePageLocator;
	private PDP_PageLocator padpPageLocator;

	public PageObjectManager() {

		

	}

	public HomePage getHomePage(WebDriver driver) throws Exception {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	public PDP_Page getPDPPage(WebDriver driver) throws Exception {
		
		return (pdpPage == null) ? pdpPage = new PDP_Page(driver) : pdpPage;
		
	}

	public Data_Map getDataMapPage() {

		return (dataMap == null) ? dataMap = new Data_Map() : dataMap;

	}
	
	public HomePageLocator getHomePageLocator() {
		
		return (homePageLocator == null) ? homePageLocator = new HomePageLocator() : homePageLocator;
		
	}
	
	public PDP_PageLocator getPDPPageLocator() {
		
		return (padpPageLocator == null) ? padpPageLocator = new PDP_PageLocator() : padpPageLocator;
		
	}
	
	public Sign_Up_Page getSignUpPage(WebDriver driver) {
		
		return (signUpPage == null) ? signUpPage = new Sign_Up_Page(driver) : signUpPage;
		
	}

}