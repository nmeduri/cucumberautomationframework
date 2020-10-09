package automation.library.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
/**
 * This file contains the functions of Gigya API Tool Page 
 * 
 */
public class Gigya_Api_Tool_Page extends PageObject{
	TestContext testContext;

	public Gigya_Api_Tool_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to Gigya Api tool page */
	public void navigateTo_Gigya_Api_Tool_Page() throws Exception {	
		DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getDataReader().get_Gigya_Api_Tool_Url());
	}
	
	/** This function enter API Key */
	public void enterData_Api_Key(String data) throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Api_Key())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Api_Key()), data);
	}
	/** This function enter User Key */
	public void enterData_User_Key(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_User_Key()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_User_Key()), data);
	}
	/** This function enter Secret Key */
	public void enterData_Secret_Key(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Secret_Key()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Secret_Key()), data);
	}
	/** This function enter Data Center End Point */
	public void enter_Data_Center_End_Point(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Data_Center_End_Point()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Data_Center_End_Point()), data);
	}
	/** This function enter Parameter Login Name */
	public void enterData_Parameter_Login_Name(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Login_Name()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Login_Name()), data);
	}
	/** This function enter Parameter Login Value */
	public void enterData_Parameter_Login_Value(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Login_Value()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Login_Value()), data);
	}
	/** This function enter Parameter Password Name */
	public void enterData_Parameter_Password(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Password()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Password()), data);
	}
	/** This function enter Parameter Password Value */
	public void enterData_Parameter_Password_Value(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Password_Value()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Parameter_Password_Value()), data);
	}
	/** This function enter Data Center Drop down */
	public void enter_Data_Center_Dropdown(String data) throws Exception {
		performDropDown($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Data_Center_Dropdown()), "selectByText", data);
		Thread.sleep(2000);
	}
	/** This function click on add new text input button */
	public void click_On_Add_New_Text_Input_Button() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Add_Text_Input_Button())),15);
	}
	/** This function click on Send Request button */
	public void click_On_Send_Request_Button() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_Send_Request_Button())),15);
	}
	/** This function enter Parameter Password Value */
	public void enter_response(String uid,String udisingnature,String signaturetimestamp) throws Exception {
		Thread.sleep(4000);
		Log.message("Response: "+$getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_response())),60), true);
		String response = $getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getGigyaApiToolPageLocator().get_response())),60);
		
		if(response.contains(uid)&&response.contains(udisingnature)&&response.contains(signaturetimestamp)) {
			PageObject.notNullAttributeInResponse(uid);
			PageObject.notNullAttributeInResponse(udisingnature);
			PageObject.notNullAttributeInResponse(signaturetimestamp);
		Log.message("UID,UIDSignature and signatureTimestamp are displayed in response", true);
		}
	}
}
