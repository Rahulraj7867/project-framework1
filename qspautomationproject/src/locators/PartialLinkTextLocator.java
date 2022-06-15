package locators;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("inter the browser name");
	String name=sc.nextLine();
	if (name.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	else if (name.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Images")).click();
		
	}
	}
}


