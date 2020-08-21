package Parameter;


	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.AssertJUnit;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
	public class NoParameterWithTestNgXml {
	
		//String driverPath = "C:\\geckodriver.exe";
		WebDriver driver;
	    
	    @Test
	    public void testNoParameter() throws InterruptedException{
	        String author = "guru99";
	        String searchKey = "india";
	        WebDriverManager.chromedriver().setup();
		
	        driver = new ChromeDriver();
	        //System.setProperty("webdriver.gecko.driver", driverPath);        
	        //driver= new FirefoxDriver();
	        //driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	        
	        driver.get("https://google.com");
	        WebElement searchText = driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(searchKey);
	        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	        
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	                System.out.println("Thread will sleep now");
	        
	        Thread.sleep(4000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	        //verifying the value in google search box
	     
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	        driver.close();
	}
	    

}
