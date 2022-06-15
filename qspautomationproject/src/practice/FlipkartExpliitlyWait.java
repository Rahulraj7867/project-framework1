package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartExpliitlyWait {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();

		
	WebElement	element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Login']")));

	element.click();
	
	//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8999137389");
	
	}
}

