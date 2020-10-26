package automation.library.pageObjects;
import static org.testng.Assert.fail;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Link Rewards Options Page
 * 
 */
public class Link_Rewards_Options_Page extends PageObject {
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Link_Rewards_Options_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function is verify the option of 'Triangle Rewards ™ Card' is displayed */
	public void displayGetTriangleRewardsCard() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Triangle_Rewards_Card_Option()));
	}

	/** This function is verify the option of 'Get a new Triangle Rewards™ Card' is displayed */
	public void displayGetANewTriangleRewardsCard() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_A_New_Triangle_Rewards_Card_Option()));
	}

	/** This function is verify the option of 'Triangle™ Mastercard®' is displayed */
	public void displayGetMasterTriangleRewardsCard() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Triangle_Master_Card_Option()));
	}
	/** This function is verify 'Do not show me this again' toggle is displayed */
	public void displayGetDoNotShowMeThisAgainToggle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Get_Do_Not_Show_Me_This_Again_Toggle())),40);
	}
	/** This function is verify click on the 'Do not show me this again' toggle from left to right */
	public void clickOnGetDoNotShowMeToggleFromLeftToRight() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Click_Do_Not_Show_Me_Toggle_Left_TO_Right())));
	}
	/** This function is verify click on the 'Skip' Link*/
	public void clickOnSkipLink() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Click_On_Skip_Link())),20);
	}

	/** This function is verify click on the 'Skip' Link Text*/
	public void skipLinkText() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_Click_On_Skip_Link())),20);
	}
	/** This function is verify click on the 'Tool tip' */
	public void clickOntoolTip() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_ToolTipICon()));
	}
	/** This function is verify the Tool tip message */
	public void verifyTooltipMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_ToolTipMessage()));

	}
	/** This function click any where on the link reward option page */
	public void ClickAnywhere() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_AccountPage()));
	}

	/** This function is verify the Tool tip message should not display */
	public void verifyTooltipMessageNotDisplay() throws Exception {
		try {
			$display($$$$(Loc.XPATH, testContext.getPageObjectManager().getLinkRewardsOptionsPageLocator().get_ToolTipMessage(), 1));
			fail();
		}catch(Exception e) {		
			Log.message("Element is Not displayed", true);
		}
	}

}