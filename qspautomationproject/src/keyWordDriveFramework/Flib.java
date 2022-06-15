package keyWordDriveFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//read data from Excel
	public String readDataFromExcel(String filepath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{	
	FileInputStream	fis =new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowcount);
	Cell cell = row.getCell(cellcount);
	String data = cell.getStringCellValue();
	return data;
	
	}
	//get row count
	public int getRowcount(String filepath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream	fis =new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet .getLastRowNum();
		return rc;
		
		
	}
	//Write data in Excel Sheet
	public void writeDatainExcel(String filepath,String sheetname,int rowcount,int cellcount,String vlaue) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream	fis =new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		 Cell cell = row.createCell(cellcount);
		 cell.setCellValue(vlaue);
		 FileOutputStream fos = new FileOutputStream(filepath);
			wb.write(fos);
		
		 
	}
	//read propery file
	public String readPropertyFile( String filepath,String key) throws IOException
	{
		FileInputStream	fis =new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fis);
		String vlaue = prop.getProperty(key);
		return vlaue;
	}

		
	

}
