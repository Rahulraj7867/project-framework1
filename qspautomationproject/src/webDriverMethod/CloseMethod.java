package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

WebDriver driver=new ChromeDriver();
Thread.sleep(1000);

driver.get("https://www.flipkart.com");


driver.manage().window().maximize();
Thread.sleep(1000);
driver.close();

	}

	
}
