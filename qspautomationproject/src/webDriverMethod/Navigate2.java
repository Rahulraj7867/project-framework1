package webDriverMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	Navigation nav = driver.navigate();
	nav.back();
	Thread.sleep(1000);
	nav.forward();
	Thread.sleep(1000);
nav.refresh();
driver.close();
}
}
