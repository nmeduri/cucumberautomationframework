package automation.library.stepDefination;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.managers.FileReaderManager;
import automation.library.pageObjects.Gigya_Api_Tool_Page;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
/**
 * This file contains the scenario of user stories OCCP-2735
 */
public class HYB_OCCP_2735_Gigya_Integration_with_Hybirs_Step extends BaseClass{
	Gigya_Api_Tool_Page gigyaApiToolPage;
	public HYB_OCCP_2735_Gigya_Integration_with_Hybirs_Step(TestContext context) throws Exception {
		testContext = context;
		//gigyaApiToolPage = testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver());
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@Given("gigya api tool url is available")
    public void login_url_is_available() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).navigateTo_Gigya_Api_Tool_Page();
		//gigyaApiToolPage.navigateTo_Gigya_Api_Tool_Page();
    }
	
	@When("enter API key")
	public void enter_Api_Key() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Api_Key(FileReaderManager.getInstance().getDataReader().get_Gigya_Api_Key());
	}
	@And("enter user key")
	public void enter_User_Key() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_User_Key(FileReaderManager.getInstance().getDataReader().get_Gigya_User_Key());
	}
	@And("enter secret key")
	public void enter_Secret_Key() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Secret_Key(FileReaderManager.getInstance().getDataReader().get_Gigya_Secret_Key());
	}
	@And("enter data center end point")
	public void enter_Data_Center_End_Point() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enter_Data_Center_End_Point(FileReaderManager.getInstance().getDataReader().get_Gigya_Data_Center_EndPoint());
	}
	@And("enter parameter login name")
	public void enter_Parameter_Login_Name() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Parameter_Login_Name(FileReaderManager.getInstance().getDataReader().get_Gigya_Parameter_Login_Name());
	}
	@And("enter parameter login value")
	public void enter_Parameter_Login_Value() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Parameter_Login_Value(FileReaderManager.getInstance().getDataReader().get_Gigya_Parameter_Login_Value());
	}
	@And("enter parameter password")
	public void enter_Parameter_Password() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Parameter_Password(FileReaderManager.getInstance().getDataReader().get_Gigya_Parameter_Password());
	}
	@And("enter value of parameter password")
	public void enter_Parameter_Password_Value() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enterData_Parameter_Password_Value(FileReaderManager.getInstance().getDataReader().get_Gigya_Parameter_Password_Value());
	}
	@And("enter data center drop down")
	public void enter_Data_Center_Dropdown() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enter_Data_Center_Dropdown(FileReaderManager.getInstance().getDataReader().get_Gigya_Data_Center_Dropdown());
	}
	@And("click on add new text input button")
	public void click_On_Add_New_Text_Input_Button() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).click_On_Add_New_Text_Input_Button();
	}
	@And("click on send request button")
	public void click_On_Send_Request_Button() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).click_On_Send_Request_Button();
	}	
	@And("gigya response")
	public void click_On_Send_Request_Buttons() throws Exception {
		testContext.getPageObjectManager().getGigyaApiToolPage(PageObject.getDriver()).enter_response(FileReaderManager.getInstance().getDataReader().get_UID(),FileReaderManager.getInstance().getDataReader().get_UIDSignature(),FileReaderManager.getInstance().getDataReader().get_Signature_Timestamp());
	}
}
