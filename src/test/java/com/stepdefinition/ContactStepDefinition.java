package com.stepdefinition;

import java.io.IOException;

import com.pageobject.ContactPage;
import com.pageobject.ZBounceBuyPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinition extends BrowserHelper{
	
	ContactPage fp = new ContactPage(driver);
	
	@Given(" I have Contact")
	public void i_have_contact() {
	    
	}

	@When("Clicked on Contact")
	public void clicked_on_contact() {
		test = extent.createTest("Click on contact");
	    try {
			fp.clickbounce();
			test.pass("clicked on contact");
			log.info("clicked on contact");
			fp.iframeClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("Move to Contact")
	public void move_to_contact() {
		test = extent.createTest("Contact pass");
	    try {
			
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
