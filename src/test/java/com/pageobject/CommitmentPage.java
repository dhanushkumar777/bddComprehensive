package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.CommitmentUI;
import com.utilities.ScreenshotUtil;

public class CommitmentPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public CommitmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void hovering() throws Exception{
		help.actionHover(CommitmentUI.hover);
	}
	
	public void clickOption() throws Exception{
		help.clickm(CommitmentUI.option);
		help.clickm(CommitmentUI.learnmore);
	}
	
	public Boolean verifyText() throws Exception{
		String urltext = help.getTextm(CommitmentUI.text);
		cs.CaptureScreenShot();
		boolean flag = false;
		String str = ex.getstringdata("OptionMenu", 6, 1);
		if(urltext.contains(str))
		{
			flag = true;
			Assert.assertTrue(urltext.contains(str));
		}
		
		return flag;
	}
	
	public void iframeClose() throws Exception {
		help.waitm(CommitmentUI.iframepop);
		help.clickm(CommitmentUI.iframepop);
	}
}
