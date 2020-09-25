package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
/**
 * This file contains the functions of Get A New Triangle Rewards Card Page
 * 
 */
public class Get_A_New_Triangle_Rewards_Card_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Get_A_New_Triangle_Rewards_Card_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that Title 'Get New Reward Card' is displayed */
	public void displayGetNewRewardsCardTitle() throws Exception {
		$display($(Loc.CLASSNAME, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_A_New_Triangle_Rewards_Card_Title()));
	}
	
	/** This function enter first name detail */
	public void enter_First_Name(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()), data);
	}
	
	/** This function enter last name detail */
	public void enter_Last_Name(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name()), data);
	}
	
	/** This function enter address detail */
	public void enter_Address(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards()), data);
	}
	
	/** This function enter city detail */
	public void enter_City(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards()), data);
	}
	
	/** This function enter province detail */
	public void enterDataProvince() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province()));
		$click($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province_Value()));
	}
	
	/** This function enter postal code */
	public void enter_Postal_Code(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()), data);
	}
	
	/** This function enter phone number */
	public void enter_Phone_Number(String data) throws Exception {
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number()), data);
	}
	
	/** This function enter year of birth */
	public void enterYearOfBirth() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth()));
		$click($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value()));
	}
	
	/** This function click on continue button */
	public void cickContinueButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button()));
	}
}
