package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("7758098262");
driver.findElement(By.id("pass")).sendKeys("7387509753");
driver.findElement(By.tagName("button")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();
Thread.sleep(5000);
	driver.findElement(By.xpath("//span[.='Ganesh Poul']")).click();
	Thread.sleep(5000);
	
	//driver.switchTo().activeElement().sendKeys("hi",Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Ganesh Poul' and contains(@class,'0qnabr5')]")).click();
	//driver.quit();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Open in Messenger']")).click();
	Thread.sleep(5000);
	for(int i=1;i<=100;i++)
	{
		Thread.sleep(1000);	
	driver.switchTo().activeElement().sendKeys("ghe lavdya ganya",Keys.ENTER);
	}
//driver.findElement(By.xpath("//div[@class='j83agx80 lhclo0ds bkfpd7mw']")).sendKeys("ede");
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"mount_0_0_7f\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input"));
}
}
