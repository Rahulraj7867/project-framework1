package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser specific value");
		String  browservalue=sc.nextLine();
		
		if(browservalue .equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			
			
		}
		else if(browservalue .equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");	
	
		}
		else 
		{
			System.out.println("enter some valid input");
		}
	}

}