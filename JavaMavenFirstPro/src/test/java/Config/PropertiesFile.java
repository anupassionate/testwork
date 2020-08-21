package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	 //static String projectpath;
	static String projectpath = System.getProperty("user.dir");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties()
	{
		try {
			//Properties prop = new Properties();
			//String projectpath = System.getProperty("user.dir");
			
	
		//Properties Prop = new Properties();
		InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\Config\\Config.Properties");
		
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Testng_Demo.BrowserName = browser;
		
			
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
public static void setProperties()
{
	try
	{
	OutputStream  output = new FileOutputStream(projectpath+"\\src\\test\\java\\Config\\Config.Properties");
	//prop.setProperty("browser","chrome");
	prop.setProperty("result","pass");
	
	
	prop.store(output, null);
}
	catch (Exception exp) {
	// TODO Auto-generated catch block
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.printStackTrace();
}
}
}

