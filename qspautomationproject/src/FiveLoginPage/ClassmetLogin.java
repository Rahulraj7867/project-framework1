package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassmetLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver .get("https://secure.classmates.com/auth/login");
		driver.findElement(By.id("loginEmail")).sendKeys("rahulrajput1234");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot?")).click();
		driver.findElement(By.name("firstName")).sendKeys("rahul");
		driver.findElement(By.id("lastName")).sendKeys("rahul");
		driver.findElement(By.id("email")).sendKeys("asfgag");
		driver.findElement(By.className("btn btn-confirm btn-block btn-lg")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
