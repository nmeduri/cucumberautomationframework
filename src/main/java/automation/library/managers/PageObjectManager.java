package automation.library.managers;

import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.datatable.Data_Map;
import automation.library.locator.Create_Your_Triangle_ID_Page_Locator;
import automation.library.locator.HomePageLocator;
import automation.library.locator.PDP_PageLocator;
import automation.library.locator.PLP_PageLocator;
import automation.library.pageObjects.Create_Your_Triangle_ID_Page;
import automation.library.pageObjects.HomePage;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.PLP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.core.PageObject;

public class PageObjectManager {

	private HomePage homePage;
	private PDP_Page pdpPage;
	private Sign_Up_Page signUpPage;
	private Data_Map dataMap;
	private HomePageLocator homePageLocator;
	private PDP_PageLocator pdpPageLocator;
	private PageObject pageObject;
	private PLP_Page plpPage;
	private PLP_PageLocator plpPageLocator;
	private Create_Your_Triangle_ID_Page_Locator createYourTriangleIDPageLocator;
	private Create_Your_Triangle_ID_Page createYourTrianglePage;

	public PageObjectManager() {

		

	}
	
	public PageObject getPageObject(WebDriver driver) throws Exception {

		return (pageObject == null) ? pageObject = new PageObject(driver) : pageObject;

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
		
		return (pdpPageLocator == null) ? pdpPageLocator = new PDP_PageLocator() : pdpPageLocator;
		
	}
	
	public Sign_Up_Page getSignUpPage(WebDriver driver) {
		
		return (signUpPage == null) ? signUpPage = new Sign_Up_Page(driver) : signUpPage;
		
	}
	
	public PLP_Page getPLPPage(WebDriver driver) throws Exception {
		
		return (plpPage == null) ? plpPage = new PLP_Page(driver) : plpPage;
		
	}
	
	public PLP_PageLocator getPLPLocatorPage() {
		
		return (plpPageLocator == null) ? plpPageLocator = new PLP_PageLocator() : plpPageLocator;
		
	}
	
	public Create_Your_Triangle_ID_Page_Locator getCreateTriangleIDPageLocatorPage() {
		
		return (createYourTriangleIDPageLocator == null) ? createYourTriangleIDPageLocator = new Create_Your_Triangle_ID_Page_Locator() : createYourTriangleIDPageLocator;
		
	}
	
	public Create_Your_Triangle_ID_Page getCreateTirangleIDPage(WebDriver driver) {
		
		return (createYourTrianglePage == null) ? createYourTrianglePage = new Create_Your_Triangle_ID_Page(driver) : createYourTrianglePage;
		
	}

}