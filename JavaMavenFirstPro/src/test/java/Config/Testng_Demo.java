package Config;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoggDemo.Log4j_Demo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Demo {
	WebDriver driver = null;
	public static String BrowserName = null;
	private static Logger logger = LogManager.getLogger(Log4j_Demo.class);
	@BeforeTest
	public void setuptest()
	{
		PropertiesFile.getProperties();
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("http://google.com");
        
        
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			// WebDriver driver = new ChromeDriver();
	        driver = new FirefoxDriver();
	        driver.get("http://google.com");
	        
		}
logger.info("browser started");
	
	}
	@Test
	public void Google_serch()
	{
		driver.get("http://google.com");
        
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       
	
	}
	@AfterTest
public void teardowntest()
{
	driver.close();
	//driver.quit();
    System.out.println("test complited succesfully");
    PropertiesFile.setProperties();
}
}
