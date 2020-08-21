package FileHandling;
//....objArray using testng ..//
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider = "test1data")
	public void test1(String Name,String age)
	{
		System.out.print(Name+""+age);
	}
	@DataProvider(name="test1data")
	
 public  Object[][] getdata() {
		String excelpath="E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx";
		Object data[][]= testData(excelpath,"sheet1");
	 return data;
 }
	public  Object[][] testData(String excelPath, String sheetname)
	{
		ExcelUtilDataProvider excel = new ExcelUtilDataProvider(excelPath,sheetname);
		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();
			Object data[][]= new Object [rowcount-1][colcount];
		for(int i=1;i<=rowcount;i++)
		{
			
			for(int j=0;j<colcount;j++)
			{
				String CellData = excel.getCellDataString(i,j);
				 //String data0 = String.valueOf(sheetname.getRowcount(i).getCell(0).getNumericCellValue());
				    //System.out.println("Test Data From Excel" + data0);
				
				//System.out.print(CellData+" ");
				data[i-1][j] = CellData;
			}
			System.out.println();
		}
	return data;
	}

}
