package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.ConnectUI;
import com.uistore.ShopUI;
import com.uistore.SlidesUI;
import com.utilities.ScreenshotUtil;

public class SlidesPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public SlidesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clicklink() throws Exception {
		help.clickm(SlidesUI.click);
		cs.CaptureScreenShot();
	}
	
	/*public boolean getURL() throws Exception {
		boolean flag = false;
		String url = help.getUrl();
		String txt = ex.getstringdata("Facebook", 2, 1);
		if(url.equals(txt))
		{
			flag = true;
			Assert.assertEquals(url, txt);
			
		}
		return flag;
	}*/

}
