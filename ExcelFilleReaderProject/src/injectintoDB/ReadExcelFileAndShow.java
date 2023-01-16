package injectintoDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileAndShow 
{

	public static void readExcelFileAndShow() throws IOException
	{
FileInputStream fis=new FileInputStream(new File("F:\\WorkSpace_2022\\ExcelFilleReaderProject\\src\\injectintoDB\\Employee.xlsx"));
		
		//HSSFWorkbook hssfWB=new HSSFWorkbook(fis);   it used for older version of excel before 2007 or 2003
		//HSSFSheet sheet=hssfWB.getSheetAt(0);
		
	   XSSFWorkbook hssfWB=new XSSFWorkbook(fis);
       XSSFSheet sheet=hssfWB.getSheetAt(0);
       
       Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
		while (itr.hasNext()) 
		{
			Row row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
			while (cellIterator.hasNext()) 
			{
				Cell cell = cellIterator.next();
				
				switch (cell.getCellType()) 
				{
				case Cell.CELL_TYPE_STRING: 
					System.out.print(cell.getStringCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t\t");
					break;
				default:
				}
			}
			System.out.println("");
		} 
         
       
       
		/*FormulaEvaluator formulaEvaluator=hssfWB.getCreationHelper().createFormulaEvaluator();
		
	
		
		for(Row row:sheet)
		{
			for(Cell cell:row)
				{
					switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
					{  
					case Cell.CELL_TYPE_NUMERIC:    
					System.out.print(cell.getNumericCellValue()+ "\t\t");   
					break;  
					case Cell.CELL_TYPE_STRING: 
					System.out.print(cell.getStringCellValue()+ "\t\t");  
					break;  
					}  
				}
			
			System.out.println();
		}*/
	}
	 
}
