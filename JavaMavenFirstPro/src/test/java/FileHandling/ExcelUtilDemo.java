package FileHandling;

//import java.io.File;

//import java.io.File;
//import java.io.FileInputStream;



public class ExcelUtilDemo {
	
public static void main(String[]args)

{
	String ProjectPath = System.getProperty("user.dir");
	//File Src = new File(ProjectPath+"\\Excel\\age_validation.xlsx");
	//String Projectpath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(ProjectPath+"\\Excel\\age_validation.xlsx","sheet1");
	excel.getRowCount();
	excel.getCellDataNumber(1, 1);
	excel.getcelldataString(0, 0);
	
}
	
	
}
