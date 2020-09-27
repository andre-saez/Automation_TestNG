package datadriven;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkBook;

public class ExcelRead {

	public static void main(String[] args) {

		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		
		// Location of the excel file
		String path = "E://Users//DesktopW7//Documents//Excel_Read.xlsx";
		String sheetName = "Sheet1";

		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			
			Cell = ExcelWSheet.getRow(0).getCell(0);
			String cellData = Cell.getStringCellValue(0);
			System.out.println("Cell Data: " + cellData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}