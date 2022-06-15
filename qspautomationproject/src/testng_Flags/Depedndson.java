package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depedndson {
	@Test 
	public void login()
	{
		Reporter.log("login",true);

	}
	@Test
	public void home()
	{
		Reporter.log("homepage",true);
	}
	@Test
	public void logout()
	{
		Reporter.log("lgout",true);
	}

}
