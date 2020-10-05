package com.company.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
//driver.get("https://www.w3schools.com/jquery/");
driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
