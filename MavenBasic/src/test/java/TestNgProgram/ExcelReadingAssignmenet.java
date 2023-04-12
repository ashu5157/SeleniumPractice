package TestNgProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadingAssignmenet {
  @Test
  public void readsheet() throws IOException {
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppTest.xlsx");
	  Workbook workbook=new XSSFWorkbook(fis);
	  int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheet count: " + sheetCount);
	 //get name of all sheet
	  for(int i=0;i<sheetCount;i++) {
		  String sheet_name=workbook.getSheetName(i);
		  System.out.println("name of sheet :"+sheet_name);
	  }
    // get required sheet from excel 
	  Sheet sheet=workbook.getSheet("Sheet1");
  }
  
  @Test
	public void getRowDetails() throws IOException {
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppTest.xlsx");
	  Workbook workbook=new XSSFWorkbook(fis);//
	  Sheet sheet=workbook.getSheet("TC");
	  //get row count from excel(rowcount=actual count -1)
	  int sheetCount =workbook.getNumberOfSheets();
	  System.out.println("count of row: "+sheetCount);
	  //get spacific row rom excel sheet
	  Row row=sheet.getRow(1);
	  //System.out.println(row);
}
  
  @Test
	public void getCellDetails() throws IOException {
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppTest.xlsx");
	  Workbook workbook=new XSSFWorkbook(fis);
	  Sheet sheet=workbook.getSheet("Sheet1");
	//get spacific row rom excel sheet
	  Row row=sheet.getRow(1);
	  //get cellcount from row
	  int cellCount=row.getLastCellNum();
	  System.out.println("count of cell :"+cellCount);
	// get cell-2 data from cell from row0
	  Cell cell=row.getCell(3);
	  System.out.println(cell);
	  System.out.println("Row0, Cell2 data is : " + cell.getStringCellValue());
}
}