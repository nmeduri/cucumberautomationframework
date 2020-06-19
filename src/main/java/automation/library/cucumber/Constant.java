package automation.library.cucumber;


public class Constant {

	public static final String SELENIUM_CONFIGURATION = "/config/Configuration.properties";
	public static final String OR_FILE = "/ObjectRepository/OR.properties";

	public static String pathFunction() {
		String path = System.getProperty("user.dir");
		String updatepath = path.replaceAll("target", "");
		return updatepath;
	}

}
