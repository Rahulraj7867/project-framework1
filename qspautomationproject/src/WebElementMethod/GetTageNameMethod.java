package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTageNameMethod {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
driver.get("https://www.selenium.dev");
WebElement element = driver.findElement(By.xpath("//h4[.='Selenium IDE']//ancestor::div[contains(@class,'card h-100 border-0 bg-transparent')]//descendant::a[contains(@class,'selenium-ide')]"));
      
     System.out.println(element.getTagName());  

	}

}
