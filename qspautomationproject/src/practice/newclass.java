package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/singleselect%20dropdown.html");
		WebElement ele = driver.findElement(By.id("menu"));
		Select sc=new Select(ele);
	
			

		
		WebElement webElement = sc.getWrappedElement(); 
		System.out.print(webElement.getText());
		
		
	}

}
