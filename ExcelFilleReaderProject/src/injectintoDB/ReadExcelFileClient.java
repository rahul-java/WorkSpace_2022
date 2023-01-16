package injectintoDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileClient
{
	public static void main(String[] args) throws IOException 
	{
		ReadExcelFileAndShow.readExcelFileAndShow();
		
		String s=ReadParticularCell.ReadCellData(2, 1);
		System.out.println("thre value at cell(2,1) is : "+s);
		
		List<EmployeeBean> list=ReadExcelFile.readExcelFile();
		EmployeeDAO.insertIntoDB(list);
		
	}

}
