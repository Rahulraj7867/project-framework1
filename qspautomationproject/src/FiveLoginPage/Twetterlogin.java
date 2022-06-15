package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twetterlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://twitter.com/i/flow/login");
Thread.sleep(7000);
driver.findElement(By.xpath("//input[@name='text']")).sendKeys("7758098892");
driver.findElement(By.id("pass")).sendKeys("7387509jk3");


//driver.findElement(By.linkText("ganesh poul")).click();
 Thread.sleep(2000);
 driver.close();

	}

}
