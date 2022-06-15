package testng_Flags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	WebDriver driver;
	@Test
	@Parameters({"browser","username","password","url"})
	public void loginActitime(String browservalue,String user,String pass ,String url)
	{  
		
	
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		 
		
		}
	
		else if(browservalue.equalsIgnoreCase("firfox"))
		{
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
		}
	

}
	
	
}
