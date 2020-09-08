package FileHandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoFunction {
	public static void main(String[]args)
	{
		getRowCount();
		getColCount();
	}
	public static void getColCount()
	{
		try
		{
			String ProjectPath = System.getProperty("user.dir");
			File Src = new File(ProjectPath+"\\Excel\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			 colcount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("num of col :"+ colcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}//return ColCount;
	
	public static void getRowCount()
	//public static int getRowCount()
	{
	
		try
		{
			String ProjectPath = System.getProperty("user.dir");
			File Src = new File(ProjectPath+"\\Excel\\age_validation.xlsx");
			FileInputStream fis = new FileInputStream(Src);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowcount = sheet.getPhysicalNumberOfRows();
			 rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println("num of row :"+ rowcount);
	
	
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		//return rowcount;
	}
}

