package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFileUtility {
	
	public String getDataFromExcelSheet(String sheet,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fise=new FileInputStream(".\\src\\test\\resources\\RestAssuredDataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fise);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		wb.close();
		return value;
	
		
	}
	public Object[][] readMUltipleDataFromExcelSheet(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fise=new FileInputStream(".\\src\\test\\resources\\RestAssuredDataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fise);
		Sheet sh = wb.getSheet(sheetname);
		int lastrow = sh.getLastRowNum();
		int lastcell = sh.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
			
		}
		return data;
	}
	public int getRowCount(String sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\RestAssuredDataProvider.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		wb.close();
		return sh.getLastRowNum();
		
	}
	
	public void writeDataintoExcelSheet(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisw=new FileInputStream(".\\src\\test\\resources\\RestAssuredDataProvider.xlsx");
		Workbook wb=WorkbookFactory.create(fisw);
		Sheet sh=wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\RestAssuredDataProvider.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
