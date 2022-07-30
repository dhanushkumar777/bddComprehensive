package com.reusablecomponents;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utilities.BrowserUtil;
import com.utilities.ConfigUtil;
import com.utilities.Excel;
import com.utilities.ExtentReportUtil;
import com.utilities.LogUtil;

public class BrowserHelper{
	LogUtil logg = new LogUtil();
	ExtentReportUtil ext = new ExtentReportUtil();
	BrowserUtil br1 = new BrowserUtil();
	public static Excel ex;
	ConfigUtil config;
	public static WebDriver driver;
	public FileInputStream fis;
	static public Logger log;
	static public ExtentReports extent;
	static public ExtentTest test;
//	public BrowserUtil br;
	
	public WebDriver initializing() throws IOException {
		
		log = logg.loggs();
		extent = ext.extentReport();
		config= new ConfigUtil();
		ex = new Excel();
		String BrowserTaken = config.getKey("Browser");
		String UrlFromConfig = config.getKey("Url");
		driver = br1.visitWebBrowsers(driver, BrowserTaken, UrlFromConfig);
		log.info("Setting Up Browser");
		return driver;
	}
}
