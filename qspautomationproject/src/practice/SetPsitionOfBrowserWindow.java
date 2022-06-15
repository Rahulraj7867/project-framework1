package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPsitionOfBrowserWindow {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Point po=new Point(200, 200);
	driver.manage().window().setPosition(po);
	//Dimension dia=new Dimension(430,512);
	//driver.manage().window().setSize(dia);
//System.out.println(driver.manage().window().getSize());
	}
	
	}


