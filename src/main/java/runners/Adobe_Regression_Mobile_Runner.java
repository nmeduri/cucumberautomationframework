package runners;


import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;
import cucumber.api.CucumberOptions;
/**
 * This file execute the scenarios of Adobe Regression (Mobile)
 */ 


public final class Adobe_Regression_Mobile_Runner extends BaseClass {
	private static String[] defaultOptions = {

			"classpath:Adobe/Regression/OCCP_2803_Active_Ownership_Validation_Screen.feature",
			"--glue", "automation.library.stepDefination", 
			"--plugin", "pretty",
			"--tags", "@2521",
			"--plugin", "json:cucumber.json",
			"--plugin", "junit:target/JunitReports/Adobe_Regression.xml" ,
			"--plugin", "html:target/selenium-reports",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"

		};

	public static void main(String[] args) throws Throwable {
		Adobe_Regression_Mobile_Runner ls = new Adobe_Regression_Mobile_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
		
	}
}
