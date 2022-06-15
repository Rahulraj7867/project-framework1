package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonUsingXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amezon.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[(@type='text')and (@dir='auto')]")).sendKeys("Xperia 5 III",Keys.ENTER);
driver.findElement(By.xpath("//span[contains(text(),'Xperia 5 III')]")).click();
driver.findElement(By.xpath("//input[contains(@value,'Cart')and  contains(@type,'submit')]")).click();
driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
	}

}
