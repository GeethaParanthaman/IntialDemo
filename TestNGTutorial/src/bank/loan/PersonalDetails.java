package bank.loan;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class PersonalDetails {
	
@Test(dataProvider ="getData")
	public void familyDetails(String object1,String object2)
	{
		System.out.println("Family Details");
		System.out.println(object1);
		System.out.println(object2);
	}
@Parameters("URL")
@Test(timeOut = 3000)
	public void hobies(String uRL)
	{
	Assert.assertFalse(true);
		System.out.println("Hobbies");
		System.out.println(uRL);
	}
@Test
@DataProvider
public Object[][] getData()
{
	/*To define 3 set of data for 3different user & password
	 * 
	 
	 */
	Object[][] object=new Object[3][2];
	//1st set
	object[0][0]="FisrstUser";
	object[0][1]="Password1";
	
	//2nd set
	object[1][0]="SecondUser";
	object[1][1]="password2";
	
	//3rd set
	object[2][0]="thrirdUser";
	object[2][1]="Pasword3";
	return object;
	
	
}



}
