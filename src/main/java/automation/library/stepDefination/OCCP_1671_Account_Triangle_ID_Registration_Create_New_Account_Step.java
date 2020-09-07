package automation.library.stepDefination;

import static org.testng.Assert.fail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import automation.library.api.cucumber.IRestResponse;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import test.assertion.AssertionTest;

public class OCCP_1671_Account_Triangle_ID_Registration_Create_New_Account_Step extends BaseClass {

	public OCCP_1671_Account_Triangle_ID_Registration_Create_New_Account_Step(TestContext context) throws Exception {
		testContext = context;
		
		configFileReader = new ConfigFileReader();
	}
	
	@And("user enter invalid email")
    public void user_enter_invalid_email() throws Exception {
   	    testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).enter_Email(FileReaderManager.getInstance().getDataReader().get_Invalid_Email());
    }
	
    @Then("get personalized offers page is displayed")
    public void get_Personalized_Offers_Page_Is_Displayed() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_Header_Get_Personalized_Offers();
    } 
    
    @Then("verfiy CASL appear dynamically on registration model")
    public void verify_CASL_Appear_Dynamically_On_Registration_Model() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_CASL_Checkbox();
    }
    
    @Then("verfiy opt-in appear dynamically on registration model")
    public void verify_opt_in_appear_dynamically_on_registration_model() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_Opt_In();
    }
    
    @Then("verify user sees the option to optn in optional marketing offers and sales flyer subscription")
    public void verify_user_sees_the_option_to_optn_in_optional_marketing_offers() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_Email_Me_About_Offers_And_Sales();
    }
    
    @Then("a message is displayed to the user informing the email address format is invalid")
    public void a_message_is_displayed_to_the_user_informing_the_email_address_format_is_invalid() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Error_Message_Invalid_Email();
    }
    
    @Then("an inline error should display")
    public void an_inline_error_should_display() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_This_Field_Is_Required();
    }
    
    @And("user select tool tip icon next to email me about offer and sales")
    public void user_select_tool_tip_icon_next_to_email_me_about_offer_and_sales() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).click_Tool_Tip_Email_Me_About_Offers_And_Sales();
    }
    
    @Then("verify tool tip message email me about offer and sales is displayed")
    public void verify_tool_tip_message_email_me_about_offer_and_sales_is_displayed() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).display_Message_Email_Me_About_Offers_And_Sales();
    }
    
    @And("close the tooltip")
    public void close_the_tooltip() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).click_Tool_Tip_Close_Button();
    }
    
    @Then("user is able to close the tooltip")
    public void user_is_able_to_the_close_the_tooltip() throws Exception {
    	testContext.getPageObjectManager().getPersonalizedOffersPage(PageObject.getDriver()).not_Display_Tool_Tip_Close_Button();
    }
    
    @Then("message password do not match is displayed")
    public void message_password_do_not_match_is_displayed() throws Exception {
    	testContext.getPageObjectManager().getCreateTirangleIDPage(PageObject.getDriver()).display_Password_Do_Not_Match();
    }
}
