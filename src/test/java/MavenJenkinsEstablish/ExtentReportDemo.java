package MavenJenkinsEstablish;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	ExtentReports report;
	
	@BeforeTest
	public void extentSpark()
	{
		String path=System.getProperty(("user.dir"))+"//reports//Index.html";
		ExtentSparkReporter sparkrepo=new ExtentSparkReporter(path);
		sparkrepo.config().setReportName("WebAutomation");
		sparkrepo.config().setDocumentTitle("Test results");
		
		
		 report=new ExtentReports();
		report.attachReporter(sparkrepo);
		report.setSystemInfo("Tester", "Geetha S");
		
	}
	

	
@Test
public void extentrEportDemo()

{
	ExtentTest test=report.createTest("Initial Extent report Demo");
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	
WebDriver driver=new FirefoxDriver();
driver.get("https://rahulshettyacademy.com/#/index");
System.out.println(driver.getTitle());
//test.fail();
test.fail("Wantendly Made failed one");

report.flush();


}

public void newCode()
{
	System.out.println("NEWLY UPDATED CODE WITH EXISTING ONDE");
}

}
