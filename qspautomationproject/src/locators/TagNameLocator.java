package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/loginpage%20.html");
	
	driver.findElement(By.tagName("input")).sendKeys("rajputrahul");
	//here we use tagname locator but if webpage morethan one tag of same name we cant able to use tgname locator if we try to use he will give 
	}//prefrence to by default first element

}
