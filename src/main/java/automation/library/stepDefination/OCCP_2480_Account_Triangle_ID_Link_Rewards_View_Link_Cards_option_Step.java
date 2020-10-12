package automation.library.stepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.selenium.base.BaseClass;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This file contains the scenario of user stories OCCP-2480
 */
public class OCCP_2480_Account_Triangle_ID_Link_Rewards_View_Link_Cards_option_Step extends BaseClass{

	public OCCP_2480_Account_Triangle_ID_Link_Rewards_View_Link_Cards_option_Step(TestContext context) throws Exception {
		testContext = context;
		driverFactory = new DriverFactory();
		configFileReader = new ConfigFileReader();
	}
	
	@And("user clicks on continue button")
    public void user_Clicks_On_Continue_Button() throws Exception {
    	testContext.getPageObjectManager().getYourEmailHasBeenVerifiedPage(PageObject.getDriver()).Click_Continue_Button_Email_Verification_Page();
    }
	
	@And("get traiangle rewards card option should be displayed")
	public void Get_Traiangle_Rewards_Card_Option_Should_Be_Displayed() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).displayGetTriangleRewardsCard();
	}
	
	@And("get a new traiangle rewards card option should be displayed")
	public void get_A_New_Traiangle_Rewards_Card_Option_Should_Be_Displayed() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).displayGetANewTriangleRewardsCard();
	}
	
	@And("get Master traiangle rewards card option should be displayed")
	public void get_Traiangle_Rewards_Option_Should_Be_Displayed() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).displayGetMasterTriangleRewardsCard();
	}
	
	@And("Do not show me this again toggle button is available on the link card screen")
	public void get_Do_Not_Show_Me_This_Again_Toggle_Button_Is_Available_On_The_Link_Card_Screen() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) PageObject.getDriver();
		js.executeScript("window.scrollBy(0,300)", "");
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).displayGetDoNotShowMeThisAgainToggle();
	}
	@When("click on the toggle from left to right")
	public void get_Click_On_The_Toggle_From_Left_To_Right() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).clickOnGetDoNotShowMeToggleFromLeftToRight();
		
	}
	@And("click on skip link")
	public void get_Click_On_Skip_Link() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).clickOnSkipLink();		
	}
	@And("skip link text should be displayed")
	public void get_Skip_Link_Text() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) PageObject.getDriver();
		js.executeScript("window.scrollBy(0,300)", "");
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).skipLinkText();
	}

	@Then ("hover on the tool tip and verify the message")
	public void hover_on_the_tooltip_and_verify_the_message() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).clickOntoolTip();
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).verifyTooltipMessage();	
	}
	
	@Then ("click outside the tool tip")
	public void click_outside_the_tooltip() throws Exception {

		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).ClickAnywhere();
	}
	@And ("user should not see the tool tip message")
	public void tooltip_Message_Not_Displayed() throws Exception {
		testContext.getPageObjectManager().getLinkRewardsOptionsPage(PageObject.getDriver()).verifyTooltipMessageNotDisplay();
	}
	@And ("open new window")
	public void open_new_window() throws Exception {	
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
    	testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
	}
	
}
