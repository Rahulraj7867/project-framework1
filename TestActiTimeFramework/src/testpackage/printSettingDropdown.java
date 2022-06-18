package testpackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingPage;
@Listeners(CustomeListener.class)
public class printSettingDropdown extends BaseTest {
	
	@Test()
	public void vdropdown() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		 Flib flib = new Flib();
			String username = flib.readDataFromPropertyFile(propertypath, "username");
			String password = flib.readDataFromPropertyFile(propertypath, "password");
	        lp.actitimeValidLogin(username, password);
		
		SettingPage drop = new SettingPage(driver);
		drop.clickonsettting();

		WebDriverCommonLib web = new WebDriverCommonLib();
		web.getAllOptionsOfDropdown(drop.getTopgrouplevel());
		web.getAllOptionsOfDropdown(drop.getMiddlegrouplevel());
		web.getAllOptionsOfDropdown(drop.getTimeentrylevel());

	}

}
