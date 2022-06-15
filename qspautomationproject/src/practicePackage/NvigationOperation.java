package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NvigationOperation {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  driver.get("https://www.flipkart.com");
  driver.findElement(By.xpath("//button[.='✕']")).click();
  driver.findElement(By.xpath("//div[text()='Electronics']")).click();

  driver.findElement(By.xpath("//span[.='Men']")).click();
  
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();



	}

}
