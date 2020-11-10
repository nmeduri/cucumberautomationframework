package automation.library.dataProviders;

import java.io.InputStream;
import java.util.Properties;



import org.apache.commons.configuration.PropertiesConfiguration;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * gets Configuration Data of Project
 * 
 */

public class ConfigFileReader {

	private Properties properties;

	public ConfigFileReader(){
        
       
   }
	
	/**
	 * gets Chrome Driver Path
	 * 
	 */
	
	public String getChromeDriverPath() {

		String driverPath = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "chromeDriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets Gecko Driver Path
	 * 
	 */

	public String getGeckoDriverPath() {
		String driverPath = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "geckoDriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets implicity Wait
	 * 
	 */

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets application url
	 * 
	 */

	public String getApplicationUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	} 
	
	/**
	 * gets pdp url
	 * 
	 */
	
	public String getPDPUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "pdpUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets plp url
	 * 
	 */
	
	public String getPLPUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "plpUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets plp url
	 * 
	 */
	
	public String getPLPUrlShowMore() {
		String url = Property.getProperty(Constant.DATA_FILE, "showMoreProductPLP");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	/**
	 * gets Sign In url
	 * 
	 */
	
	public String getSignUpUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "signUpUrl");
		Log.message("URL:- " + url, true);
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");	
	}
	
	/**
	 * gets Application url
	 * 
	 */
	
	public String getApplicationSAPUrl() {
	
		String environment = System.getenv("environment");
		if (environment.equalsIgnoreCase("D1"))
			return Property.getProperty(Constant.DATA_FILE, "devAuthorUrl");
		else if(environment.equalsIgnoreCase("D2"))
			return Property.getProperty(Constant.DATA_FILE, "qaAuthorUrl");
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}
	
	/**
	 * gets Adobe Application url
	 * 
	 */
	
	public String getApplicationAdobeUrl() {
		
		String environment = System.getenv("environment");
		if (environment.equalsIgnoreCase("D1"))
			return Property.getProperty(Constant.DATA_FILE, "devUrl");
		else if(environment.equalsIgnoreCase("D2"))
			return Property.getProperty(Constant.DATA_FILE, "qaUrl");
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}
	
	/**
	 * gets browser data
	 * 
	 */

	public String getBrowser() {
		String browserName = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "browser");
		Log.message("Browser:- " + browserName, true);
		if (browserName == null || browserName.equals("chrome"))
			return browserName;
		else if (browserName.equalsIgnoreCase("safari"))
			return browserName;
		else if (browserName.equalsIgnoreCase("firefox"))
			return browserName;
		else if (browserName.equals("headless"))
			return browserName;
		else if (browserName.equals("headless mobile"))
			return browserName;
		else if (browserName.equalsIgnoreCase("mobile-chrome"))
			return browserName;
		else if (browserName.equalsIgnoreCase("chrome - widescreen"))
			return browserName;
		else if(browserName.equalsIgnoreCase("wideScreenView"))
			return browserName;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	/**
	 * gets web browser
	 * 
	 */
	
	public String getWebBrowser() {
		String webView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "webView");
		return webView;
	}
	
	/**
	 * gets mobile broser
	 * 
	 */
	
	public String getMobileView() {
		String mobileView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "mobileView");
		return mobileView;
	}
	
	/**
	 * gets Headless Mobile View
	 * 
	 */
	
	public String getHeadlessMobile() {
		String headlessMobile = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "headlessMobile");
		return headlessMobile;
	}
	
	/**
	 * gets Wide view chrome
	 * 
	 */
	
	public String getWideViewChrome() {
		String wideView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "wideScreenView");
		return wideView;
	}
	
	/**
	 * gets Server details as Sauce labs, headless, without headless
	 * 
	 */
	
	public String getServerType() {
		
		String serverType = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "serverType");
		Log.message("Server Type:- " + serverType, true);
		if (serverType == null || serverType.equals("saucelabs"))
			return serverType;
		else if (serverType == null || serverType.equals("local"))
			return serverType;
		else if (serverType == null || serverType.equals("headless"))
			return serverType;
		else
			throw new RuntimeException(
					"Server Type Key value in Configuration.properties is not matched :" + serverType);
		
	}
	/**
	 * gets browser window size
	 * 
	 */

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}
	
	/**
	 * gets test data resource path
	 * 
	 */

	public String getTestDataResourcePath() {
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
	}
	
	/**
	 * gets report path
	 * 
	 */

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
	/**
	 * gets Checkout page url
	 * 
	 */
	
	public String getCheckoutPageUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "simpleHeaderCheckoutUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("simpleHeaderCheckoutUrl not specified in the Configuration.properties file.");
	}
	/**
	 * gets Sign In url
	 * 
	 */
	
	public String getSignUpUrl_Fr() {
		String getSignUpUrlFr = Property.getProperty(Constant.DATA_FILE, "signUpUrl_Fr");
		Log.message("URL:- " + getSignUpUrlFr, true);
		if (getSignUpUrlFr != null)
			return getSignUpUrlFr;
		else
			throw new RuntimeException("signUpUrl_Fr not specified in the Configuration.properties file.");	
	}
	/**
	 * gets Customer Service Page Url
	 * 
	 */
	
	public String getCustomerServicePageUrl() {
		String getCustomerServicePageUrl = Property.getProperty(Constant.DATA_FILE, "customerServicePageUrl");
		Log.message("URL:- " + getCustomerServicePageUrl, true);
		if (getCustomerServicePageUrl != null)
			return getCustomerServicePageUrl;
		else
			throw new RuntimeException("customerServicePageUrl not specified in the Configuration.properties file.");	
	}
	
	/**
	 * gets Cart page url
	 * 
	 */
	
	public String getCartUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "cartUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("simpleHeaderCheckoutUrl not specified in the Configuration.properties file.");
	}
}