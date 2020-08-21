package FileHandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThreeFunction {
	public static void main(String[]args)
	{ 
		//getRowCount();
		//getColCount();
		getcelldataString();
		getCellDataNumber();
		//getColCount();
	}
	public static void getColCount()
	//public static int getColCount()
	{
		//int ColCount = 0;
	//XSSFWorkbook workbook = new XSSFWorkbook();
		try
		{
			String Projectpath = System.getProperty("user.dir");
			File Src = new File("E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			 //colcount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("num of col :"+ colcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return ColCount;
	}
public static void getRowCount()
	//public static int getRowCount()
	{
	//XSSFWorkbook workbook = new XSSFWorkbook();
		//int rowcount = 0;
		try
		{
			String Projectpath = System.getProperty("user.dir");
			File Src = new File("E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowcount = sheet.getPhysicalNumberOfRows();
			
	System.out.println("num of row :"+ rowcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return rowcount;
	}
	public static void getcelldataString()//(int rownum,int colnum)
	//public static String getCellDataString(int rownum,int colnum)
	{
	//String CellData = null;
		try {
			String Projectpath = System.getProperty("user.dir");
			File Src = new File("E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	//String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		String celldata = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(celldata);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return celldata;
	}
	public static void getCellDataNumber()
	{
		try {
			String Projectpath = System.getProperty("user.dir");
			File Src = new File("E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	Double CellData = sheet.getRow(1).getCell(1).getNumericCellValue();
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
