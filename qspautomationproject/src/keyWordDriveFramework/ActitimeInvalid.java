package keyWordDriveFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalid  extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass bas=new	BaseClass();
		bas.openBrowser();
		 Flib fli = new Flib();
		int rc = fli.getRowcount(Excelpath, "invalidcread");
		 for(int i=1;i<=rc;i++)
		 {
			 
		 
		String username1 = fli.readDataFromExcel(Excelpath, "invalidcread", i, 0);
		String password1 = fli.readDataFromExcel(Excelpath, "invalidcread", i, 1);
		 driver.findElement(By.name("username")).sendKeys(username1);
			driver.findElement(By.name("pwd")).sendKeys(password1);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		 } 
		 driver.close();
		 
	}

}
