package practicePackage;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDropdownValuWithSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 WebElement drop = driver.findElement(By.tagName("select"));
		 Select scl= new Select(drop);
		 TreeSet has=new TreeSet();
		List<WebElement> options = scl.getOptions();
		for(WebElement we: options)
		{
			
			String text = we.getText();
			has.add(text);
		}
		for(Object name:has)
		{
			System.out.println(name);
		}

	}

}
