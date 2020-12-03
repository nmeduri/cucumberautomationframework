package automation.library.pageObjects;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;

public class AEM_Account_Rewards_Template_Page extends PageObject {
	TestContext testContext;

	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Account_Rewards_Template_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Accounts Rewards Page_AEM */   
	public void navigateTo_Account_Rewards_Template_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_account_rewards_URL());
	}

	/** This function navigate to Accounts Rewards Page_AEM */   
	public void navigateTo_Account_Addresses_Template_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_account_Addresses_URL());
	}
	
	/** This function navigate to Accounts OrderHistory Page_AEM */   
	public void navigateTo_Account_OrderHistory_Template_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_account_OrderHistory_URL());
	}
	/** This function click on drag component */
	public void clickonDragComponent() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAccountRewardsTemplatePageLocator().get_dragComponent())), 5);
	}

	/** This function click on order history component */
	public void clickonOrderHistory() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAccountRewardsTemplatePageLocator().get_orderHistoryComponent())), 5);
	}
	/** This function click on insert(+) component */
	public void clickonInsert() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH,
				testContext.getPageObjectManager().getAccountRewardsTemplatePageLocator().get_insertIcon())), 5);
	}

	/** This function select component */
	public void selectComponent() throws Exception {
		List<Element> list = $findElements(
				ExpectedConditions.visibilityOfAllElementsLocatedBy($By(Loc.XPATH,
						testContext.getPageObjectManager().getAccountRewardsTemplatePageLocator().get_ListElements())),
				10);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i) != null) {
				if (list.get(i).getText().equalsIgnoreCase("Transaction History"))
					;
				$click(list.get(i));
			}
		}
	}
	/** This verify components are related to banner and featured */
	public void verifyComponents() throws Exception {
		List<Element> list = $findElements(
				ExpectedConditions.visibilityOfAllElementsLocatedBy($By(Loc.XPATH,
						testContext.getPageObjectManager().getAccountRewardsTemplatePageLocator().get_ListElements())),
				10);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i) != null) {
				if (list.get(i).getText().equalsIgnoreCase("Featured Product List"))
					;
				$click(list.get(i));
			}
		}
	}
}
