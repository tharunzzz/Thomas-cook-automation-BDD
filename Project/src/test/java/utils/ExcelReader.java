package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public String readExcel(String filepath, String sheetName, int rowid, int colid) {
		String value = null;
		try {
			String path = System.getProperty("user.dir") + filepath;
			FileInputStream fis = new FileInputStream(path);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			value = sheet.getRow(rowid).getCell(colid).getStringCellValue();
			
			workbook.close();
			fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}

}
