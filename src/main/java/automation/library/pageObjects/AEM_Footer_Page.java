package automation.library.pageObjects;

import static org.testng.Assert.fail;
import java.util.List;
import java.util.Set;
import org.apache.commons.configuration.PropertiesConfiguration;
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
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
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
/**
 * This file contains the functions of AEM footer
 * 
 */

public class AEM_Footer_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Footer_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	/** This function navigate to footer Component Page */
	public void navigateTo_FooterComponent_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Footer_Component_Url());

	}
	
	/** This function click footer component */
	public void clickFooterComponent() throws Exception {

		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooterComponent())), 3);

	}
	/** This function will scroll down to AEM Footer */
	public void scrollDownToAEMFooter() throws Exception {
		By goToAEMFooter = $By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooterComponent());
		testContext.getPageObjectManager().getPageObject(driver).scrollDown(goToAEMFooter, 10);
	}
	/** This function will scroll down to Copy right label in footer */
	public void scrollDownToCopyRight() throws Exception {
		By goToCopyRight= $By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Copy_Right_Text());
		testContext.getPageObjectManager().getPageObject(driver).scrollDown(goToCopyRight, 10);
	}
	/** Update Legal text label */
	public void updateLegalTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalText());
	}
	/** display Legal text field */
	public void verifyLegalTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalText()));
	}
	
	/** revert legal text label changes */
	public void revertPlaceHolderLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalText());
	} 
	
	/** This functions verify legal text label is successfully updated on site */
	public void displayUpdatedLegalTextOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalText() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Legal text URL */
	public void updateLegalTextURLOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalURL());
	}
	/** display Legal text URL */
	public void verifyLegalTextURLisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalURL()));
	}
	
	/** revert legal text URL label changes */
	public void revertLegalTexturlLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_LegalURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalURL());
	} 
	
	/** This functions verify legal url label is successfully updated on site */
	public void displayUpdatedLegalTextURLOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Legal()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalText() + "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Terms and condition text*/
	public void updateTermsnConditionTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnCondition());
	}
	/** display Terms and condition text */
	public void verifyTermsNConditionTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionText()));
	}
	
	/** revert Terms and condition text */
	public void revertTermsNConditionTextLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnCondition());
	} 
	
	/** This functions verify Terms and condition Text is successfully updated on site */
	public void displayUpdatedtncTextOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnCondition() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Terms and condition URL*/
	public void updateTermsnConditionURLofFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnConditionURL());
	}
	/** display Terms and condition tURL */
	public void verifyTermsNConditionURLisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionURL()));
	}
	
	/** revert Terms and condition URL */
	public void revertTermsNConditionURLLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_TermsnConditionURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnConditionURL());
	} 
	
	/** This functions verify Terms and condition URL is successfully updated on site */
	public void displayUpdatedtncURLOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Terms_And_Conditions()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_termsnCondition() + "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Privacy policy text*/
	public void updatePrivacypolicyTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_privacyPolicyText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_privacyPolicyText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyLabel());
	}
	/** display Privacy policy text */
	public void verifyPrivacyPolicyTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_privacyPolicyText()));
	}
	
	/** revert Privacy policy text */
	public void revertPrivacyPolicyTextLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_privacyPolicyText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_privacyPolicyText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyLabel());
	} 
	
	/** This functions verify Privacy policy Text is successfully updated on site */
	public void displayUpdatedPrivacyPolicyTextOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyLabel() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Privacy Policy URL*/
	public void updatePrivacyPolicyURLofFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_PrivacyPolicyURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_PrivacyPolicyURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyURL());
	}
	/** display PrivacyPolicy tURL */
	public void verifyPrivacyPolicyURLisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_PrivacyPolicyURL()));
	}
	
	/** revert PrivacyPolicy URL */
	public void revertPrivacyPolicyURLLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_PrivacyPolicyURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_PrivacyPolicyURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyURL());
	} 
	
	/** This functions verify PrivacyPolicy URL is successfully updated on site */
	public void displayUpdatedPrivacyPolicyURLOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Privacy_Policy()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" + driver.getTitle() + "']"));
		
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update site map text*/
	public void updateSitemapTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_SiteMap()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_SiteMap())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapText());
	}
	/** display site map text */
	public void verifysitemapTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_SiteMap()));
	}
	
	/** revert site map text */
	public void revertSiteMapTextLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_SiteMap()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_SiteMap())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapText());
	} 
	
	/** This functions verify site map Text is successfully updated on site */
	public void displayUpdatedsitemapOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapText() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	
}
	/** Update Site Map URL*/
	public void updateSiteMapURLofFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_siteMapURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_siteMapURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapURL());
	}
	/** display Site Map URL */
	public void verifySiteMapURLisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_siteMapURL()));
	}
	
	/** revert Site Map URL */
	public void revertSiteMapURLLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_siteMapURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_siteMapURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapURL());
	} 
	
	/** This functions verify Site Map URL is successfully updated on site */
	public void displayUpdatedSiteMapURLOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Site_Map()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +   driver.getTitle()+ "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** Update Accessibility text*/
	public void updateAccessibilityTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityText());
	}
	/** display Accessibility text */
	public void verifyAccessibilityTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityText()));
	}
	
	/** revert Accessibility text */
	public void revertAccessibilityTextLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityText()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityText())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityText());
	} 
	
	/** This functions verify Accessibility Text is successfully updated on site */
	public void displayUpdatedAccessibilityOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityText() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	
}
	/** Update Accessibility URL*/
	public void updateAccessibilityURLOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityURL());
	}
	/** display Accessibility URL */
	public void verifyAccessibilityURLisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityURL()));
	}
	
	/** revert Accessibility URL */
	public void revertAccessibilityURLLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityURL()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_AccessibilityURL())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityURL());
	} 
	
	/** This functions verify Accessibility URL is successfully updated on site */
	public void displayUpdatedAccessibilityURLOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$displayFindElement(By.xpath("//*[text()='" +   driver.getTitle() + "']"));
	}		
	/** Update CopyRight text*/
	public void updateCopyRightTextOfFooterComponent() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_CopyrightLabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_CopyrightLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_CopyrightLabel());
	}
	/** display CopyRight text */
	public void verifyCopyRightTextisAuthorable() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_CopyrightLabel()));
	}
	
	/** revert CopyRight text */
	public void revertCopyRightTextLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_CopyrightLabel()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_CopyrightLabel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_CopyrightLabel());
	} 
	
	/** This functions verify CopyRight Text is successfully updated on site */
	public void displayUpdatedCopyRightOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_CopyrightLabel() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	
}
	/** Update Legal Disclaimer text*/
	public void updateLegalDisclaimerOfFooterComponent() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalDisclaimer());
	}
	/** display Legal Disclaimer text */
	public void verifyLegalDisclaimerTextisAuthorable() throws Exception {
		
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer()));
	}
	
	/** revert Legal Disclaimer text */
	public void revertLegalDisclaimerTextLabelChanges() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_legalDisclaimer())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalDisclaimer());
		} 
	
	/** This functions verify Legal Disclaimer Text is successfully updated on site */
	public void displayUpdatedLegalDisclaimerOnSite() throws Exception {
	    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_LegalDisclaimer() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	}
		/** Update View More text*/
		public void updateviewMoreinFooterComponent() throws Exception {
			$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewMore()));
			$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewMore())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_ViewMore());
		}
		/** display View More text */
		public void verifyViewMoreTextisAuthorable() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewMore()));
		}
		
		/** revert View More text */
		public void revertViewMoreTextLabelChanges() throws Exception {
			$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewMore()));
			$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewMore())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_ViewMore());
			} 
		
		/** This functions verify View More Text is successfully updated on site */
		public void displayUpdatedViewMoreOnSite() throws Exception {
		    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
			$displayFindElement(By.xpath("//*[@class='js-copyright-footer__view-more']"));
			PageObject.getDriver().switchTo().parentFrame();
	
}
		/** Update View less text*/
		public void updateviewlessinFooterComponent() throws Exception {
			$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewLess()));
			$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewLess())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_ViewLess());
		}
		/** display View less text */
		public void verifyViewLessTextisAuthorable() throws Exception {
			$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewLess()));
		}
		
		/** revert View less text */
		public void revertViewLessTextLabelChanges() throws Exception {
			$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewLess()));
			$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().getFooter_viewLess())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_ViewLess());
			} 
		
		/** This functions verify View less Text is successfully updated on site */
		public void displayUpdatedViewlessOnSite() throws Exception {
		    testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
			$click($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_View_More()));
			$displayFindElement(By.xpath("//*[@class='js-copyright-footer__view-less']"));
			PageObject.getDriver().switchTo().parentFrame();
	
}

	/** This function navigate to Footer Author Page */
	public void navigateTo_Footer_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Footer_Author_Url());

	}
	
	/** Clicks on Footer Pannel */
	public void clickFooterPannel() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFooterPannel())), 5);
	}
	
	/** enter customer service sub section details */
	public void enterCustomerServerSubSectionTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet());
		
	}
	
	/** verify customer service sub section changes are reflect on site */
	public void verifyCustomerServiceSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Order_Status());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Product_Result());
		Assert.assertEquals($getText(li.get(7)), FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter customer service sub section details */
	public void reverseChangesCustomerServerSubSectionTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getOrderStatus())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getPickUpDelivery())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_LocatorChanges());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet_Changes());
		
	}
	
	/** enter service and solutions sub section details */
	public void enterServiceAndSolutionsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry());
		
	}
	
	/** verify service and solution sub section changes are reflect on site */
	public void verifyServiceAndSolutionSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life());
		Assert.assertEquals($getText(li.get(7)), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter service and solutions sub section details */
	public void reverseChangesServiceAndSolutionsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getFinancialServices())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getInstallationAssembling())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getAutoServiceCenter())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getLoanTool())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getRoadSideAssistance())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftCards())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getTestForLife())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getGiftRegistry())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry_Changes());
		
	}
	
	/** enter About Us sub section details */
	public void enterAboutUsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity());
		
		
	}
	
	/** verify about us sub section changes are reflect on site */
	public void verifyAbutUsSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Careers());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands());
		Assert.assertEquals($getText(li.get(5)), FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up());
		Assert.assertEquals($getText(li.get(6)), FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter about us sub section details */
	public void reverseChangesAboutUsSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Triangle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity_Changes());
		
	}
	
	/** enter Legal sub section details */
	public void enterLegalSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Accessibility());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy());
	}
	
	/** verify legal sub section changes are reflect on site */
	public void verifyLegalSectionChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update());
		Assert.assertEquals($getText(li.get(0)), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy());
		Assert.assertEquals($getText(li.get(1)), FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions());
		Assert.assertEquals($getText(li.get(2)), FileReaderManager.getInstance().getAEMDataReader().get_Site_Map());
		Assert.assertEquals($getText(li.get(3)), FileReaderManager.getInstance().getAEMDataReader().get_Accessibility());
		Assert.assertEquals($getText(li.get(4)), FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter legal sub section details */
	public void reverseChangesLegalSubSectionTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Term_And_Condition())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility())), 5, FileReaderManager.getInstance().getAEMDataReader().get_AccessibilityChanges());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy_Changes());
		
	}

	
	/** enter customer service sub section details */
	public void enterCustomerServerDestinationUrlDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Order_Status_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Order_Status_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Up_Delivery_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Up_Delivery_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Return_And_Exchagne_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Help_And_FAQ_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Contact_Us_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Store_Locator_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Product_Recall_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Safety_Data_Sheet_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet_Url());
		
	}
	
	/** verify customer service sub url changes are reflect on site */
	public void verifyCustomerServiceUrlChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getCustomerServiceSection());
		Assert.assertEquals($getAttributeValue(li.get(0), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Order_Status_Url());
		Assert.assertEquals($getAttributeValue(li.get(1), "href"), FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery_Url());
		Assert.assertEquals($getAttributeValue(li.get(2), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange_Url());
		Assert.assertEquals($getAttributeValue(li.get(3), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section_Url());
		Assert.assertEquals($getAttributeValue(li.get(4), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Url());
		Assert.assertEquals($getAttributeValue(li.get(5), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator_Url());
		Assert.assertEquals($getAttributeValue(li.get(6), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Product_Result_Url());
		Assert.assertEquals($getAttributeValue(li.get(7), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet_Url());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter customer service sub section details */
	public void reverseChangesCustomerServerSubSectionUrlDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Order_Status_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Order_Status_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Order_Status_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Up_Delivery_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Up_Delivery_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PickUp_Delivery_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getReturnExchange()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Return_And_Exchagne_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Return_End_Exchange_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getHelpFQA()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Help_And_FAQ_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Help_FAQ_Section_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getContactUs()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Contact_Us_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Contact_Us_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getStoreLocator()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Store_Locator_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Store_Locator_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getProductRecall()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Product_Recall_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Product_Result_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().getSafetyDataSheet()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Safety_Data_Sheet_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Safty_Data_Sheet_Url_Changes());
		
	}
	
	/** enter service and solutions sub url details */
	public void enterServiceAndSolutionsSubUrlTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Canadian_Tire_Financial_Services_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Canadian_Tire_Financial_Services_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Installation_Assembling_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Installation_Assembling_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Auto_Services_Center_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Auto_Services_Center_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Loan_Tool_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Loan_Tool_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Road_Assistance_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Road_Assistance_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Tested_For_Life_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Tested_For_Life_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Registry_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry_Url());
		
	}
	
	/** verify service and solution sub url changes are reflect on site */
	public void verifyServiceAndSolutionURlChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_And_Installation_Updated());
		Assert.assertEquals($getAttributeValue(li.get(0), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services_Url());
		Assert.assertEquals($getAttributeValue(li.get(1), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling_Url());
		Assert.assertEquals($getAttributeValue(li.get(2), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center_Url());
		Assert.assertEquals($getAttributeValue(li.get(3), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool_Url());
		Assert.assertEquals($getAttributeValue(li.get(4), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance_Url());
		Assert.assertEquals($getAttributeValue(li.get(5), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards_Url());
		Assert.assertEquals($getAttributeValue(li.get(6), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life_Url());
		Assert.assertEquals($getAttributeValue(li.get(7), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards_Url());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter service and solutions sub url details */
	public void reverseChangesServiceAndSolutionsSubUrlTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Canadian_Tire_Financial_Services_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Canadian_Tire_Financial_Services_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Canadian_Tire_Financial_Services_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Installation_Assembling_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Installation_Assembling_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Installation_Assembling_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Auto_Services_Center_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Auto_Services_Center_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Auto_Service_Center_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Loan_Tool_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Loan_Tool_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Load_Tool__Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Road_Assistance_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Road_Assistance_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Road_Side_Assistance_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Cards__Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Tested_For_Life_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Tested_For_Life_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tested_For_Life_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Cards_Sub_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Gift_Registry_Sub_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Gift_Registry_Url_Changes());
		
	}
	
	/** enter About Us sub section url */
	public void enterAboutUsSubUrlDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Training_ID_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity_Url());
		
		
	}
	
	/** verify about us sub url changes are reflect on site */
	public void verifyAbutUsUrlChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Section());
		Assert.assertEquals($getAttributeValue(li.get(0), "href"), FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire_Url());
		Assert.assertEquals($getAttributeValue(li.get(1), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Careers_Url());
		Assert.assertEquals($getAttributeValue(li.get(2), "href"), FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID_Url());
		Assert.assertEquals($getAttributeValue(li.get(3), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information_Url());
		Assert.assertEquals($getAttributeValue(li.get(4), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands_Url());
		Assert.assertEquals($getAttributeValue(li.get(5), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up_Url());
		Assert.assertEquals($getAttributeValue(li.get(6), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity_Url());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter about us sub url details */
	public void reverseChangesAboutUsSubUrlTitleDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Canadian_Tire_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Careers_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Careers_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Canadian_Tire_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Training_ID_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Triangle_ID_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Recyling_Information_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Recyling_Information_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Our_Brands_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Our_Brands_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Flyer_Sign_Up_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Flyer_Sign_Up_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Sustainability_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Sustainablity_Changes_Url());
		
	}
	
	/** enter Legal sub section url */
	public void enterLegalSubSectionUrlDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Terms_And_Condtions_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Terms_And_Condtions_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_Url());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy_Url());
	}
	
	/** verify legal sub url changes are reflect on site */
	public void verifyLegalUrlChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update())), 5);
		List<Element> li = $$(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Section_Update());
		Assert.assertEquals($getAttributeValue(li.get(0), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy_Url());
		Assert.assertEquals($getAttributeValue(li.get(1), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions_Url());
		Assert.assertEquals($getAttributeValue(li.get(2), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Site_Map_Url());
		Assert.assertEquals($getAttributeValue(li.get(3), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_Url());
		Assert.assertEquals($getAttributeValue(li.get(4), "href"), FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy_Url());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** enter legal sub section details */
	public void reverseChangesLegalSubUrlDetails() throws Exception{
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Privacy_Policy_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Policy_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Terms_And_Condtions_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Terms_And_Condtions_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Terms_And_Conditions_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Site_Map_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Site_Map_Url_Changes());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_AccessibilityChanges());
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy_Url()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pricing_Policy_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Pricing_Policy_Url_Changes());
		
	}
	
	/** update footer option title */
	public void updateFooterOptionTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Customer_Support_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Customer_Support_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Support_Title());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_Installation_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_Installation_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Service_Installation_Title());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Us_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Us_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Us_Title());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Legal_Title());
	}
	
	/** footer option changes are reflect on site */
	public void footer_option_changes_are_reflect_on_site() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Customer_Support_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_Customer_Support_Title());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_Installation_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_Service_Installation_Title());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Us_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_About_Us_Title());
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Preview())), FileReaderManager.getInstance().getAEMDataReader().get_Legal_Title());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** enter footer option details */
	public void reverseFooterOptionDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Customer_Support_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Customer_Support_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Customer_Support_Title_Change());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Two())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_Installation_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Service_Installation_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Service_Installation_Change());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Three())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Us_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_About_Us_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_About_Us_Title_Change());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Column_Four())), 5);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Legal_Title_Change());
		
	}

	
	
	/** This function navigate to AEM New Rewards Card Page */
	public void navigateToFooterPage() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Footer_Url());

	}
	
	/** This function clicks on AEM Footer Title */
	public void clickOnFooterTitle() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Footer_Copyright_Title())));
		//$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Footer_Copyright_Title())), 10);
	}
	
	/** This function verify image text is authorable */
	public void displayLogoAltText() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo_Alt_Text()));
	}
	
	/** This function updates image alt text */
	public void enterDataLogoAltText() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo_Alt_Text())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo_Alt_Text())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Footer_Logo_Alt_Text()); 

	}
	
	/** This function verify copyright label is authorable */
	public void displayCopyrightLabel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Copyright_Label_Aem()));
	}
	
	/** This function updates copyright label text */
	public void enterDataCopyrightLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Copyright_Label_Aem())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Copyright_Label_Aem())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Copyright_Label_Text()); 

	}
	
	/** This function verify Legal Disclaimer label is authorable */
	public void displayLegalDisclaimerAem() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_disclaimer_Aem()));
	}
	
	/** This function updates Legal Disclaimer label text */
	public void enterDataLegalDisclaimerAem() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_disclaimer_Aem())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_disclaimer_Aem())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Legal_Disclaimer_Text()); 

	}
	
	/** This function verify View More label is authorable */
	public void displayViewMoreAem() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Aem()));
	}
	
	/** This function updates View More label text */
	public void enterDataViewMoreAem() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Aem())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Aem())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_More_Text()); 
	}
	
	/** This function verify View Less label is authorable */
	public void displayViewLessAem() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Aem()));
	}
	
	/** This function updates View Less label text */
	public void enterDataViewLessAem() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_Less_Aem())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_Less_Aem())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Text()); 
	}
	
	/** This function scrolls down to copyright footer */
	public void scrollDownToCopyrightFooter() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Footer_Copyright_Title()), 20);	
	}
	
	/** This function verifys copyright label changes reflected */
	public void verifyCopyrightLabelChangesReflected() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Copyright_Label_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Copyright_Preview())));
	}
	
	/** This function verifys legal disclaimer changes reflected */
	public void verifyLegalDisclaimerChangesReflected() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Legal_Disclaimer_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Disclaimer_Preview())));
	}
	
	/** This function verifys alternative text changes reflected */
	public void verifyAltTextChangesReflected() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Footer_Logo_Alt_Text(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Alt_Text_Preview()), "alt"));
	}
	
	/** This function verifys alternative text changes reflected */
	public void verifyViewMoreViewLessChangesReflected() throws Exception {
		driver.navigate().refresh();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_More_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Preview())));
		((JavascriptExecutor)PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_More_Preview())));
		//$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Chevron_Down())), 10);
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_View_Less_Preview())));
	}
	
	/** This function clicks on AEM Simple Footer Title */
	public void clickOnSimpleFooterTitle() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Simple_Footer_AEM_Title())), 10);
	}

	/** This function selects same tab from dropdown */
	public void selectTabFromDropDown() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Open_Url())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_New_Tab())), 10);
		
		//performDropDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Open_Url()), "selectByValue" , "_self");
	}
	
	/** This function scrolls down to copyright footer */
	public void scrollDownToSimpleFooter() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Simple_Footer_AEM_Title()), 2);	
	}
	
	/** This function verifys redirecting to authored tab option */
	public void verifyOpensInAuthoredTab() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Link_Preview())), 40);
		String url = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Link_Preview()), "href");
		configuration.setProperty("urlLink", url);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Link_Preview()), 2);	
		//$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Preview())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Link_Preview())));
		testContext.getPageObjectManager().getPageObject(driver).switchOnChildWindow();
		String expectedUrl = (java.lang.String)configuration.getProperty("urlLink");
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	/** This function verify new tab/same tab is authorable */
	public void displayLegalOpenUrlIn() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Legal_Open_Url()));
	}
	
	/** This function verify logo is authorable */
	public void displayLogoField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo_Field()));
	}

	/** This function uploads logo */
	public void uploadLogo() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Pick_Image())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_CTC_Web_CTR())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Select_Aem_Button())), 10);
	}
	
	/** This function verify logo is authorable */
	public void verifyUploadedLogoIsDisplayed() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Logo_In_Preview()));
	}
	
	/** This function clicks on download and accessibility tab */
	public void clickDownloadAndAccessibilityTab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Download_And_Accessibility_Tab())), 4);
	}
	
	/** Update be the first to know field */
	public void updateBeTheFirstToKnowField() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Title_Be_The_First()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Title_Be_The_First())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Be_The_First_To_Know());
	}
	
	/** verify To Be The First To Know changes are reflect on site */
	public void verifyToBeTheFirstChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Be_The_First_To_Know())), FileReaderManager.getInstance().getAEMDataReader().get_Be_The_First_To_Know());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** revert to be the first know changes */
	public void revertToBeTheFirstKnowChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Title_Be_The_First()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Title_Be_The_First())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Be_The_First_To_Know_Change());
	} 
	
	/** Update weekly flyer email directly field */
	public void updateWeeklyFlyerEmailDirectly() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Email_To_Directly()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Email_To_Directly())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Flyer_Email_Directly());
	}
	
	/** verify Weekly Flyer Email Directly changes are reflect on site */
	public void verifyFlyerEmailDirectlyChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Flyer_Email_Directly())), FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Flyer_Email_Directly());
		PageObject.getDriver().switchTo().parentFrame();
		
	}
	
	/** revert to be the first know changes */
	public void revertWeeklyFlyerEmailDirectly() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Email_To_Directly()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Email_To_Directly())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Flyer_Email_Directly_Change());
	} 
	
	/** update weekly sign up field */
	public void updateWeeklySignUpField() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Field()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Field())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Detail());
	}
	
	/** revert to weekly sign up changes */
	public void revertWeeklySignUpChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Field()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Field())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Detail_Change());
	} 
	
	/** verify weekly sign up changes are reflect on site */
	public void verifyWeeklySignUpChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up())), FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Detail());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** update weekly sign up url */
	public void updateWeeklySignUpUrl() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Url()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Url_Detail());
		Thread.sleep(3000);
	}
	
	/** revert to weekly sign up url changes */
	public void revertWeeklySignUpUrlChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Url()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Sign_Up_Url())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up__Url_Detail_Change());
		Thread.sleep(3000);
	} 
	
	/** verify weekly sign up url changes are reflect on site */
	public void verifyWeeklySignUpUrlChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Log.message("Was Url:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up()), "href"),true);
		Log.message("Url:- " +FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Url_Detail(), true);
		Assert.assertTrue($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up()), "href").contains(FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Url_Detail()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	/** update Download the App field */
	public void updateDownloadTheAppField() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Download_App_Title()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Download_App_Title())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Download_App_Title_Field());
	}
	
	/** Verify display Download the App field */
	public void displayDownloadTheApp() throws Exception {
		Thread.sleep(2000);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Download_App_Title_Preview())), 50);
	}
	/** update the Learn More text field */
	public void updateLearnMoreField() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Learn_More_Label()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Learn_More_Label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Label());
	}
	
	/** Verify display Learn More field */
	public void displayLearnMore() throws Exception {
		
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Learn_More())), 50);
	}
	/** update the Apple App Store Link */
	public void updateAppleAppStoreLink() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Apple_App_Store_Link_AEM()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Apple_App_Store_Link_AEM())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Apple_App_Store_URL());
	}
	/** Verify display Apple App Store Link */
	public void displayAppleAppStoreLink() throws Exception {
		
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Apple_App_Store_URL())), 50);
	}
	/** verify Apple App Store url changes are reflect on site */
	public void verifyAppleAppStoreUrlChangesReflectOnSite() throws Exception {
		Log.message("Actual Url:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_App_Store_Logo()), "href"),true);
		Log.message("Expected Url:- " +FileReaderManager.getInstance().getAEMDataReader().get_Apple_App_Store_URL(), true);
		Assert.assertTrue($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_App_Store_Logo()), "href").contains(FileReaderManager.getInstance().getAEMDataReader().get_Apple_App_Store_URL()));
	}
	/** update the Play Store Link */
	public void updatePlayStoreLink() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Play_Store_Link_AEM()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Play_Store_Link_AEM())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Play_Store_URL());
	}
	/** verify Play Store url changes are reflect on site */
	public void verifyPlayStoreUrlChangesReflectOnSite() throws Exception {
		Log.message("Actual Url:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_App_Store_Logo()), "href"),true);
		Log.message("Expected Url:- " +FileReaderManager.getInstance().getAEMDataReader().get_Play_Store_URL(), true);
		Assert.assertTrue($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_App_Store_Logo()), "href").contains(FileReaderManager.getInstance().getAEMDataReader().get_Play_Store_URL()));
	}
	/** update the Accessibility Link */
	public void updateAccessibilityIconLink() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Accessibility_Link_AEM()), 20);
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Accessibility_Link_AEM()));
		$enterData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Accessibility_Link_AEM())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_URL());
	}
	/** verify Accessibility url changes are reflect on site */
	public void verifyAccessibilityUrlChangesReflectOnSite() throws Exception {
		Log.message("Actual Url:- " + $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility_Logo()), "href"),true);
		Log.message("Expected Url:- " +FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_URL(), true);
		Assert.assertTrue($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility_Logo()), "href").contains(FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_URL()));
	}
	/** pick the Accessibility Logo */
	public void pickAccessibilityLogo() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Pick_Accessibility_Logo_AEM())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getCtcWeb())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Pick_Accessibility_Logo_Image())), 40);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Accessibility_Logo_Image_AEM())),40);	
	}
	/** Verify display Accessibility Logo */
	public void displayAccessibilityLogo() throws Exception {
		
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility_Logo())), 50);
	}
	/** Verify Select the Accessibility Link Target */
	public void updateAccessibilityLinkOnSamePageOrNewtab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Accessibility_Link_Target_AEM())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Target_Newtab())), 40);
	}
	/** Verify Click on Accessibility Logo */
	public void clickOnAccessibilityLogo() throws Exception {	
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Accessibility_Logo())), 50);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchOnChildWindow();
		String expectedUrl = FileReaderManager.getInstance().getAEMDataReader().get_Accessibility_URL();
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	/** Verify Select the Play Store Target */
	public void selectAndroidPlayAppTargetOnSamePageOrNewtab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Android_Play_App_Target_AEM())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Target_Newtab())), 40);
	}
	/** Verify Click on Play Store Logo */
	public void clickOnPlayStoreLogo() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Android_App_Store_Logo())), 50);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchOnChildWindow();
		String expectedUrl = FileReaderManager.getInstance().getAEMDataReader().get_Play_Store_URL();
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	/** Verify Select Apple App Store Target */
	public void selectAppleAppStoreTargetOnSamePageOrNewtab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Apple_App_Store_Target_AEM())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Target_Newtab())), 40);
	}
	/** Verify Click on Apple App Store Logo */
	public void clickOnAppleAppStoreLogo() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_App_Store_Logo())), 50);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchOnChildWindow();
		String expectedUrl = FileReaderManager.getInstance().getAEMDataReader().get_Apple_App_Store_URL();
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
	/** Verify Select Weekly Flyer Target */
	public void selectWeeklyFlyerTargetOnSamePageOrNewtab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Weekly_Flyer_Target_AEM())), 40);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFooterPageLocator().get_Target_Newtab())), 40);
	}
	/** Verify Click on Sign Up button */
	public void clickOnSignUpButton() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getFooterPageLocator().get_Weekly_Sign_Up())), 50);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchOnChildWindow();
		String expectedUrl = FileReaderManager.getInstance().getAEMDataReader().get_Weekly_Sign_Up_Publish_Url();
		Log.message("Expected Url:- " + expectedUrl, true);
		String actualUrl = PageObject.getDriver().getCurrentUrl();
		Log.message("Actual Url:- " + actualUrl, true);
		Assert.assertEquals(expectedUrl, actualUrl);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
	}
}
