package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

public class PLP_Page extends PageObject {

	TestContext testContext;
	List<Float> productPrice = new ArrayList<Float>();
	List<Float> price = new ArrayList<Float>();

	public PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void navigateTo_PLP_Page() throws Exception {

		DriverFactory.getInstance().getDriver().navigate()
				.to(FileReaderManager.getInstance().getConfigReader().getPLPUrl());

	}

	public void display_PLP_Page() throws Exception {

		Assert.assertEquals("Automation_PLP",
				testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle());

	}

	public void displayListView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View())));
	}

	public void displayGridView() throws Exception {
		Assert.assertTrue(
				$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View())));
	}

	public void displayProductCardImage() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Image())));
	}

	public void clickOnListViewButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
	}

	public void displayProductCardTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Card_Title()));
	}
	
	public void displaySortByOption() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	public void clickSortByOption() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Sort_By_Option()));
	}

	public void selectPriceHighToLow() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Price_High_To_Low()));
	}

	public List<Float> productPrice() throws Exception {
		PageObject.getDriver().navigate().refresh();
		List<Element> price = $$(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Product_Price());
		for (int i = 0; i < price.size(); i++) {
			productPrice.add(Float.parseFloat(price.get(i).getText().replace("$", "").replace(",", "")));
		}
		return productPrice;
	}
	
	
	public void verifyPriceHighToLow() throws Exception {
		ArrayList<Float> priceFloat = new ArrayList<Float>();
		priceFloat.addAll(productPrice());
		Log.message("Size:- " + priceFloat, true);
		for (int i = 0; i < priceFloat.size() - 1; i++) {
			Log.message("Number:- " + priceFloat.get(i) + "--" + "--" + priceFloat.get(i + 1), true);
			Assert.assertTrue(priceFloat.get(i) >= priceFloat.get(i + 1));
		}

	}
	
	public void select_New_Arrivals() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_New_Arrivals()));
	}
	
	public void clickCloseButton() throws Exception {
		$click($(Loc.CLASSNAME, testContext.getPageObjectManager().getPLPLocatorPage().get_Close_Button()));
	}
	
	public void select_Customer_Rating_High_To_Low() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Customer_Rating_High_To_Low()));
	}

}
