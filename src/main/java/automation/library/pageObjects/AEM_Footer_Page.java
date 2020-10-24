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
	
	/** This functions verify legal text label is successfully updated on site */
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
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_privacyPolicyURL() + "']"));
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
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_siteMapURL() + "']"));
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
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Footer_AccessibilityURL() + "']"));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		PageObject.getDriver().switchTo().parentFrame();
		
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

	/** This function naviget to Footer Author Page */
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
}
