package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofNanos(20));
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();

		
	WebElement	element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Login']")));
	

	element.click();
	
	}


		
	}


