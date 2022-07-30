package com.stepdefinition;

import java.io.IOException;

import com.pageobject.NewPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewStepDefinition extends BrowserHelper{
	
	NewPage sp = new NewPage(driver);
	
	@Given("I have New")
	public void i_have_new() {
	    
	}

	@When("I move to New")
	public void i_move_to_new() {
		test = extent.createTest("Move to New");
		try {
			sp.clickMenu();
			test.pass("Scrolled for new");
			log.info("Scrolled for new");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("I click on Learn More")
	public void i_click_on_learn_more() {
		test = extent.createTest("Click on Learn More");
		try {
			sp.clickbutton();
			test.pass("Clicked on Learn More");
			log.info("Click on Learn More");
			sp.closeiframe();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	/*@Then("I verify the text")
	public void i_verify_the_text() {
		test = extent.createTest("Verify Text");
		try {
			Boolean flag = sp.getText();
			if(flag==true) {
				test.pass("Verification of the text Successfully");
				log.info("Verified text");
			}
			else {
				test.pass("Verification of the text Failed");
				log.error("Verification failed");
			}
			sp.closeiframe();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
