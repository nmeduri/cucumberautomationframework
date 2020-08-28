package automation.library.dataProviders;

import java.io.InputStream;
import java.util.Properties;



import org.apache.commons.configuration.PropertiesConfiguration;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.enums.DriverType;
import automation.library.enums.EnvironmentType;
import automation.library.logdetail.Log;

public class ConfigFileReader {

	private Properties properties;

	public ConfigFileReader(){
        
       
   }
	
	public String getChromeDriverPath() {

		String driverPath = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "chromeDriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getGeckoDriverPath() {
		String driverPath = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "geckoDriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	} 
	
	public String getPDPUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "pdpUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getPLPUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "plpUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	
	
	public String getSignUpUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "signUpUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");	
	}
	
	public String getApplicationSAPUrl() {
	
		String environment = System.getenv("environment");
		if (environment.equalsIgnoreCase("D1"))
			return Property.getProperty(Constant.DATA_FILE, "devAuthorUrl");
		else if(environment.equalsIgnoreCase("D2"))
			return Property.getProperty(Constant.DATA_FILE, "qaAuthorUrl");
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}
	
	public String getApplicationAdobeUrl() {
		
		String environment = System.getenv("environment");
		if (environment.equalsIgnoreCase("D1"))
			return Property.getProperty(Constant.DATA_FILE, "devUrl");
		else if(environment.equalsIgnoreCase("D2"))
			return Property.getProperty(Constant.DATA_FILE, "qaUrl");
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}

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
		else if(browserName.equalsIgnoreCase("wideScreenView"))
			return browserName;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public String getWebBrowser() {
		String webView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "webView");
		return webView;
	}
	
	public String getMobileView() {
		String mobileView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "mobileView");
		return mobileView;
	}
	
	public String getHeadlessMobile() {
		String headlessMobile = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "headlessMobile");
		return headlessMobile;
	}
	
	public String getWideViewChrome() {
		String wideView = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "wideScreenView");
		return wideView;
	}
	
	public String getServerType() {
		
		String serverType = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "serverType");
		Log.message("Server Type:- " + serverType, true);
		if (serverType == null || serverType.equals("saucelabs"))
			return serverType;
		else if (serverType == null || serverType.equals("without headless"))
			return serverType;
		else if (serverType == null || serverType.equals("headless"))
			return serverType;
		else
			throw new RuntimeException(
					"Server Type Key value in Configuration.properties is not matched :" + serverType);
		
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public String getTestDataResourcePath() {
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}