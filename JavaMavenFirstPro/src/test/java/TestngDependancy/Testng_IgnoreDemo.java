package TestngDependancy;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class Testng_IgnoreDemo {
//@Ignore
	@Test
		public void Test1()
		{
System.out.println("Iam Inside Test1");

	}
	@Test
	public void Test2()
	{
System.out.println("Iam Inside Test2");

}
	}


