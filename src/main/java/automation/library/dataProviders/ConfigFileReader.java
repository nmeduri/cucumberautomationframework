package automation.library.dataProviders;

import java.io.InputStream;
import java.util.Properties;



import org.apache.commons.configuration.PropertiesConfiguration;
import automation.library.cucumber.Constant;
import automation.library.enums.DriverType;
import automation.library.enums.EnvironmentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = Constant.SELENIUM_CONFIGURATION;
	private Properties prop = null;

	public ConfigFileReader(){
        
       
   }
	
	public PropertiesConfiguration getProperties(String propsPath) {
		PropertiesConfiguration props = new PropertiesConfiguration();
		InputStream is = null;
	       try {
	           this.prop = new Properties();
	           is = this.getClass().getResourceAsStream(propsPath);
	           props.load(is);
	       }catch(Exception e){
				return null;
			}
	       return props;
	}
	
	public static String getProperty(String propsPath, String key) {
		ConfigFileReader conf = new ConfigFileReader();
		return conf.getProperties(propsPath).getString(key);
	}

	
	public String getChromeDriverPath() {

		//String driverPath = Constant.BASEPATH_RESOURCES + properties.getProperty("chromeDriverPath");
		String driverPath = ConfigFileReader.getProperty(Constant.SELENIUM_CONFIGURATION, "chromeDriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getGeckoDriverPath() {
		String driverPath = ConfigFileReader.getProperty(Constant.SELENIUM_CONFIGURATION, "geckoDriverPath");
		//String driverPath = Constant.BASEPATH_RESOURCES + properties.getProperty("geckoDriverPath");
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
		//Property prop = new Property(Constant.SELENIUM_CONFIGURATION);
		//String url = prop.getPropertyValue("url");
		String url = ConfigFileReader.getProperty(Constant.SELENIUM_CONFIGURATION, "url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORE;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
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