package ActionsClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement sourse = driver.findElement(By.xpath("//a[contains(.,'BANK')]"));
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']"));

		
		Actions act =new Actions(driver);
		act.dragAndDrop(sourse, target).perform();

	}

}
