package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	// select multiple option in multiselect dropdown

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.tagName("option"));//by using this tag we find all the element of dropdown list

		System.out.println(element.size());//we find the size of number of eleemnt in the dropdownlist

		WebElement elem = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(elem);
		sel.deselectByIndex(2);
		for (int i = 0; i <= element.size()-1; i++) 
		{
			sel.selectByIndex(i);

		}
		
		List<WebElement> options = sel.getAllSelectedOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement opt = options.get(i);

			System.out.println(opt.getText());
		}

	}
}
