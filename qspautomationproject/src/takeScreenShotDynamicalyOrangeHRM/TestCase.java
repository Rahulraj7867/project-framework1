package takeScreenShotDynamicalyOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListner.class)
public class TestCase  extends BAseTest{
	@BeforeMethod
	public void SetUp()
	{
		initilization();
		
	}
	@Test
	public void valid ()
	{
		SoftAssert soft = new SoftAssert();
		String actualTitle = driver.getTitle();
		soft.assertEquals(actualTitle, "OrangeHRM", "title mismatch");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	

	
		WebElement dash = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statuse = dash.isDisplayed();
		Assert.assertEquals(statuse, false);
	}
	@Test
	public void testcase1()
	{
		Assert.fail();
	}
	@Test
	public void testcase12()
	{
		Assert.fail();
	}
	@Test
	public void testcase3()
	{
		Assert.fail();
	}
	@Test
	public void testcase4()
	{
		Assert.fail();
	}
	@Test
	public void testcase5()
	{
		Assert.fail();
	}
	@AfterMethod
public void teraDown()
{
	driver.quit();
}
}
