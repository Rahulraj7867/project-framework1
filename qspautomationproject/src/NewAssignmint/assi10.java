package NewAssignmint;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assi10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		driver.switchTo().frame("chat-widget");
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.id("name")).sendKeys("vishal");
		driver.findElement(By.id("email")).sendKeys("rajputrahul12797@gmail.com");
		
		driver.switchTo().frame(1);
	 driver.findElement(By.xpath("//form[@name='form_146917605549304631']/descendant::input[@id='df0pknyj5iv_146917605549304831']")).sendKeys("7758098262");

		//driver.findElement(By.xpath("//input[@id='oyj7t94jrsq_146917605549304831']")).sendKeys("7758098262");


		

}
}