package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import qsp.LaunchChromebrowser1;

public class GetAllSelecedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
		driver.manage().window().maximize();
		
			WebElement element = driver.findElement(By.id("menu"));//we select the dropdown
			
		Select sc = new Select(element);//create object for select class 
		//By using for loop we can select multiple options from the dropdown list
		for(int i=0;i<=5;i++)
		{
			sc.selectByIndex(i);
		}
		List<WebElement> options = sc.getAllSelectedOptions();
		
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
			
		}
	}

}
