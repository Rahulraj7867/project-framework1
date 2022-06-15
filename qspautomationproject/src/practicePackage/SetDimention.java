package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDimention {

	
		// TODO Auto-generated method stub

		public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
	  driver.findElement(By.xpath("//button[.='✕']")).click();
	  driver.findElement(By.xpath("//div[text()='Electronics']")).click();
	 Dimension target = new Dimension(450, 660);
	  driver.manage().window().setSize(target);
	  


	}

}
