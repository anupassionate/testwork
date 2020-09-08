package FileHandling;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BasicFile {
	public static void main(String[]args) throws Exception
	{
		String ProjectPath = System.getProperty("user.dir");
		File Src = new File(ProjectPath+"\\Excel\\age_validation.xlsx");
	
	FileInputStream fis = new FileInputStream(Src);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);

XSSFSheet sheet = workbook.getSheet("Sheet1");
int rowcount = sheet.getPhysicalNumberOfRows();
	 //rowcount = sheet.getPhysicalNumberOfRows();
int colcount = sheet.getRow(0).getPhysicalNumberOfCells();

System.out.println("num of row :"+rowcount);
System.out.println("num of col :"+colcount);

}
void Catch(Exception exp) 

{
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.printStackTrace();

}






}