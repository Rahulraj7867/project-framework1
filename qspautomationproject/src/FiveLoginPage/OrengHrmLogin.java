package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengHrmLogin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
driver.findElement(By.name("txtUsername")).sendKeys("67587955909");
driver.findElement(By.name("txtPassword")).sendKeys("67587955909");
driver.findElement(By.className("button")).click();
Thread.sleep(2000);
driver.close();
	}

}
