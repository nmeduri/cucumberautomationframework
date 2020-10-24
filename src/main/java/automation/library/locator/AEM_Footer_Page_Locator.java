package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Footer component page
 * 
 */
public class AEM_Footer_Page_Locator {
	
	
	String FooterComponent = Property.getProperty(Constant.OR_FILE, "FooterComponent");
	String LegalTextInput=Property.getProperty(Constant.OR_FILE, "LegalTextInput");
	String LegalTextURL=Property.getProperty(Constant.OR_FILE, "LegalTextURL");
	String TermsnConditionText=Property.getProperty(Constant.OR_FILE, "Terms&ConditionText");
	String TermsnConditionURL=Property.getProperty(Constant.OR_FILE, "Terms&ConditionURL");
	String privacyPolicyText=Property.getProperty(Constant.OR_FILE, "privacyPolicyText");
	String privacyPolicyURL=Property.getProperty(Constant.OR_FILE, "privacyPolicyURL");
	String SiteMap=Property.getProperty(Constant.OR_FILE, "SiteMap");
	String SiteMapURL=Property.getProperty(Constant.OR_FILE, "SiteMapURL");
	String AccessibilityText=Property.getProperty(Constant.OR_FILE, "AccessibilityText");
	String AccessibilityURL=Property.getProperty(Constant.OR_FILE, "AccessibilityURL");
	String CopyrightLabel=Property.getProperty(Constant.OR_FILE, "CopyrightLabel");
	String legalDisclaimer=Property.getProperty(Constant.OR_FILE, "legalDisclaimer");
	String viewMore=Property.getProperty(Constant.OR_FILE, "viewMore");
	String viewLess=Property.getProperty(Constant.OR_FILE, "viewLess");

	String footerPannelAEM = Property.getProperty(Constant.OR_FILE, "footerPannelAEM").replace("=", ",");
	String orderStatusAEM = Property.getProperty(Constant.OR_FILE, "orderStatusAEM");
	String pickUpDeliveryAEM = Property.getProperty(Constant.OR_FILE, "pickUpDeliveryAEM");
	String returnExchangesAEM = Property.getProperty(Constant.OR_FILE, "returnExchangesAEM");
	String helpAndFaqsAEM = Property.getProperty(Constant.OR_FILE, "helpAndFaqsAEM");
	String contactUSAEM = Property.getProperty(Constant.OR_FILE, "contactUSAEM");
	String storeLocatorAEM = Property.getProperty(Constant.OR_FILE, "storeLocatorAEM");
	String productRecallsAEM = Property.getProperty(Constant.OR_FILE, "productRecallsAEM");
	String safetyDataSheetsAEM = Property.getProperty(Constant.OR_FILE, "safetyDataSheetsAEM");
	String customerServiceFooterSectionUpdate = Property.getProperty(Constant.OR_FILE, "customerServiceFooterSectionUpdate");
	
	String financialServicesAEM = Property.getProperty(Constant.OR_FILE, "financialServicesAEM");
	String installationAssemblingAEM = Property.getProperty(Constant.OR_FILE, "installationAssemblingAEM");
	String autoServiceCenterAEM = Property.getProperty(Constant.OR_FILE, "autoServiceCenterAEM");
	String loanToolAEM = Property.getProperty(Constant.OR_FILE, "loanToolAEM");
	String roadSideAsistance = Property.getProperty(Constant.OR_FILE, "roadSideAsistance");
	String giftCardsAEM = Property.getProperty(Constant.OR_FILE, "giftCardsAEM");
	String testedForLifeAEM = Property.getProperty(Constant.OR_FILE, "testedForLifeAEM");
	String giftRegistryAEM = Property.getProperty(Constant.OR_FILE, "giftRegistryAEM");
	
	String columnTwoTab = Property.getProperty(Constant.OR_FILE, "columnTwoTab");
	String serviceSolutionsFooterSectionUpdate = Property.getProperty(Constant.OR_FILE, "serviceSolutionsFooterSectionUpdate"); 
	
	String aboutCanadianTireAEM = Property.getProperty(Constant.OR_FILE, "aboutCanadianTireAEM");
	String careersAEM = Property.getProperty(Constant.OR_FILE, "careersAEM");
	String aboutTriangleAEM = Property.getProperty(Constant.OR_FILE, "aboutTriangleAEM");
	String recylingInformationAEM = Property.getProperty(Constant.OR_FILE, "recylingInformationAEM");
	String ourBrandsAEM = Property.getProperty(Constant.OR_FILE, "ourBrandsAEM");
	String flyerSignUpAEM = Property.getProperty(Constant.OR_FILE, "flyerSignUpAEM");
	String sustaiabilityAEM = Property.getProperty(Constant.OR_FILE, "sustaiabilityAEM");
	String columnThreeTab = Property.getProperty(Constant.OR_FILE, "columnThreeTab");
	String aboutUsSectionUpdate = Property.getProperty(Constant.OR_FILE, "aboutUsSectionUpdate"); 
	
	String columnFourTab = Property.getProperty(Constant.OR_FILE, "columnFourTab");
	String privacyPlolicyAEM = Property.getProperty(Constant.OR_FILE, "privacyPlolicyAEM");
	String termAndConditionsAEM = Property.getProperty(Constant.OR_FILE, "termAndConditionsAEM");
	String siteMapAEM = Property.getProperty(Constant.OR_FILE, "siteMapAEM");
	String accessibilityAEM = Property.getProperty(Constant.OR_FILE, "accessibilityAEM");
	String pricingPolicyAEM = Property.getProperty(Constant.OR_FILE, "pricingPolicyAEM");
	String legalSectionUpdate = Property.getProperty(Constant.OR_FILE, "legalSectionUpdate");

    /**
	 * gets Locator - Footer component
	 * 
	 */
    
	public String getFooterComponent() {
		return FooterComponent;	
	}
	/**
	 * gets Locator - Footer component-LegalText
	 * 
	 */
    
	public String getFooter_LegalText() {
		return LegalTextInput;	
	}
	/**
	 * gets Locator - Footer component-LegalTextURL
	 * 
	 */
    
	public String getFooter_LegalURL() {
		return LegalTextURL;	
	}
	/**
	 * gets Locator - Footer component-Terms&ConditionText
	 * 
	 */
    
	public String getFooter_TermsnConditionText() {
		return TermsnConditionText;	
	}
	/**
	 * gets Locator - Footer component-Terms&ConditionURL
	 * 
	 */
    
	public String getFooter_TermsnConditionURL() {
		return TermsnConditionURL;	
	}
	/**
	 * gets Locator - Footer component-privacyPolicyText
	 * 
	 */
    
	public String getFooter_privacyPolicyText() {
		return privacyPolicyText;	
	}
	/**
	 * gets Locator - Footer component-Privacy Policy URL
	 * 
	 */
    
	public String getFooter_PrivacyPolicyURL() {
		return privacyPolicyURL;	
	}
	/**
	 * gets Locator - Footer component-SiteMap
	 * 
	 */
    
	public String getFooter_SiteMap() {
		return SiteMap;	
	}
	/**
	 * gets Locator - Footer component-SiteMap URL
	 * 
	 */
    
	public String getFooter_siteMapURL() {
		return SiteMapURL;	
	}
	/**
	 * gets Locator - Footer component-AccessibilityText
	 * 
	 */
    
	public String getFooter_AccessibilityText() {
		return AccessibilityText;	
	}
	/**
	 * gets Locator - Footer component-AccessibilityURL
	 * 
	 */
    
	public String getFooter_AccessibilityURL() {
		return AccessibilityURL;	
	}
	/**
	 * gets Locator - Footer component-CopyrightLabel
	 * 
	 */
    
	public String getFooter_CopyrightLabel() {
		return CopyrightLabel;	
	}
	/**
	 * gets Locator - Footer component-legalDisclaimer
	 * 
	 */
    
	public String getFooter_legalDisclaimer() {
		return legalDisclaimer;	
	}
	/**
	 * gets Locator - Footer component-viewMore
	 * 
	 */
    
	public String getFooter_viewMore() {
		return viewMore;	
	}
	/**
	 * gets Locator - Footer component-viewLess
	 * 
	 */
    
	public String getFooter_viewLess() {
		return viewLess;	
	}
	 /**
		 * gets Locator - Footer Pannel
		 * 
		 */
	    
		public String getFooterPannel() {
			return footerPannelAEM;	
		}
		
		/**
		 * 
		 * get Locator - order status
		 * 
		 */
		public String getOrderStatus() {
			return orderStatusAEM;
		}
		
		/**
		 * 
		 * get Locator - Pick Up and Delivery
		 * 
		 */
		public String getPickUpDelivery() {
			return pickUpDeliveryAEM;
		}
		
		/**
		 * 
		 * get Locator - return Exchange 
		 * 
		 */
		public String getReturnExchange() {
			return returnExchangesAEM;
		}
		
		/**
		 * 
		 * get Locator - Help And FAQ
		 * 
		 */
		public String getHelpFQA() {
			return helpAndFaqsAEM;
		}
		
		/**
		 * 
		 * get Locator - Contact Us
		 * 
		 */
		public String getContactUs() {
			return contactUSAEM;
		}
		
		/**
		 * 
		 * get Locator - Store Locator
		 * 
		 */
		public String getStoreLocator() {
			return storeLocatorAEM;
		}
		
		/**
		 * 
		 * get Locator - Product Recall
		 * 
		 */
		public String getProductRecall() {
			return productRecallsAEM;
		}
		
		/**
		 * 
		 * get Locator - Safety Data Sheet
		 * 
		 */
		public String getSafetyDataSheet() {
			return safetyDataSheetsAEM;
		}
		
		/**
		 * 
		 * get Locator - Customer Service Container
		 * 
		 */
		
		public String getCustomerServiceSection() {
			return customerServiceFooterSectionUpdate;
		}
		
		
		/**---------**/
		
		/**
		 * 
		 * get Locator - Financial Services
		 * 
		 */
		
		public String getFinancialServices() {
			return financialServicesAEM;
		}
		/**
		 * 
		 * get Locator - Installation Assembling
		 * 
		 */
		
		public String getInstallationAssembling() {
			return installationAssemblingAEM;
		}
		/**
		 * 
		 * get Locator - Auto Service Center
		 * 
		 */
		
		public String getAutoServiceCenter( ) {
			return autoServiceCenterAEM;
		}
		/**
		 * 
		 * get Locator - Loan Tool
		 * 
		 */
		
		public String getLoanTool() {
			return loanToolAEM;
		}
		/**
		 * 
		 * get Locator - Road Side Assistance
		 * 
		 */
		
		public String getRoadSideAssistance() {
			return roadSideAsistance;
		}
		/**
		 * 
		 * get Locator - Gift Card
		 * 
		 */
		
		public String getGiftCards() {
			return giftCardsAEM;
		}
		/**
		 * 
		 * get Locator - Tested For Life
		 * 
		 */
		
		public String getTestForLife() {
			return testedForLifeAEM;
		}
		/**
		 * 
		 * get Locator - Gift Registry
		 * 
		 */
		
		public String getGiftRegistry() {
			return giftRegistryAEM;
		}
		
		/**
		 * 
		 * get Locator - Coloumn Two
		 */
		
		public String get_Column_Two() {
			return columnTwoTab;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Service And Installations
		 */
		public String get_Service_And_Installation_Updated() {
			return serviceSolutionsFooterSectionUpdate;
		}
		
		/**
		 * 
		 * 
		 * get Locator - About Canadian Tire
		 */
		public String get_About_Canadian_Tire() {
			return aboutCanadianTireAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - About Triangle
		 */
		public String get_About_Triangle() {
			return aboutTriangleAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Careers
		 */
		public String get_Careers() {
			return careersAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Recyling Information
		 */
		public String get_Recyling_Information() {
			return recylingInformationAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Our Brands
		 */
		public String get_Our_Brands() {
			return ourBrandsAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Flyyer Sign Up
		 */
		public String get_Flyer_Sign_Up() {
			return flyerSignUpAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Sustainability
		 */
		public String get_Sustainability() {
			return sustaiabilityAEM;
		}
		
		
		/**
		 * 
		 * 
		 * get Locator - Column Three
		 */
		public String get_Column_Three() {
			return columnThreeTab;
		}
		
		/**
		 * 
		 * 
		 * get Locator - About Us Section
		 */
		public String get_About_Section() {
			return aboutUsSectionUpdate;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Legal Section
		 */
		public String get_Column_Four() {
			return columnFourTab;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Privacy Policy
		 */
		public String get_Privacy_Policy() {
			return privacyPlolicyAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Terms And Condition
		 */
		public String get_Term_And_Condition() {
			return termAndConditionsAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Site Map
		 */
		public String get_Site_Map() {
			return siteMapAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Accessibility
		 */
		public String get_Accessibility() {
			return accessibilityAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Pricing Policy
		 */
		public String get_Pricing_Policy() {
			return pricingPolicyAEM;
		}
		
		/**
		 * 
		 * 
		 * get Locator - Legal Section On Site
		 */
		public String get_Legal_Section_Update() {
			return legalSectionUpdate;
		}
		

	}

