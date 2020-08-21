package FileHandling;



//import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//...constructor using row,column using parameter calling excel function...//
//...call function to get cell data...//
public class ExcelUtils {
	
	static String Projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String excelPath,String sheetname)
	{
		try {
			
		 workbook = new XSSFWorkbook(excelPath);
		 sheet=workbook.getSheet(sheetname);
			//workbook.getSheet(sheetname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
	}
	public static void main(String[]args)
	{ 
		getRowCount();
		getcelldataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static void getRowCount()
	//public static int getRowCount()
	{
	//XSSFWorkbook workbook = new XSSFWorkbook();
		//int rowcount = 0;
		try
		{
			
	int rowcount = sheet.getPhysicalNumberOfRows();
			//rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println("num of row :"+ rowcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return rowcount;
	}
	public static void getcelldataString(int rownum,int colnum)
	//public static String getCellDataString(int rownum,int colnum)
	{
	//String CellData = null;
		try {
			
	String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 //CellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
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

