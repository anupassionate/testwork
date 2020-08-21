package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test();
	}
public static void test()
{
	WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("==headless");
	options.addArguments("window-size=1280,800");
	 driver = new ChromeDriver(options);
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("ABCD");
	 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	 driver.close();
	 driver.quit();
	 System.out.println("Complited");
	 
	
}
	}


