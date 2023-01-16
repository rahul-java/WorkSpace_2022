package injectintoDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	
	public static List<EmployeeBean> readExcelFile() throws IOException
	{
         FileInputStream fis=new FileInputStream(new File("F:\\WorkSpace_2022\\ExcelFilleReaderProject\\src\\injectintoDB\\employee.xlsx"));
		 XSSFWorkbook hssfWB=new XSSFWorkbook(fis);
         XSSFSheet sheet=hssfWB.getSheetAt(0);
     
          int r=sheet.getLastRowNum();
          System.out.println(r);
          List<EmployeeBean> empList=new ArrayList<EmployeeBean>();
          
          Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
  		  itr.next();
          while (itr.hasNext()) 
  		{
  			Row row = itr.next();
  			EmployeeBean emp=new EmployeeBean();
  			Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
  			while (cellIterator.hasNext()) 
  			{
  				
  				Cell cell = cellIterator.next();
  				System.out.println(cell.getColumnIndex());
  				switch(cell.getColumnIndex())
      		  {
      		  case 0: 
      			  emp.setEmpId((int)cell.getNumericCellValue());
      			  break;
      		  case 1:
      			  emp.setName(cell.getStringCellValue());
      			  break;
      		  case 2:
      			  emp.setSalary((int)cell.getNumericCellValue());
      			  break;
      		  case 3:
      			  emp.setDepartment(cell.getStringCellValue());
      			  break;
      		  case 4:
      			  emp.setDesignation(cell.getStringCellValue());
      			  break;
      		  }
  			}
  		  empList.add(emp);
      	  System.out.println(emp.getEmpId() +"Added Successfully..");
  			
  		} 
  		return empList;
          
          /*for(int i=1;i<=sheet.getLastRowNum();i++)
          {
        	  EmployeeBean emp=new EmployeeBean();
        	  Row row=sheet.getRow(i);
        	  for(int j=0;j<row.getLastCellNum();j++)
        	  {
        		  Cell cell=row.getCell(j);
        		  
        		  switch(j)
        		  {
        		  case 0: 
        			  emp.setEmpId((int)cell.getNumericCellValue());
        			  break;
        		  case 1:
        			  emp.setName(cell.getStringCellValue());
        			  break;
        		  case 2:
        			  emp.setSalary((int)cell.getNumericCellValue());
        			  break;
        		  case 3:
        			  emp.setDepartment(cell.getStringCellValue());
        			  break;
        		  case 4:
        			  emp.setDesignation(cell.getStringCellValue());
        			  break;
        		  }
        	  }
        	  empList.add(emp);
        	  System.out.println(emp.getEmpId() +"Added Successfully..");
          }
          
          return empList;
          */
		
	}

}
