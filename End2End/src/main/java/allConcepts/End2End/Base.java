package allConcepts.End2End;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	Properties propObject;
	public WebDriver browserInitialise() throws IOException
	{
		
		 propObject=new Properties(); 
		FileInputStream fileObject=new FileInputStream("C:\\Users\\PARANTHAMAN GEETHA\\eclipse-workspace\\End2End\\src\\main\\Resources\\BrowserConfirmation.properties");
		propObject.load(fileObject);
		String browserOption=propObject.getProperty("browser");
		
		if(browserOption.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","");
			 driver=new ChromeDriver();
			
			
		}
		else if(browserOption.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		else if(browserOption.equals("IE"))
		{
			System.setProperty("Webdriver.ie.driver","");
			 driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
public void screenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot sct=(TakesScreenshot) driver;
	File source=sct.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	System.out.println("moved to screenShotpath");
	//return destinationFile;
	
	
}
}
