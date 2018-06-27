package reports;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadFromExcelSimple {

	@Test
	public void fetchData() throws IOException {
		
		XSSFWorkbook wbook=new XSSFWorkbook("./data/TC001.xlsx"); //open workbook
		XSSFSheet sheet = wbook.getSheet("Login");	//getSheetAt(0);
		int rowCount = sheet.getLastRowNum();  //without header
		System.out.println(rowCount);
		short colCount = sheet.getRow(0).getLastCellNum(); // first row and last column
		System.out.println(colCount);

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row = sheet.getRow(i);  //getting row in row variable
			//System.out.println(row);   // it will give details in xml format
			for (int j = 0; j < colCount; j++) {

				XSSFCell cell = row.getCell(j);  //getting cell in that row in cell variabe
				String data = cell.getStringCellValue(); //getting data from cell in data variable  //in first iteration 2nd row 1st column value will be stored in data
				System.out.println(data);
			}
			wbook.close();
		}
		

	}
}
