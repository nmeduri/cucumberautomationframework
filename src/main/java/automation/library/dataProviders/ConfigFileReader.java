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
		String url = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	} 
	
/*	public String getApplicationUrl() {
		String environment = System.getenv("environment");
		if (environment.equalsIgnoreCase("dev"))
			return Property.getProperty(Constant.SELENIUM_CONFIGURATION, "devUrl");
		else if(environment.equalsIgnoreCase("qa"))
			return Property.getProperty(Constant.SELENIUM_CONFIGURATION, "qaUrl");
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}   */

	public String getBrowser() {
		String browserName = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "browser");
		Log.message("Browser:- " + browserName, true);
		if (browserName == null || browserName.equals("chrome"))
			return browserName;
		else if (browserName.equalsIgnoreCase("firefox"))
			return browserName;
		else if (browserName.equals("headless"))
			return browserName;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public String getServerType() {
		
		String serverType = Property.getProperty(Constant.SELENIUM_CONFIGURATION, "serverType");
		Log.message("Server Type:- " + serverType, true);
		if (serverType == null || serverType.equals("saucelabs"))
			return serverType;
		else if (serverType == null || serverType.equals("default"))
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