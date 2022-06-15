package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartUsingXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();

	}

}
