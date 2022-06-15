package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.className("ico-login")).click();
	Thread.sleep(2000);
driver.findElement(By.cssSelector("input[class*='email']")).sendKeys("fdhgjh");
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("qdqdqwf");
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Books")).click();
    driver.findElement(By.linkText("Pride and Prejudice")).click();
    driver.findElement(By.cssSelector("button[id*='cart']")).click();
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("span[class*='cart-label']")).click();
    driver.findElement(By.cssSelector("div[class=cart-collaterals]")).sendKeys("rAHUL");

//	
//driver.close();


	}

}
