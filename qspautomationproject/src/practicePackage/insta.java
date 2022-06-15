package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement use = driver.findElement(By.name("username"));
		use.sendKeys("raghu");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("fgaggg");
		Thread.sleep(2000);
		use.clear();
		Thread.sleep(1000);
		

		
	}

}
