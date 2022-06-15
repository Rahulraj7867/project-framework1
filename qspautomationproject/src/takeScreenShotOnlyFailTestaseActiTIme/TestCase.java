package takeScreenShotOnlyFailTestaseActiTIme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import takeScreenShotDynamicalyOrangeHRM.CustomeListner;
@Listeners(CustomListnerActitime.class)
public class TestCase extends  BaseTest {
	SoftAssert sa=new SoftAssert();
	@BeforeTest
	public void SetUp()
	{
		initialization();
	}
	@Test
	public void actitime1valid () throws InterruptedException
	{
		
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	}
	      @Test(dependsOnMethods="actitime1valid",priority =1)
	      
		public void afterlogin()
		{
		String actualtitle = driver.getTitle();
		Reporter.log(actualtitle,true);
		 String ExpectedTitle="actiTIME - Enter Time-Trackk";
		.assertEquals(actualtitle, ExpectedTitle,"containt mismatch");
		
		
		}
	      @Test(priority =2,enabled=true)
	      public void mytest()
	      
	      {
	    	  driver.findElement(By.xpath("//div[text()='Tasks']/following-sibling::img[@src='/img/default/pixel.gif?hash=1692528820']")).click();
	    	  WebElement creattask = driver.findElement(By.xpath("//input[@value='Create New Tasks']"));
	    	  boolean status = creattask.isDisplayed();
	    	  Assert.assertEquals(status, true);
	    	  WebElement cancel = driver.findElement(By.xpath("//input[@value='Apply Filter']"));
	    	  boolean status1 = cancel.isDisplayed();
	    	  sa.assertEquals(status1, true);
	    	  sa.assertAll();
	      }
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
