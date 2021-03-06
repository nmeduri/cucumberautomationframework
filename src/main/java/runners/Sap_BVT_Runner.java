package runners;

import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;

/**
 * This file execute the scenarios of SAP BVT 
 */

public final class Sap_BVT_Runner extends BaseClass {
	
	private static String[] defaultOptions = {

			"classpath:SAP/BVT/SAP_BVT.feature", 
			"--glue", "automation.library.stepDefination",
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json", 
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml",
			"--plugin", "html:target/selenium-reports"
		
	};

	public static void main(String[] args) throws Throwable {
		Sap_BVT_Runner ls = new Sap_BVT_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
}
