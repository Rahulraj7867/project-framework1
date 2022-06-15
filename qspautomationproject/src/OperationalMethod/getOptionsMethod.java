package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import qsp.LaunchChromebrowser1;

public class getOptionsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("menu"));
		Select sc = new Select(element);
		List<WebElement> options = sc.getOptions();
		for(WebElement web:options) {
			System.out.println(web.getText());
		}
		driver.quit();
	}

}
