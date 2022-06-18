package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	
	@Test()
	public void Logout() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		 HomePage hp = new HomePage(driver);
		 
		 Flib flib = new Flib();
			String username = flib.readDataFromPropertyFile(propertypath, "username");
			String password = flib.readDataFromPropertyFile(propertypath, "password");
	        lp.actitimeValidLogin(username, password);
		 hp.clickLogOut();
		 
	}

}
