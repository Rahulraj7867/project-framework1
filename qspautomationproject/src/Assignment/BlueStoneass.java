package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(5000);//div[@class='lc-1x7wur2 e1dmt1bi0']
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	
		driver.switchTo().frame("chat-widget");
 driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
 driver.findElement(By.id("name")).sendKeys("rahul");
 driver.findElement(By.id("email")).sendKeys("rajputrahul12797@gmail.com");
 //Thread.sleep(3000);
 driver.switchTo().frame("chat-widget");
driver.findElement(By.name("rad7xdqbpo_146917605549304831")).sendKeys("8999123896");
 driver.findElement(By.xpath("//button[@type='submit' and @class='lc-ncwcmf esv0owm2']")).submit();



 
		
 

		}

}
