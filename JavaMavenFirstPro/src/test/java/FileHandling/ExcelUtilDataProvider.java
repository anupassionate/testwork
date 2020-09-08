package FileHandling;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtilDataProvider {

	
	//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
	//...constructor using row,column using parameter calling excel function...//
	//...call function to get cell data...//
	
		
	static String Projectpath;
		static XSSFWorkbook workbook;
		static XSSFSheet sheet;
		public ExcelUtilDataProvider(String excelPath,String sheetname)
		{
			try {
				String ProjectPath = System.getProperty("user.dir");
				//File Src = new File(ProjectPath+"\\Excel\\age_validation.xlsx");
				workbook = new XSSFWorkbook(ProjectPath+"\\Excel\\age_validation.xlsx");
				
				
			 
			 
			 sheet=workbook.getSheet("sheet1");
			 

				//workbook.getSheet(sheetname);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				
			
		}
		
		public static void main(String[]args)
		{ 
			getRowCount();
			getColCount();
			//getCellDataString(0,0);
		}
		
		//public static int getRowCount()
		public static int getRowCount()
		{
		
			int rowcount = 0;
			try
			{
				
		//int rowcount = sheet.getPhysicalNumberOfRows();
				rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("num of row :"+rowcount);
		
		
			}catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return rowcount;
		}
		//public static void getColCount()
		public static int getColCount()
		{
			int colCount = 0;
		//XSSFWorkbook workbook = new XSSFWorkbook();
			try
			{
				
		//int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
				 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("num of col:"+colCount);
		
		
			}catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return colCount;
		}
		
		public String getCellDataString(int rownum,int colnum)
		{
		String CellData=null;
			try {
				
		 
			 CellData=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println(CellData);
			}
			catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return CellData;
		}
			

public static void getCellDataNumber(int rownum,int colnum)
{
	
	try {
		
 double celldata = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
System.out.println(celldata);
	}
	catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}			
				
					
		
		

		
	


}
}