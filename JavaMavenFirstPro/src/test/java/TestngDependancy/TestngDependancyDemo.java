package TestngDependancy;

import org.testng.annotations.Test;

public class TestngDependancyDemo {

	// TODO Auto-generated method stub
		//@Test(dependsOnMethods = {"test2"},priority = 1)
	//@Test(dependsOnMethods = {"test2","test3"})
	//@Test(dependsOnGroups = {"Sanity1"} )
	@Test(dependsOnGroups = {"Sanity.*"} )
		public void Test1()
		{
System.out.println("Iam Inside Test1");

	}
		//@Test(priority=3)
	@Test(groups= {"Sanity1"})
		public void Test2()
		{
System.out.println("Iam Inside Test2");

	}
		@Test(groups= {"Sanity2"})
		public void Test3()
		{
System.out.println("Iam Inside Test3");

	}


}
