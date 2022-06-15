package Windobasepopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeWindowBasePopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-4pmjebg/login.do");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//login in actitime
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Actions act = new Actions(driver);
		WebElement uplod = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		act.doubleClick(uplod).perform();
	 File fil = new File("./Autoit/up3.exe");
 String path = fil.getAbsolutePath();
	Thread.sleep(4000);
	
	Runtime.getRuntime().exec(path);
	Thread.sleep(3000);

	Runtime.getRuntime().exec(path);

	

		
	}
}
