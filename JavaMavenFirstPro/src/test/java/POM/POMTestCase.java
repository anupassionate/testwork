package POM;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class POMTestCase {
	

	    //String driverPath = "C:\\geckodriver.exe";
	    
	    WebDriver driver;

	    loginPage objLogin;

	    homePage objHomePage;

	    @Test

	    public void setup(){
	    	
	    	//String Projectpath = System.getProperty("user.dir");
			

		//System.setProperty("webdriver.gecko.driver", driverPath);
	    	WebDriverManager.chromedriver().setup();
			// WebDriver driver = new ChromeDriver();
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");

	    }

	    /**

	     * This test case will login in http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message

	     */

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){

	        //Create Login Page object

	    objLogin = new loginPage(driver);

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application

	    objLogin.loginToGuru99("mgr123","mgr!23");

	    // go the next page

	    objHomePage = new homePage(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
driver.close();

	    }
	}
