package automation.library.pageObjects;

import java.util.List;
import java.util.Set;

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

public class Get_Personalized_Offers_Page extends PageObject {

	
	TestContext testContext;

	public Get_Personalized_Offers_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	public void click_Next_Button() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Next_Button())), 60);
	}
	
	public void display_Header_Get_Personalized_Offers() throws Exception{
		$display(ExpectedConditions.presenceOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Header_Get_Personalized_Offers_Page())), 60);
	}
	
	public void display_CASL_Checkbox() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_CASL_Checkbox()));
	}
	
	public void display_Opt_In() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Opt_In()));
	}
	
	public void display_Email_Me_About_Offers_And_Sales() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Email_Me_About_Offers_And_Sales()));
	}
	
	public void click_Tool_Tip_Email_Me_About_Offers_And_Sales() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Opt_In()));
	}
	
	public void display_Message_Email_Me_About_Offers_And_Sales() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Message_Email_Me_About_Offers_And_Sales()));
	}
	
	public void click_Tool_Tip_Close_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Tool_Tip_Close_Button()));
	}
	
	public void not_Display_Tool_Tip_Close_Button() throws Exception {
		Assert.assertFalse($display($(Loc.XPATH, testContext.getPageObjectManager().getPersonalizedOffersLocator().get_Message_Email_Me_About_Offers_And_Sales())));
	}

}
