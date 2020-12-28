package allConcepts.End2End;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;


public class ExtentReportNG {
	static ExtentReports extent;
	
	
	public static ExtentReports extentObject()
	
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter sparkObject=new ExtentSparkReporter(path);
		sparkObject.config().setReportName("Automation results");
		sparkObject.config().setDocumentTitle("Reports of End to end");
		
		 extent=new ExtentReports();
		extent.attachReporter(sparkObject);
		extent.setSystemInfo("Tester","Geetha S");
		return extent;
		
	}

}
