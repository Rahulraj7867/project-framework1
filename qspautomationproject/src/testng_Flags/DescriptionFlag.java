package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
	@Test(description = "my first test case")
	public void first()
	{
		Reporter.log("first test case ",true);
		
	}
	//by using description flag we give some message in description and aso we print this description in console 
}
