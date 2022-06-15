package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.cssSelector("input[name*=Usern]")).sendKeys("fghdhhj");
	driver.findElement(By.cssSelector("input[id*=ssword]")).sendKeys("fdhgjh");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	Thread.sleep(2000);
driver.close();


	}

}
