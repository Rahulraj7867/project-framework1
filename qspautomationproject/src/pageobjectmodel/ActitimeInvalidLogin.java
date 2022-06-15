package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		 Flib flib = new Flib();
		 int rc = flib.rowcount(Excelpath, Sheetname);
		 for(int i=1;i<=rc;i++)
		 {
		String username = flib.readdatafromexcel(Excelpath, Sheetname, i, 0);
		String password = flib.readdatafromexcel(Excelpath,Sheetname, i, 1);
		LoginPage lp = new LoginPage(driver);
		lp.actitimeInvalidLogin(username, password);
		flib.writeDatainExcel(Excelpath, Sheetname, i, 2, "pass");
		
		
		 }
	}

}

