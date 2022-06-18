
package testpackage;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import pagepackage.LoginPage;

@Listeners(CustomeListener.class)
public class TestActiTimeInvalidLogin extends BaseTest {

	@Test
	public void actitimeinvalidLogin() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCount(excelpath, invalidsheet);
		for (int i = 1; i <= rc; i++) {
			String username = flib.readDataFromExcel(excelpath, invalidsheet, i, 0);
			String invalidpassword = flib.readDataFromExcel(excelpath, invalidsheet, i, 1);
			
Reporter.log(username,true);
Reporter.log(invalidpassword,true);
 
			lp.actitimeInvalidLogin(username, invalidpassword);
			
			
			
			WebElement erroe = lp.getErrormsg();
			boolean statuse = erroe.isDisplayed();
			
			
			
			
			
			Assert.assertEquals(statuse, true);
		}
	}

}

