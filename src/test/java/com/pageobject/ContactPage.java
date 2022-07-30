package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.ContactUI;
import com.uistore.ZBounceBuyUI;
import com.utilities.ScreenshotUtil;

public class ContactPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickbounce() throws Exception {
		help.clickm(ContactUI.click1);
	}
	
	public void iframeClose() throws Exception {
		help.waitm(ContactUI.iframepop);
		help.clickm(ContactUI.iframepop);
	}
	
	
	
	/*public Boolean getText() throws IOException {
		boolean f = false;
		String substr3 = help.getTextm(FooterContactUsUI.footerverify);
		cs.CaptureScreenShot();
		if(substr3.contains(substr3)) {
			Assert.assertTrue(true);
			log.info("Test 6 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		return f;
	}
	*/
	

}
