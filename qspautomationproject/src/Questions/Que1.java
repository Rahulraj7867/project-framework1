package Questions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	//how to close all the browser without using quit method
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung F12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		Set<String> allhandle = driver.getWindowHandles();
		for(String wh: allhandle)
		{
		
			driver.switchTo().window(wh).close();
		}
        
}
	}

