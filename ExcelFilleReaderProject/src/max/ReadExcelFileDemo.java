package max;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis=new FileInputStream(new File("F:\\student.xlsx"));
		
		//HSSFWorkbook hssfWB=new HSSFWorkbook(fis);   it used for older version of excel before 2007 or 2003
		//HSSFSheet sheet=hssfWB.getSheetAt(0);
		
		  XSSFWorkbook hssfWB=new XSSFWorkbook(fis);
          XSSFSheet sheet=hssfWB.getSheetAt(0);
          
		FormulaEvaluator formulaEvaluator=hssfWB.getCreationHelper().createFormulaEvaluator();
		
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
				{  
				case Cell.CELL_TYPE_NUMERIC:    
				System.out.print(cell.getNumericCellValue()+ "\t");   
				break;  
				case Cell.CELL_TYPE_STRING: 
				System.out.print(cell.getStringCellValue()+ "\t");  
				break;  
				}  
			}
			System.out.println();
		}
		
	}

}
