package testng_Flags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	@BeforeTest
	public void  setPropert()
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
	}
  @Test
  @Parameters("subject")
  public void launchchrome(String sub) {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys(sub);
  }
  @Test
  @Parameters("subject")
  public void firefox(String sub)
  
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys(sub);
	  
  }
}
