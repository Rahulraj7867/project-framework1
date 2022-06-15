package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/singleselect%20dropdown.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel=new Select(element);
		
		boolean opt = sel.isMultiple();
		System.out.println(opt);
		if(opt==false)
		{
			sel.selectByIndex(3);	
			WebElement option = sel.getFirstSelectedOption();
			System.out.println(option.getText());
		}
		driver.close();
}
}

