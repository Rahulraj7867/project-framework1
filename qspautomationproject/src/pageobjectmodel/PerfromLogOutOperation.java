package pageobjectmodel;

import java.io.IOException;

public class PerfromLogOutOperation  extends BaseTest {

	public static void main(String[] args) throws IOException {
		 BaseTest bt=  new BaseTest();
		 bt.setUp();
		  LoginPage lp = new LoginPage(driver);
		   Flib flib = new Flib();
		   String username = flib.radDataFromPropertiesFile(Propertypath, "username");
		   String password = flib.radDataFromPropertiesFile(Propertypath, "password");

		  lp.actitimeValidLogin(username, password);
		HomePage hp = new  HomePage(driver);
		hp.clickLogOut();
		 

	}
	//here we achive the abstraction by using only generic reusable method we dont no internal implimentation we only see the  result 
//here also we achive the inheritance by extend the parent class property of BaseTest class
	//we acsses the driver refrance variable of BaseTest
}
