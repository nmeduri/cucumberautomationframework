package runners;

import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;

public final class Sap_Regression_Runner extends BaseClass {
	
	private static String[] defaultOptions = {

			"classpath:SAP/Regression/", 
			"--glue", "automation.library.stepDefination",
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml",
			"--plugin", "html:target/selenium-reports"

	};

	public static void main(String[] args) throws Throwable {
		Sap_Regression_Runner ls = new Sap_Regression_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
