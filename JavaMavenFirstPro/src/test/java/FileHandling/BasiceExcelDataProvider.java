package FileHandling;

public class BasiceExcelDataProvider {
	public static void main(String[]args)
	{
		String excelpath="E:\\POMJAVA\\JavaMavenFirstPro\\Excel File\\age_validation.xlsx";
		testData(excelpath,"sheet1");
		
	}
	
 
 
	public  static void testData(String excelPath, String sheetname)
	{
		ExcelUtilDataProvider excel = new ExcelUtilDataProvider(excelPath,sheetname);
		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();
			//Object data[][]= new Object [rowcount-1][colcount];
		for(int i=1;i<=rowcount;i++)
		{
			
			for(int j=0;j<colcount;j++)
			{
				String CellData = excel.getCellDataString(i,j);
				
				System.out.print(CellData+" ");
				
			}
			System.out.println();
		}
	
	}

}

