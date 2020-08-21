package automation.library.cucumber;

import automation.library.logdetail.Log;

public class Constant {

	public static final String SELENIUM_CONFIGURATION = "/config/Configuration.properties";
	public static final String OR_FILE = "/ObjectRepository/OR.properties";
	public static final String BASE_PATH = System.getProperty("user.dir");
	public static final String API_DATA = "/config/" + apiDataFile();
	public static final String DATA_FILE = "/config/" + dataFile();
	
	public static String configureFile;

	public static String pathFunction() {
		String path = System.getProperty("user.dir");
		String updatepath = path.replaceAll("target", "");
		return updatepath;
	}
	
	
	public static String apiDataFile() {
		String sEnvironment = System.getenv("environment");
		if (sEnvironment.equalsIgnoreCase("D1")) {
			configureFile = "API_Data_D1.properties";
			Log.message("File:- " + configureFile, true);
			return configureFile;
		} else {
			configureFile = "API_Data_D2.properties";
			Log.message("File:- " + configureFile, true);
			return configureFile;
		}

	}
	
	public static String dataFile() {
		String sEnvironment = System.getenv("environment");
		if (sEnvironment.equalsIgnoreCase("D1")) {
			configureFile = "dataFile_D1.properties";
			Log.message("File:- " + configureFile, true);
			return configureFile;
		} else {
			configureFile = "dataFile_D2.properties";
			Log.message("File:- " + configureFile, true);
			return configureFile;
		}

	}
	
	

}
