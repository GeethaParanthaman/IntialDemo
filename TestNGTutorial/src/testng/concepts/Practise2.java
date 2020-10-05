package testng.concepts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practise2 {
	@BeforeTest
	public void beforeExecution()
	{
		System.out.println("Before Execution");
	}
	
	@Test
	public void testNgProgram()
	{
		System.out.println("using testNG");
	}
	
	@Test
	public void testNgProgramTwo()
	{
		System.out.println("Need to be leanrn alot");
	}

	@Test
	public void newContent()
	{
		System.out.println("newOne");
	}
	
	@BeforeSuite
	public void newArrival()
	{
		System.out.println("I am the very first one to execute");
	}
	
	
	@AfterSuite
	public void AfterSuiteExecution()
	{
		System.out.println("I am the last one to Execute");
	}
	
}
