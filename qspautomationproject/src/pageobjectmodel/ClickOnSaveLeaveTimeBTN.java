package pageobjectmodel;

import java.io.IOException;

public class ClickOnSaveLeaveTimeBTN  extends BaseTest {

	public static void main(String[] args) throws IOException {
		  BaseTest bt = new BaseTest();
		  bt.setUp();
		  LoginPage lp = new LoginPage(driver);
		   Flib flib = new Flib();
		   String username = flib.radDataFromPropertiesFile(Propertypath, "username");
		   String password = flib.radDataFromPropertiesFile(Propertypath, "password");

		  lp.actitimeValidLogin(username, password);
		HomePage hp = new  HomePage(driver);
		hp.clickOnSaveLeaveTime();
		
	}

}
