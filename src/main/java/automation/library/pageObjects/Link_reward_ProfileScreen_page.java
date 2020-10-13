package automation.library.pageObjects;
import static org.testng.Assert.fail;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
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

public class Link_reward_ProfileScreen_page extends PageObject {
	
	Login_Page login_page;
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Link_reward_ProfileScreen_page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}
	
	/** This function display GetTriangleReward option */
	
	public void display_GetTriangleReward_option() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().getTriangleReward()));
	}
	/** This function click GetTriangleReward option */
	public void click_GetTriangleReward_option() throws Exception {
				 
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().getTriangleReward()));
	}
	/** This function click GetTriangleReward option */
	public void click_ContinueBtn() throws Exception {
		
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_continuebtn()));

	}
	/** This function get last name */
	public void get_LastNameError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_LNError()));
	}
	
	/** This function is verify that error message is displayed for city */
	public void get_CityError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_cityError()));
	}
	
	/** This function is verify that error message is displayed for address */
	public void get_addressError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_addressError()));
	}
	
	/** This function is verify that error message is displayed for postal code */
	public void get_pinError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_PinError()));
	}
	
	/** This function is verify that error message is displayed for province */
	public void get_provinceErr() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_provinceErr()));
	}
	
	/** This function is verify that error message is displayed for phone number */
	public void get_phnError() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_phnError()));
	}

	/** This function is verify that error message is displayed for First Name Error */
	public void get_FNError()throws Exception { 
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_FNError()));
		
	}
	
	/** This function is verify that error message is displayed for YOB */
	public void get_YOBerror()throws Exception { 
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_YOBerror()));
		
	}
	
	/** enter First Name */
	public void enterData_FirstName_Profile_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_FirstName()), data );
	}
	
	/** enter Last Name */
	public void enterData_LastName_Profile_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_LastName()), data);
	}
	
	/** enter Address */
	public void enterData_Address_ProfilePage(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_address()), data);
	}
	
	/** enter city */
	public void enterData_City_ProfilePage(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_city()), data);
	}
	
	/** enter province */
	public void enterData_Province_Profile_Page(String data) throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_province()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().set_Province()));
		
	}
	
	/** enter postal code */
	public void enterData_PostalCode_Profile_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_PostalCode()), data);
	}
	
	/** enter phone number */
	public void enterData_PhnNo_Profile_Page(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_phnNumber()), data);
	}
	
	/** enter yob */
	public void enterData_YOB_Profile_Page(String data) throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_YOBerror()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().set_Year()));

			}
	
	/** enter MOB */
	public void enterData_MOB_Profile_Page() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_MonthOfBirth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_MOBValue()));

			}
	
	/** enter DOB */
	public void enterData_DOB_Profile_Page() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_DateOfBirth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLink_reward_ProfileScreen_page_Locator().get_DOBValue()));

			}
	

}
	


