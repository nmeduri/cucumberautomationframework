package runners;

import java.util.stream.Stream;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.picocontainer.classname.ClassName;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
import automation.library.selenium.base.BaseClass;

public final class Latest_Commit_Runner extends BaseClass{
	public static String name;
	private static String[] defaultOptions = {

			"classpath:SAP/Regression/OCCP_4416_Add_default_colourorvariant_logic_and_update_data_for_Product_Details_OCC.feature",
			"--glue", "automation.library.stepDefination",
			"--tags", "@RegressionTest",
			"--plugin", "pretty",
			"--plugin", "json:cucumber.json",
			"--plugin", "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html",
			"--plugin", "junit:target/JunitReports/SAP_BVT.xml",
			"--plugin", "html:target/selenium-reports"
	};

	public static void main(String[] args) throws Throwable {
	
		Latest_Commit_Runner ls = new Latest_Commit_Runner();
		String className = ls.getClass().getSimpleName();
		name = className;
		conf.setProperty("className", className);
		conf.getProperty("className");
		Log.message("Class Name:- " + conf.getProperty("className"), true );
		Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
		cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
	}
	
	public void className() {
		Log.message("Class Name:- " + this.getClass().getSimpleName(), true );
	}
}
