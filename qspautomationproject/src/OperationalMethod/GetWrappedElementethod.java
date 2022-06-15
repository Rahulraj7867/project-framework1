package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementethod {

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
		//getWrappedElement() this method is used to get all the element from the list without using for loop because the return type of this method is webelement
		//it will wrapped all the element from the list as one element and return it
	WebElement options = sc.getWrappedElement();
	System.out.println(options.getText());
		
	}

}
