package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Flag {
	@Test(priority = 1)
	public void z()
	{
		Reporter.log("z",true);
		
	}
	@Test(priority = -1)
	public void n()
	{
		Reporter.log("n",true);
		
	}
	@Test(priority = 4)
	public void v()
	{
		Reporter.log("v",true);
		
	}
	@Test(priority = 6)
	public void a()
	{
		Reporter.log("a",true);
		
	}
	@Test(priority =-3)
	public void b()
	{
		Reporter.log("b",true);
		
	}
	@Test(priority = 0)
	public void r()
	{
		Reporter.log("r",true);
		
	}

}
