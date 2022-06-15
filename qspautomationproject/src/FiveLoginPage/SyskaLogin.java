package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyskaLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://syska.co.in/customer/account/login/referer/aHR0cHM6Ly9zeXNrYS5jby5pbi9jdXN0b21lci9hY2NvdW50L2ZvcmdvdHBhc3N3b3JkLw%2C%2C/");
		driver.findElement(By.name("login[username]")).sendKeys("rahul");
		driver.findElement(By.id("pass")).sendKeys("fwqff");
		Thread.sleep(2000);
        driver.findElement(By.className("link")).click();
        driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
driver.close();

	}
}
