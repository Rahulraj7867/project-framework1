package Syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimePageTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-4pmjebg/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//login in actitime
		String pagetitle = driver.getTitle();

		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	
		if(pagetitle.equals("actiTIME - Login"))
      {
	 System.out.println("test case is pass both title are equals");
      }
      else 
      {
    	  System.out.println("test care is fail page title is not same as expected title");
      }
     String homepageTITLE = driver.getTitle();
     if(homepageTITLE.equals("actiTIME - Enter Time-Track"))
     {
    	 System.out.println("test case is pass");
    	 
     }
     else 
     {
   	  System.out.println("test care is fail page title is not same as expected title");
 
     }
     }
	
}
