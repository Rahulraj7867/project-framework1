package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramAutomate {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulrr7867");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//button[contains(@class,'sqdOP  ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Search Input']")).sendKeys("prafulkawle");//button[text()='Not Now']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='prafulkawle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		for(int i=1;i<=100;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys(" ae lavdya ",Keys.ENTER);
		}
		



		

	}
}


