package runners;


import java.util.stream.Stream;

import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;
import cucumber.api.CucumberOptions;

/**
 * This file execute the scenarios of Adobe Regression (Web)
 */

public final class AEM_Regression_Runner extends BaseClass {
	
	private static String[] defaultOptions = {
			


			"classpath:Adobe/AEM/Regression/", 
			"--glue", "automation.library.stepDefination", 
			"--plugin", "pretty",
			"--tags", "@AEM",
			"--plugin", "json:cucumber.json",
			"--plugin", "junit:target/JunitReports/Adobe_Regression.xml" ,
			"--plugin", "html:target/selenium-reports",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"

		};

	public static void main(String[] args) throws Throwable {
		AEM_Regression_Runner ls = new AEM_Regression_Runner();
		String className = ls.getClass().getSimpleName();
		Log.message("Class Name:- " + className, true);
		conf.setProperty("className", className);
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
		
	}
}
