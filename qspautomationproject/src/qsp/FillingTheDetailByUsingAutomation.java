package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillingTheDetailByUsingAutomation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://itera-qa.azurewebsites.net");
driver.findElement(By.xpath("/html/body/nav/div/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rahul");
driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8999138396");
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rajputrahul12797@gmail.com");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rahul@123");
driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("At Post Palaskheda tq Soygaon dist Auramngabad (maharashtra) PIN 431118");
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
      WebElement country =driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/select"));//find dropdown by xpath
Select mycountry=new Select(country);//create the object for select class

mycountry.selectByVisibleText("Malta");//find element in dropdown list by there name
driver.navigate().back();

driver .findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();

	}

}
