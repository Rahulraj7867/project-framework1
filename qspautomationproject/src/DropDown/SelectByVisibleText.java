package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/singleselect%20dropdown.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel=new Select(element);
		sel.selectByVisibleText("shira");
		//if we tried to deselect  option which is selected in single select dropdown we get an Exception call:java.lang.UnsupportedOperationException
		//because we cannot deselect option in single select dropdown
		sel.deselectByVisibleText("shira");
}
}

