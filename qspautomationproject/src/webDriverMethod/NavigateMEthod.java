package webDriverMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMEthod {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.com");
driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);

Thread.sleep(2000);
driver.navigate().refresh();
driver.close();



}
}
