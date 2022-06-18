package testpackage;

import java.io.IOException;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLgin extends BaseTest {
	@Test
	public void actitimevalidLogin() throws IOException, InterruptedException
	{
		
		
		 LoginPage lp = new LoginPage(driver);
		 Flib flib = new Flib();
		String username = flib.readDataFromPropertyFile(propertypath, "username");
		String password = flib.readDataFromPropertyFile(propertypath, "password");
        lp.actitimeValidLogin(username, password);
			
	}
	

}
