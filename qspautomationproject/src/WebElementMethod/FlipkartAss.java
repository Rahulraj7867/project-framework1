package WebElementMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAss {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();



WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("//span[text()='Cart']")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Login']")));
driver.findElement(By.xpath("//span[.='Login']")).click();




	}

}
