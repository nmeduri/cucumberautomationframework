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

public class PLP_Page extends PageObject {

	TestContext testContext;

	public PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_PLP_Page() throws Exception {

		DriverFactory.getInstance().getDriver().navigate().to(FileReaderManager.getInstance().getConfigReader().getPLPUrl());

	}
	
	public void display_PLP_Page() throws Exception {

		Assert.assertEquals("Automation_PLP", testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle());

	}
	
	public void displayListView() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View())));
	}
	
	public void displayGridView() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View())));
	}
	
	public void displayProductCardImage() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Image())));
	}
	
	public void clickOnListViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
	}
	
	public void displayProductCardTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Title()));
	}

}
