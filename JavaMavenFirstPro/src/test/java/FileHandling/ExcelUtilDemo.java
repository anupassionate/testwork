package FileHandling;

//import java.io.File;
//import java.io.FileInputStream;



public class ExcelUtilDemo {
	
public static void main(String[]args)

{
	
	String Projectpath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(Projectpath+"\\Excel File\\age_validation.xlsx","sheet1");
	
	ExcelUtils.getRowCount();
	//ExcelUtils.getColCount();
	ExcelUtils.getcelldataString(0,0);
	ExcelUtils.getCellDataNumber(1,1);
}
	
	
}
