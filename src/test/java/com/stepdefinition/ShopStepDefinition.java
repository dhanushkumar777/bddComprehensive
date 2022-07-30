package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.ShopPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopStepDefinition extends BrowserHelper{
	
	ShopPage mp = new ShopPage(driver);
	//ExtentTest test;
	
	@Given("I have  Shop Product Menu")
	public void i_have_shop_product_menu() {
	    
	}

	@When("I hover on Shop Product")
	public void i_hover_on_shop_product() {
		test = extent.createTest("Hover on Shop ");
		try {
			mp.hover();
			test.pass("Hovering on Shop ");
			log.warn("Hovering on Shop ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("I clicked on pacs")
	public void i_clicked_on_pacs() {
	   test = extent.createTest("Click on Option Machine Care");
	   try {
		mp.find();
		mp.iframe();
		test.pass("Clicked on pacs");
		log.info("Clicked on pacs");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	@Then("I have to check the text")
	public void i_have_to_check_the_text() {
		 test = extent.createTest("Verify  text");
		    try {
				boolean flag = mp.verify();
				if(flag==true) {
					test.pass("Verified Successfully");
					log.info("Verified text succesfully");
				}
				else {
					test.pass("Verification of text Failed");
					log.error("Verification failed");
				}
	
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
