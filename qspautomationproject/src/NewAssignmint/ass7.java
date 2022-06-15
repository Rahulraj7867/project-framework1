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
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ass7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Actions ac=new Actions(driver);
		 WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));

		ac.moveToElement(target).perform();
		String parenttab = driver.getWindowHandle();
		System.out.println(parenttab);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		  Set<String> set = driver.getWindowHandles();
		  for(String s:set)
		  {
			 
			  System.out.println(s);
		  
		  if(!s.equals(parenttab))
		  {
			  driver.switchTo().window(s);
			
			  driver.findElement(By.id("buy-now")).click();
			  Thread.sleep(2000);
			  TakesScreenshot screen=(TakesScreenshot)driver;
			  File sorce = screen.getScreenshotAs(OutputType.FILE);
			  File fe=new File("./screenshots/blutone.png");
			  Files.copy(sorce, fe);
			  System.out.println("error message Screenshots capctured");
		  }
		  }
		  driver.close();
	}
		
	
		
}


