package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readexcel {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
          FileInputStream fis = new FileInputStream("./excelfile/first2.xlsx");
                    Workbook wb = WorkbookFactory.create(fis);
                   Sheet sh= wb.getSheet("sheet1");
                   
                   for(int i=0;i<=4;i++)
                   {
         Row row = sh .getRow(i);
                   
       
		Cell cell = row.getCell(i);
                   String data = cell.getStringCellValue();
                   System.out.println(data);
                   
                   }
                   
}
}
