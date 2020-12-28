package bank.loan;

import org.testng.ITestListener;
import org.testng.ITestResult;





public class Listeners implements ITestListener {
	 @Override		
	    public void onTestFailure(ITestResult result) {					
	        // TODO Auto-generated method stub	
		 System.out.println("Failure"+result.getName());
	        		
	    }	
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("Passed one"+result.getName());
}

}
