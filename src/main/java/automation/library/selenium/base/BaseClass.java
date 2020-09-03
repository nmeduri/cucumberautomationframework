package automation.library.selenium.base;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogVersionEndPoint;
import automation.library.api.endpoint.CatalogsEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.endpoint.HYB_API_EN_End_Point;
import automation.library.api.endpoint.HYB_API_FR_CA_End_Point;
import automation.library.api.endpoint.HYB_API_Wishlist_End_Point;
import automation.library.api.endpoint.HYB_Api_Field_Default_End_Point;
import automation.library.api.endpoint.HYB_Api_Product_End_Point;
import automation.library.cucumber.TestContext;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.logdetail.Log;
import automation.library.managers.PageObjectManager;
import automation.library.pageObjects.PDP_Page;
import automation.library.pageObjects.Sign_Up_Page;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.restassured.response.Response;

/*
 * This class calls the URL of Product Info's APIs and
 * Execute the APIs method
 * 
 * @author Shasahnk Bansal
 * @version 1.0 03/07/2020
 */

public class BaseClass {

	protected TestContext testContext;
	protected PageObjectManager pageObjectManager;
	protected DriverFactory driverFactory;
	protected ConfigFileReader configFileReader;
	protected WebDriver driver;
	public static String emailVaue;


}
