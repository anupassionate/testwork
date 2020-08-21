package TestngDependancy;

import org.junit.Assert;
import org.testng.annotations.Test;

import Listners.RetryAnalyser;

public class TestngRetryFailDemo {

	
@Test
		public void Test1()
		{
System.out.println("Iam Inside Test1");

	}
@Test
public void Test2()
{
System.out.println("Iam Inside Test2");
//int i=1/0;
}
@Test(retryAnalyzer =Listners.RetryAnalyser.class )
public void Test3()
{
System.out.println("Iam Inside Test3");
Assert.assertTrue(0>1);
}
}
