package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=100)
	public void test2()
	{
		Reporter.log("invocation count1",true);
	}

}
