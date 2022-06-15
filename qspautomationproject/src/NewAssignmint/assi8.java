package NewAssignmint;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class assi8 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
			
			
			Thread.sleep(2000);
			//perform mouse hover action on all jewellery
			driver.findElement(By.xpath("//span[.='Not now']")).click();
			Actions ac=new Actions(driver);
			 WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
			 ac.moveToElement(target).perform();
			 
			 //get window handal of parent window and print it
			String parenttab = driver.getWindowHandle();
			System.out.println(parenttab);
			
			driver.findElement(By.xpath("//span[.='Kadas']")).click();
			driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
			
			//new tab is open and get window hanadls of both parent and child tab
			  Set<String> set = driver.getWindowHandles();
			  for(String s:set)
			  {
				 
				  System.out.println(s);
			  //contorl switch to child tab
			  if(!s.equals(parenttab))
			  {
				  driver.switchTo().window(s);
			driver.findElement(By.name("chainselect")).click();
			WebElement size = driver.findElement(By.xpath("//li[@data-key='04']"));
			 System.out.println(size.getText());
		size.click();
		
		  driver.findElement(By.xpath("//input[@id='buy-now']")).click(); 
		
		
		  WebElement  selectedsize = driver.findElement(By.xpath("//div[@onclick='toggleRingSizes(this)']"));
		 System.out.println(selectedsize.getText());
		 //take screenshts of size webpage
		 TakesScreenshot screen=(TakesScreenshot)driver;
		  File sorce = screen.getScreenshotAs(OutputType.FILE);
		  File fe=new File("./screenshots/blutone size.png");
		  Files.copy(sorce, fe);
		  driver.quit();
		 
			  }
		 
	}
		}


}
