package MyPackage;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups= {"Regression"})
	public void hello()
	{
		System.out.println("hello");
	}
	
	@Test
	public void hello1()
	{
		System.out.println("hello1");
	}
	
	

}
