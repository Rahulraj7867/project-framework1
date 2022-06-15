package XpathUsingAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Descendant {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.flipkart.com");
driver.findElement(By.xpath("//button[.='✕']")).click();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphon 13");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);
String text = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
System.out.println(text);
	}

}
