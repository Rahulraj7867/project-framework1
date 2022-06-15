package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import qsp.LaunchChromebrowser1;

public class IsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("menu"));
		Select sc = new Select(element);
		boolean ret = sc.isMultiple();
		System.out.println(ret);
		if(ret==true)
		{
			System.out.println("it is multiselect dropdown:");
		}
		driver.close();
	}

}
