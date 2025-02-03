package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static XSSFWorkbook wb;

	public ExcelDataProvider() throws Throwable {

		String location = "D:\\Practice_Selenium2024\\PracticalSelenium_Framework3\\TestData\\TestData.xlsx";

		FileInputStream file = new FileInputStream(location);
		wb = new XSSFWorkbook(file);
		
	}

	public String GetStringData(String name, int row, int cell) {

		return wb.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	public String GetNumericData(String name, int row, int cell) {

		double d =  wb.getSheet(name).getRow(row).getCell(cell).getNumericCellValue();
		String s = String.valueOf(d);
		String s1 = s.replace(".0", " ");
		return s1;
		
	}

}
