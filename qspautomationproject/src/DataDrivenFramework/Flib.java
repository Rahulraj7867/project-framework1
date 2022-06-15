package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String testData(String filepath,String Sheetname,int rowv,int cellv ) throws EncryptedDocumentException, IOException
	{
	 FileInputStream fis = new FileInputStream( filepath );//provide The path of the excel file
     Workbook wb = WorkbookFactory.create(fis);//mark the file ready for read
       Sheet sh = wb.getSheet(Sheetname);//get into the sheet
       Row row = sh.getRow(rowv);
       Cell cell = row.getCell(cellv);
      String Username = cell.getStringCellValue();
     
      System.out.println(Username);
      
      
	return Username;
	
	
	}
	public int getCellcount(String filepath,String Sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream( filepath );
	     Workbook wb = WorkbookFactory.create(fis);
	       Sheet sh = wb.getSheet(Sheetname);
		int num = sh.getLastRowNum();
		return num;
	}
	
	public void writeDataInexcel(String filepath,String sheetname,int rowcount,int cellcount,String status) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowcount);
	Cell cell = row.createCell(cellcount);
	cell.setCellValue(status);
	FileOutputStream fos = new FileOutputStream (filepath);
	wb.write(fos);
	      
	}
	
	
}
