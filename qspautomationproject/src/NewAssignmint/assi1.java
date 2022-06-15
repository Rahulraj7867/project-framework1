package NewAssignmint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assi1 {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rajputrahul12797@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("Rahul@123");

}
}
