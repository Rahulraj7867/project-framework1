package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {//it is use to check wheter the element is displyed on webpage or not

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.selenium.dev");
	WebElement ele = driver.findElement(By.xpath("//imga[@alt='Experitest']"));
	boolean status = ele.isDisplayed();
	System.out.println(status);
	//if the element is found it will give the the result true but if the element is not displayed it give the NoSuchElementException

	}
}


