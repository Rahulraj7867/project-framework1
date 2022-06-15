package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement elem = driver.findElement(By.xpath("//button[.='✕']"));
		Thread.sleep(3000);
		elem.click();
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("999138396");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul");
		
		


	}

}
