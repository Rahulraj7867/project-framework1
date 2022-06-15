package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulrajput");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rahulrajput113");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy ')]")).submit();


	}

}
