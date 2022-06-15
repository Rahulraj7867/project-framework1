package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
	  Reporter.log("method1",true);
  }
  @Test(description = "first teat case")
  public void method2() 
  {
	  Reporter.log("method2",true);
  }
  @Test
  public void method3() 
  {
	 int a=0;
	 int result =5/a;
	 Reporter.log("result",true);
  }
  @Test
  public void method4() 
  {
	  Reporter.log("method4",true);
  }
  @Test
  public void method5() 
  {
	  Reporter.log("method5",true);
  }
}
