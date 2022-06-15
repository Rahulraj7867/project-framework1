package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoOpencartautomate {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	//driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.linkText("Tablets")).click();
	driver.findElement(By.linkText("Laptops & Notebooks (5)")).click();
 driver.findElement(By.linkText("HP LP3065")).click();
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	driver.findElement(By.linkText("Shopping Cart")).click();
	driver.findElement(By.linkText("Checkout")).click();
}
}