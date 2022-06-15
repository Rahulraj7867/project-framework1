package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Libraryfile {
	public String swaglab(String filepath,String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data = cell.getStringCellValue();
		System.out.println(data);
		return data;
	}
	public int rowCount(String filepath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int last = sheet.getLastRowNum();
		return last;
		
	}
	public void writeresult(String filepath,String sheetname ,int rownum,int cellnum,String  status) throws EncryptedDocumentException, IOException
			
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(status);
		 FileOutputStream fos=new FileOutputStream(filepath);
		 wb.write(fos);
		
		
	}
	

}
