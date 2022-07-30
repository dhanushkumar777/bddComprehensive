package com.stepdefinition;

import java.io.IOException;

import com.pageobject.ZBounceBuyPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZBounceBuyStepDefinition extends BrowserHelper{
	
	ZBounceBuyPage fp = new ZBounceBuyPage(driver);
	
	@Given("I have Help & Support Option")
	public void i_have_help_support_option() {
	    
	}

	@When("I click Bounce")
	public void i_click_bounce() {
		test = extent.createTest("Click on Bounce");
	    try {
			fp.clickbounce();
			test.pass("clicked on Bounce");
			log.info("clicked on bounce");
			fp.iframeClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("I will Buy")
	public void i_will_buy() {
		test = extent.createTest("Type a question");
	    try {
			fp.buy();
			test.pass("click buy pass");
			
			log.info("clicking buy");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*@Then("It show the result")
	public void it_show_the_result() {
		test = extent.createTest("Verify Text");
	    try {
			//fp.getText();
			Boolean flag = fp.getText();
			if(flag==true) {
				test.pass("Verification of the text Successfully");
				log.info("Verified text");
			}
			else {
				test.pass("Verification of the text Failed");
				log.error("Verification failed");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
