package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Keyboard;
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
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name())), 3);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()), data);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_First_Name()), "a");
	}
	
	/** This function enter last name detail */
	public void enter_Last_Name(String data) throws Exception {
		$click($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name()));
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name()), data);
		$click($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name()));
		$enterData($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Last_Name()), "b");
	}
	
	/** This function enter address detail */
	public void enter_Address(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards())), 3);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Address_Rewards()), data);
	}
	
	/** This function enter city detail */
	public void enter_City(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_City_Rewards()), data);
	}
	
	/** This function enter province detail */
	public void enterDataProvince() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province()));
		$click($(Loc.ID, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Province_Value()));
	}
	
	/** This function enter postal code */
	public void enter_Postal_Code(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards()), data);
	}
	
	/** This function enter phone number */
	public void enter_Phone_Number(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Phone_Number()), data);
	}
	
	/** This function enter year of birth */
	public void enterYearOfBirth() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value()));
	}
	/** This function enter year of birth with age majority */
	public void enterYearOfBirth_ageMajority() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_Age_Majority()));
	}
	/** This function enter year of birth when not reached age majority */
	public void enterYearOfBirth_No_ageMajority() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_No_Age_Majority()));
	}
	/** This function enter month of birth  */
	public void enterMonthOfBirth() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_MonthOfBirth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_MonthOfBirth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_monthOfBirthValue()));
	}
	/** This function enter month of birth after current date  */
	public void enterMonthOfBirth_After_currentDate() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_MonthOfBirth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_MonthOfBirth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_monthOfBirth_afterCurrentdate()));
	}
	/** This function enter date of birth */
	public void enterDateOfBirth() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_dateOfBirth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_dateOfBirth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_dateOfBirthValue()));
	}
	/** This function display month of birth  */
	public void display_MonthOfBirth() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_MonthOfBirth())), 3);
		}
	/** This function display date of birth */
	public void display_DateOfBirth() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_dateOfBirth())), 3);
		}
	
	/** This function click on continue button */
	public void cickContinueButton() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button()));
	}
}
