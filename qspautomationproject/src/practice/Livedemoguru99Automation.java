package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Livedemoguru99Automation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://live.demoguru99.com/");
	 List<WebElement> webelement = driver.findElements(By.xpath("//li[@class='dropdown']"));

	for(WebElement web:webelement)
	{
		System.out.println(web.getText());
	}
	}

}
