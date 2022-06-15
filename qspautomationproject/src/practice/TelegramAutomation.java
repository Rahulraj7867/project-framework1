package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramAutomation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver .get("https://web.telegram.org/z/");
Thread.sleep(15000);
driver.findElement(By.xpath("//button[text()='Log in by phone Number']")).click();
Thread.sleep(5000);
driver.switchTo().activeElement().sendKeys("8999138396");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(@class,'ripple') and (@type='button')]")).click();

		
	}

}
