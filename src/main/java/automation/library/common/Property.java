package automation.library.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;

import automation.library.cucumber.Constant;

public class Property {

	/**
	 * gets properties file
	 * 
	 */

	private Properties prop = null;

	public Property() {

	}

	public PropertiesConfiguration getProperties(String filePath) {
		PropertiesConfiguration props = new PropertiesConfiguration();
		InputStream is = null;
		try {

			is = this.getClass().getResourceAsStream(filePath);
			props.load(is);
		} catch (Exception e) {
			return null;
		}
		return props;
	}
	
	public PropertiesConfiguration setProperties(String filePath) {
		PropertiesConfiguration props = new PropertiesConfiguration();
		InputStream is = null;
		try {

			is = this.getClass().getResourceAsStream(filePath);
			props.load(is);
		} catch (Exception e) {
			return null;
		}
		return props;
	}
	
	public static void setProperty(String propsPath, String key, String value) {
		Property property = new Property();
		
		property.getProperties(propsPath).setProperty(key, value);
	}
	
//	public static void writeData(File file) throws Exception {
//		FileOutputStream fileOut = new FileOutputStream(file);
//		propoutput.store(fileOut, "");
//		fileOut.close();
//	}

	/**
	 * gets string data from any properties file on given path
	 */
	public static String getProperty(String propsPath, String key) {
		Property property = new Property();
		
		return property.getProperties(propsPath).getString(key);
	}

	public String getPropertyValue(String key) {
		return this.prop.getProperty(key);
	}

	/**
	 * gets string array data from any properties file on given path
	 */
	public static String[] getPropertyArray(String propsPath, String key) {
		Property property = new Property();
		return property.getProperties(propsPath).getStringArray(key);
	}

	/**
	 * gets value for variable based on preference of system property first then
	 * environment variable
	 */
	public static String getVariable(String propname) {
		String val = System.getProperty(propname, null);
		val = (val == null ? System.getenv(propname) : val);
		return val;
	}

}
