package FileHandling;



import java.io.File;
import java.io.FileInputStream;

//import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//...constructor using row,column using parameter calling excel function...//
//...call function to get cell data...//
public class ExcelUtils {
	
	//static String Projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//...create constructor...//
	public ExcelUtils(String excelPath,String sheetname)
	{
		try {
			String ProjectPath = System.getProperty("user.dir");
			File Src = new File(excelPath);
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("sheetname");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
	}
	public static void main(String[]args)
	{ 
		//getRowCount();
		getcelldataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static void getRowCount()
	
	{
	
		try
		{
	int rowcount = sheet.getPhysicalNumberOfRows();
	
	System.out.println("num of row :"+rowcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return rowcount;
	}
public static void getcolCount()
	
	{
	
		try
		{
	int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	System.out.println("num of col :"+ colcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return rowcount;
	}
	public static void getcelldataString(int rownum,int colnum)
	
	{
	
		try {
			
	String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 
	System.out.println(celldata);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return CellData;
	}
	public static void getCellDataNumber(int rownum,int colnum)
	{
		try {
			
	Double CellData = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
	System.out.println(CellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
				
			
				
	
	

	
}

