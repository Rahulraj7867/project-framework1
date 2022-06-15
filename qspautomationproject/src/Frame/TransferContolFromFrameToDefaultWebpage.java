package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferContolFromFrameToDefaultWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	WebElement frameelement = driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		driver.switchTo().frame(frameelement);
 driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
 driver.findElement(By.id("name")).sendKeys("rahul");
 driver.findElement(By.id("email")).sendKeys("rajputrahul12797@gmail.com");
 
 
 //transfer control frome frame to default webpage by using defaultcontent()method 
 driver.switchTo().defaultContent();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//span[.='Subscribe Now']")).click();
 
 
	}

}
