package Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	private int retrycount = 0;
	
	private static final int maxretryCount = 5;
	
	

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount < maxretryCount)
		{	
			retrycount++;
			return true;
		}
		
		return false;
	}

}
