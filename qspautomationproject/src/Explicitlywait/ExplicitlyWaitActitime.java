package WebElementMethod;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitActitime {
	private static final Duration TimeUnit = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=eejeg4bpkeitp");
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement web = driver.findElement(By.name("usersSelector.selectedUser"));
		Select sc=new Select(web);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		List<WebElement> options = sc.getOptions();
		for(WebElement name:options)
		{
			System.out.println(name.getText());
		}
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Insert existing tasks']")));
		driver.findElement(By.id("SubmitTTButton")).click();
		driver.quit();
		
		
		
		
	}

}
