package bank.loan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BankDetails {
	@Parameters({"URL","URL2"})
	@Test(dependsOnMethods ="hobbies")
	public void carLoan(String uRL,String uRL2)
	{
		System.out.println("carloan");
		System.out.println(uRL);
		System.out.println(uRL2);
	}
	@Test(enabled=true)
public void perosnalLoan()
{
	System.out.println("perosnalLoan");
	
}
	@Test
	public void hobbies()
	{
		System.out.println("Same class hobies");
	}
}
