package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ITCHotelLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.itchotels.com/in/en/login");
driver.findElement(By.id("loginName")).sendKeys("rahul");
driver.findElement(By.name("loginPwd")).sendKeys("rahul");
 Thread.sleep(2000);
 driver.close();
	}
}
