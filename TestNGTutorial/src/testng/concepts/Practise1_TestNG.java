package testng.concepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practise1_TestNG {

	//execution of TestNG begining
	@Test
	public void testNgProgram()
	{
	System.out.println("Started with TestNG");
	}
	
	@AfterTest
	public void testNGprogramSec()
	{
	
		System.out.println("Learning TestNG ");
	}
	@Test
	public void newCourse()
	{
	
		System.out.println("newCourse ");
	}
	
	@Test
	public void newCourseSec()
	{
	
		System.out.println("newCourse ");
	}
	
	@BeforeMethod
	public void everyBefore()
	{
		System.out.println("I will execute Before to every method ");
	}
}
