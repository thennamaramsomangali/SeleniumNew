package reports;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFromExcel {

	@Test
	public Object[][] fetchData(String fileName) throws IOException {
	
	System.out.println("./data/"+fileName+".xlsx");
	//open workbook
	XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
	
	//go to sheet
	XSSFSheet sheet = wbook.getSheetAt(0);
	
	//identify the row
	int rowCount = sheet.getLastRowNum();
	System.out.println("Row Count is: "+rowCount);
	
	//identify the column
	int colCount = sheet.getRow(0).getLastCellNum();
	System.out.println("Column Count is: "+colCount);
	
	Object[][] data = new Object[rowCount][colCount];
	
	///Read the Data
	for (int i = 1; i <=rowCount ; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			
			XSSFCell cell = row.getCell(j);
			
			data[i-1][j] = cell.getStringCellValue();
			
			System.out.println(data);
			
			
		}
		wbook.close();
		
	}
	return data;

}

}

