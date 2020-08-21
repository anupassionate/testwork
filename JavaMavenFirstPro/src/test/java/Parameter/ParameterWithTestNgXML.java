package Parameter;


	import org.testng.AssertJUnit;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class ParameterWithTestNgXML {

		//String driverPath = "C:\\geckodriver.exe";
		WebDriver driver;
	    @Test
	    @Parameters({"author","searchKey"})
	    public void ParameterWithTestNGXML(@Optional("Abc") String author,@Optional String searchKey) throws InterruptedException{
	    	
	    	WebDriverManager.chromedriver().setup();
			
	        driver = new ChromeDriver();
	        //System.setProperty("webdriver.gecko.driver", driverPath);
	        //driver = new FirefoxDriver();
	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://google.com");

	        WebElement searchText = driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(searchKey);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        System.out.println("Thread will sleep now");
	        Thread.sleep(4000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //verifying the value in google search box
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

	}

}
