package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag_Enabled {
	@Test(enabled = false)//if we give enableld flag =false theen this method is desabled this metod does not exicute
	public void test()
	{
		Reporter.log("wwfeeffef",true);
		
	}
	@Test
	public void test1()
	{
		Reporter.log("stribng", false);
	}

}
