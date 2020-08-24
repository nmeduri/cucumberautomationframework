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

public class PDP_Page extends PageObject {

	TestContext testContext;

	public PDP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	public void display_PDP_Page() throws Exception {

		Assert.assertEquals("PDP", testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle());

	}

	public void display_warranty_Under_Resource() throws Exception {

		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Under_Resource())));
	}

	public void display_return_Policty_Under_Resource() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policty_Under_Resource())));
	}

	public void navigateTo_PDP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getPDPUrl());

	}

	public void clickOnAddToCartButton() throws Exception {

		$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Add_To_Cart_Button()).click();

	}

	public void verifyWarrantyInformationNotNull() throws Exception {

		Assert.assertFalse(
				$getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Warranty_Value()))
						.isEmpty());

	}

	public void displaySpecificationsSection() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title()), 5);
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Section())));
	}

	public void displaySpecificationsTitle() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_Title())));
	}

	public void displaySpecificationsInTabularFormat() throws Exception {
		Assert.assertTrue($display($(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format())));
	}

	public void displaySpecificationsTitleAndValueForEachSpecification() throws Exception {

		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		for (int i = 0; i < specification.size(); i++) {
			Assert.assertFalse($getText(specification.get(i)).isEmpty());
		}

	}

	public void displaySpecificationsLessThan8OnTheDesktop() {
		List<Element> specification = $$(Loc.XPATH,
				testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertTrue(specification.size() < 8);

	}

	public void dispalyProductTitle() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Title())),
				5));
	}

	public void verifyReturnPolicyDescription() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description())));
		Assert.assertFalse($getText(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Description()))
						.isEmpty());
	}

	public void displayReturnPolicyLink() throws Exception {
		Assert.assertTrue($display(
				$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link())));
	}

	public void clickOnReturnPolicyLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Return_Policy_Link()));
	}

	public void verifyReturnPolicyInNewTab() throws Exception {
		
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		Log.message("Title:- " + testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(),
				true);

	}
	
	public void displayProductCode() throws Exception {
		Assert.assertTrue($display(
				ExpectedConditions.visibilityOfElementLocated(
						$By(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Product_Code())),
				5));
	}

}
