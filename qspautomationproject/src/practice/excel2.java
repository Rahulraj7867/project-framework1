package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel2 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./excelfile/newfile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");

		for (int i = 0; i <= 6; i++) {
			Row row = sh.getRow(i);
			for (int n = 0; n <= 1; n++)
			{
			Cell cell = row.getCell(n);

			System.out.println(cell.getStringCellValue());
			}
		}
	}
}
