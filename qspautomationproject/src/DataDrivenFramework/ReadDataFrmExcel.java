package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFrmExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       FileInputStream fis = new FileInputStream("./testData/excel1.xlsx");//provide The path of the excel file
        Workbook wb = WorkbookFactory.create(fis);//mark the file ready for read
          Sheet sh = wb.getSheet("Sheet1");//get into the sheet
          Row row = sh.getRow(1);//get the desire row 
          Cell cell = row.getCell(1);//get the desire cell
         String data = cell.getStringCellValue();//read the data from cell
         System.out.println(data); //print the data from the cell
         
	}

}
