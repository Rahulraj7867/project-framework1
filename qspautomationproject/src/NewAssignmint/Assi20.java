package NewAssignmint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Actions act=new Actions(driver);
		WebElement all = driver.findElement(By.xpath("//a[.='Coins ']"));
		act.moveToElement(all).perform();
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();
		WebElement weight = driver.findElement(By.xpath("//h1[.='10 gram 24 KT Lakshmi Gold Coin']"));
		String coin = weight.getText();
		if(coin.equalsIgnoreCase("10 gram 24 KT Lakshmi Gold Coin"))
			
		{
			System.out.println("it will show correct result :"+coin);
		}
		else
		{
			System.out.println("it will show wrong result :"+coin);	
		}
		System.out.println(coin);
		driver.quit();
	}

}
