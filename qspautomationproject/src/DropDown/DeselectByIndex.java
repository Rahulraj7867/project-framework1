package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
	WebElement element = driver.findElement(By.name("menu"));
	Select sel=new Select(element);
	sel.selectByVisibleText("khichadi");
	Thread.sleep(2000);
	sel.deselectByVisibleText("khichadi");
	
	
}
}
