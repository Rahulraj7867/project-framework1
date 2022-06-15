package testng_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParrelalMethodExecution {
  @Test
  public void f() {
long id = Thread.currentThread().getId();
Reporter.log(id+"",true);
	  Reporter.log("firsttest case",true);
	  
  }
  @Test
  public void f1() {
long id = Thread.currentThread().getId();
Reporter.log(id+"",true);
	  Reporter.log("firsttest case",true);
	  
  }
}
