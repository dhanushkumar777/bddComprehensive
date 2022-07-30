package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.ZBounceBuyUI;
import com.utilities.ScreenshotUtil;

public class ZBounceBuyPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public ZBounceBuyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickbounce() throws Exception {
		help.clickm(ZBounceBuyUI.bounce);
	}
	
	public void iframeClose() throws Exception {
		help.waitm(ZBounceBuyUI.iframepop);
		help.clickm(ZBounceBuyUI.iframepop);
	}
	
	public void buy() throws Exception {
		help.frame();
		Thread.sleep(3000);
		help.clickm(ZBounceBuyUI.buy);
//		String q = ex.getstringdata("Footer1", 2, 1);
//		help.sendkeysm(FooterContactUsUI.question, q);
//		help.keyboardm(FooterContactUsUI.question);
//		help.clickm(FooterContactUsUI.clickques);
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
