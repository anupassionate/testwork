package PageFactory;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import PageFactory.guru99homepage;
//import PageFactory.guru99login;
import io.github.bonigarcia.wdm.WebDriverManager;
	public class guru99testcasewithpagefactory {
	

	    //String driverPath = "C:\\geckodriver.exe";
	    
	    WebDriver driver;

	    guru99login objLogin;

	    guru99homepage objHomePage; 

	    @BeforeTest

	    public void setup(){

	        //System.setProperty("webdriver.gecko.driver", driverPath);
	    	//String Projectpath =System.getProperty("user.dir");
	    	WebDriverManager.chromedriver().setup();
	        
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");

	    }

	    /**

	     * This test go to http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message

	     */

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){

	        //Create Login Page object

	    objLogin = new guru99login(driver);

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application

	    objLogin.loginToGuru99("mgr123", "mgr!23");

	    // go the next page

	    objHomePage = new guru99homepage(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
       driver.close();
       driver.quit();
	    
	    }
	    }
