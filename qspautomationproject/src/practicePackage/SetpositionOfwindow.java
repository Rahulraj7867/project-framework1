package practicePackage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetpositionOfwindow {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Point targetpoint=new Point(340, 260);
		 driver.manage().window().setPosition(targetpoint);
		 
		 
}
}

