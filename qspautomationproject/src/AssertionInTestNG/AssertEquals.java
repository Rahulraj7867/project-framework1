package AssertionInTestNG;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;



public class AssertEquals
{
	SoftAssert  ass =new  SoftAssert();
	WebDriver driver;
	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	@BeforeMethod
	public void ActitimeLogin() throws InterruptedException
	{
		
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=19s463ei4xjgy");
	}
	@Test
	public void valid() throws InterruptedException, IOException 
	{
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String actualtitle = driver.getTitle();
		Reporter.log(actualtitle,true);
		 String ExpectedTitle="actiTIME - Enter Time-Track";
		ass.assertEquals(actualtitle, ExpectedTitle,"containt mismatch");
		
		Thread.sleep(2000);
		
		try {
			
			driver.findElement(By.xpath("//div[.='Users']")).click();
		} 
		catch (Exception e)
		{
			TakesScreenshot take = (TakesScreenshot)driver;
			File source = take.getScreenshotAs(OutputType.FILE);
			File fil =new File("./screenshots/failtest.png");
			Files.copy(source, fil);
		}
	}
	@Test
	public void invalid()
	{
		driver.findElement(By.name("username")).sendKeys("adq");
		driver.findElement(By.name("pwd")).sendKeys("managerw");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("invalid run");
	}
	
	@AfterMethod
	public void test()
	{
	
	driver.quit();
	   ass.assertAll();
	}
	


	}


