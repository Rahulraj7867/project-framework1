package Assignment;
import org.openqa.selenium.By;
import 
org.openqa.selenium.Keys;
import 
org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewClass
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("https://www.google.com");
WebElement tv=driver.findElement(By.xpath("//input[@name='q']")); 
tv.sendKeys("my name");
Thread.sleep(4000);
tv.sendKeys(Keys.CONTROL+"a");
tv.sendKeys(Keys.DELETE);
}
}
