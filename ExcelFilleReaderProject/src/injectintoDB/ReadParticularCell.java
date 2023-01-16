package injectintoDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularCell 
{
	public static String ReadCellData(int vRow, int vColumn) throws IOException  
	{  
	String value=null;            
	Workbook wb=null;            
	  
	FileInputStream fis=new FileInputStream("F:\\\\WorkSpace_2022\\\\ExcelFilleReaderProject\\\\src\\\\injectintoDB\\\\employee.xlsx");   
	wb=new XSSFWorkbook(fis); 
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}  

}
