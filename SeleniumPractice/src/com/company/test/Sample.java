package com.company.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String chromepath="\"C:\\\\Selenium\\\\src\\\\Drivers\\\\chromedriver.exe"
		
System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.w3schools.com/jquery/");
driver.get("https://rahulshettyacademy.com/AutomationPractice/");


	}

}
