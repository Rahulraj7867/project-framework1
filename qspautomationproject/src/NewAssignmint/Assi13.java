package NewAssignmint;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi13 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement offer = driver.findElement(By.xpath("//span[.='Offers ']"));
	offer.click();
	Actions act=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//span[.='Offers']/following-sibling::i[@class='icon-ion-chevron-down']"));
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//span[@data-displayname='30% Making Charge Off']")).click();
	 WebElement offervalidation = driver.findElement(By.xpath("(//span[@class='offers-wrapper'])"));
	 
	String valid = offervalidation.getText();
	   
		 System.out.println(valid);
	 
		 
		if(valid.equals("30% OFF ON MAKING CHARGE"))
		 {
			 System.out.println("it will display correct result");
		 }
		 else
		 {
			 System.out.println("it will display wrong result"); 
		 }
		 
	 

driver.quit();
		
	
}
}
