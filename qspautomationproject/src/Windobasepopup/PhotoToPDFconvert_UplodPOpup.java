package Windobasepopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhotoToPDFconvert_UplodPOpup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/hi/jpg-to-pdf");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Yes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='r5zwp6-3 jHcIvq'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 hrcxSS']")).click();
		File fil=new File("./Autoit/phototopdf1.exe");
		Thread.sleep(3000);
		String path = fil.getAbsolutePath();
		Runtime.getRuntime().exec(path);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//span[.='Convert']")).click();
		driver.findElement(By.xpath("//div[@class='r5zwp6-0 jGDsIP']")).click();
	}
}
