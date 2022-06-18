package generic;

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

	// generic reusebal method for read data frome Excel sheet
	public String readDataFromExcel(String excelpath, String sheetname, int rownum, int colnum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(colnum);
		String data = cell.getStringCellValue();
		return data;
	}
	
	

	// generic reuseble method for getLastRowCount
	public int getRowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet sheet = wb.getSheet(sheetname);

		int rc = sheet.getLastRowNum();
		return rc;
	}

	
	
	//generic reuseblemethod for readdata from property file
	public String readDataFromPropertyFile(String propertypath, String key) throws IOException {

		FileInputStream fis = new FileInputStream(propertypath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	
	
	//generic reuseble method for write data in excel sheet
	public void writeDataInExcel(String excelpath, String sheetname, int rownum, int cellnum, String value)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);

	}
	

}
