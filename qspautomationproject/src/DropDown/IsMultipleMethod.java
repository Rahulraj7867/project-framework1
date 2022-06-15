package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=product/category&path=25_28&sort=rating&order=ASC");
	WebElement element = driver.findElement(By.id("input-sort"));
	
	Select sel=new Select(element);
	
	  boolean ret = sel.isMultiple();
	  System.out.println(ret);
	  if (ret==false)
	  {
		  sel.selectByIndex(4);
		 WebElement selectedop = sel.getFirstSelectedOption();
		 System.out.println(selectedop.getText());
	  }
	 
}
}
