package WindowHandal;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHanadl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	String parent = driver.getWindowHandle();
	System.out.println(parent);
		driver.findElement(By.xpath("//div[.='POCO C31 (Royal Blue, 64 GB)']")).click();
		Set<String> child = driver.getWindowHandles();
	
		for( String ch:child)
		{
			System.out.println(ch);
		
		if(!ch.equals(parent))
		{
			driver.switchTo().window(ch);
			driver.findElement(By.xpath("//a[.='32 GB']")).click();
			driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			driver.findElement(By.xpath("//button[.='CONTINUE']")).click();
		}
		}
		
}
}
