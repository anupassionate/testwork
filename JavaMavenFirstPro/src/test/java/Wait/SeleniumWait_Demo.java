package Wait;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWait_Demo {
public static void main(String[]args)
{
	SeleniumWaits();
}
public static void SeleniumWaits()
{
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("http://google.com/");
	 driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	 
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
	 driver.close();
	 driver.quit();
}
	}


