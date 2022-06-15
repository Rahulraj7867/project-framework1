package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdInLogin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect");
driver.findElement(By.name("email-or-phone")).sendKeys("8999138397");
driver.findElement(By.name("password")).sendKeys("7757920894");
driver.findElement(By.id("join-form-submit")).click();
driver.findElement(By.name("first-name")).sendKeys("rahul");
driver.findElement(By.id("last-name")).sendKeys("rahul");
driver.findElement(By.id("join-form-submit")).click();
Thread.sleep(2000);
driver.findElement(By.id("button")).click();

driver.close();


	}

}
