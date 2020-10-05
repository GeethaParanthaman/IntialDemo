package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Practise_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//*url to download the browser
// https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver

	//C:\Program Files
		
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	Thread.sleep(1000);
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 System.out.println("H");
 Thread.sleep(400);
 //to select 1st checkbox
 driver.findElement(By.id("checkBoxOption1")).click();
 //to identify it is selected 1st checkbox/not
 System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
 Thread.sleep(100);
 driver.findElement(By.id("checkBoxOption1")).click();
 System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
 Thread.sleep(200);
 System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']")).getSize());

 
 



}
}