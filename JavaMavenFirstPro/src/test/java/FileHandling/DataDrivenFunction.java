package FileHandling;

//import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import config.propertiesfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFunction {
	
		WebDriver driver = null;
		
		@BeforeTest
	    public void setupTest()
		{
			//String Projectpath = System.getProperty("user.dir");
			//Propertiesfile.getproperties();
			WebDriverManager.chromedriver().setup();
				
						WebDriver driver = new ChromeDriver();
						//System.out.print(UserName+" "+Password);
						driver.get("https://opensource-demo.orangehrmlive.com/");
						
	}
		@Test(dataProvider="test1data")
		public void test1(String username,String password) throws Exception
		{
			try
			{
			//System.out.print(username+" "+ password);
		driver.get("http://opensource-demo.orangehrmlive.com/");
		//System.out.print(username+"  | "+ password);
			driver.findElement(By.id("txtUsername")).sendKeys("username");
			driver.findElement(By.id("txtPassword")).sendKeys("password");
			System.out.print(username+"  | "+ password);
			}catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			//FileInputStream fis = new FileInputStream(Src);
			Thread.sleep(2000);
			}
		}
		@DataProvider(name ="test1data")
		
	 public Object[][] getdata() {
			String excelpath = "E:\\POMJAVA\\JavaMavenFirstPro\\Excel\\love.xlsx";
			Object data[][] = test1data(excelpath,"Sheet1");
		 return data;
	 }
		public  Object[][] test1data(String excelPath,String sheetname)
		{
			ExcelUtilDataProvider excel = new ExcelUtilDataProvider(excelPath,sheetname);
			int rowcount = excel.getRowCount();
			int colcount = excel.getColCount();
		
				Object data[][] = new Object[rowcount-1][colcount];
			for(int i=1;i<=rowcount;i++)
			{
				
				for(int j=0;j<colcount;j++)
				{
					String CellData = excel.getCellDataString(i,j);
					 
					data[i-1][j] = CellData;
				}
				System.out.println();
			}
		return data;
		}

	
 
 
	
	}

	



