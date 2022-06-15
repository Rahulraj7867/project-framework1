package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class OrangHRMInvalidLogin extends BaseTestOrangHRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTestOrangHRM bas = new BaseTestOrangHRM();
		bas.openBrowser();
		FlibOfHRM fli = new FlibOfHRM();
		String username = fli.readdatafromexcel(excelpath,"Sheet1", 1, 0);
		String password = fli.readdatafromexcel(excelpath,"Sheet1", 1, 1);
		int rc = fli.rowcount(excelpath,"Sheet1");
for(int i=1;i<=rc;i++)
{
	

		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtPassword")).clear();
}
bas.closeBrowser();
		
	}

}
