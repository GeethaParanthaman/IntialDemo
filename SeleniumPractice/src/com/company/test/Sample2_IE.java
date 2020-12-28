package com.company.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample2_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*url to download the browser
// https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver

	//C:\Program Files
		
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
 //driver.get("https://google.com");
	driver.get("https://www.w3schools.com/jquery/");
 System.out.println(driver.getTitle());
 System.out.println(driver.getCurrentUrl());



}
}