package com.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.ShopUI;
import com.utilities.ScreenshotUtil;

public class ShopPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void hover() throws Exception {
		help.actionHover(ShopUI.hover11);
	}
	
	public void find() throws Exception {
		help.clickm(ShopUI.op);
		Thread.sleep(0);
	}
	
	public void iframe() throws Exception {
		help.waitm(ShopUI.iframe);
		help.clickm(ShopUI.iframe);
	}
	
	public boolean verify() throws Exception {
		boolean flag = false;
		String fromurl = help.getTextm(ShopUI.text11);
		String text = ex.getstringdata("OptionMenu", 2, 1);
		if(fromurl.contains(text))
		{
			Assert.assertTrue(fromurl.contains(text));
			flag=true;
		}
		cs.CaptureScreenShot();
		return flag;
	}
}
