package MouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		//driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"))
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
     Actions act =new Actions(driver);
		act.doubleClick(target).perform();
		

}
}
