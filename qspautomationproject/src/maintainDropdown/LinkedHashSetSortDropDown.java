package maintainDropdown;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetSortDropDown {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
			driver.manage().window().maximize();
			
				WebElement element = driver.findElement(By.id("menu"));
				Select scl =new Select(element);
				LinkedHashSet<String> option=new LinkedHashSet<String>();//linkedhashset is use to eliminete duplicate element and maintain insertion order
				List<WebElement> options = scl.getOptions();
				
				
				for(WebElement we:options)
				{
					String ele = we.getText();
					option.add(ele);
					
				}
				for (String ele1:option)
				{
					System.out.println(ele1);
				}
				
	}

}
