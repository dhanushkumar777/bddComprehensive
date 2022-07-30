package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.ConnectPage;
import com.pageobject.NewPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnectStepDefinition extends BrowserHelper{
	@Before
	public void connect() throws IOException {
		driver=initializing();
		ExtentTest test = extent.createTest("Browser Connect");
		test.pass("Initializing Browser");
		log.info("Started chrome browser");
		test.pass("Chrome Driver Started");
		test.pass("Fetched Tide URL and getting home page");
		log.info("Fetched Tide url");
	}
	
	@After
	public void closer() {
		ExtentTest test = extent.createTest("Closing All Drivers and Browsing Windows");
		log.info("Closed browser");
		log.info("Finished Extent Report");
		test.pass("Chrome Browser closed");
		test.pass("Chrome Driver Closed");
		extent.flush();
		//driver.close();
		driver.quit();
	}
	ConnectPage fp = new ConnectPage(driver);
	
	@Given("I have option {string}")
	public void i_have_option(String string) {
	    
	}

	@Then("click on LiveChat")
	public void click_on_liveChat() {
		test = extent.createTest("Click on LiveChat");
		try {
			fp.clicklink();;
			test.pass("clicked on live chat header");
			log.info("clicked on live chat");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
