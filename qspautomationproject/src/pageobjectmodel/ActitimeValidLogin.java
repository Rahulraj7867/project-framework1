 package pageobjectmodel;

import java.io.IOException;

public class ActitimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt=new BaseTest();
	bt.setUp();
 Flib flib = new Flib();
String username = flib.radDataFromPropertiesFile(Propertypath, "username");
String password = flib.radDataFromPropertiesFile(Propertypath, "password");

  LoginPage lp = new LoginPage(driver);
  lp.actitimeValidLogin(username, password);
	}
}
