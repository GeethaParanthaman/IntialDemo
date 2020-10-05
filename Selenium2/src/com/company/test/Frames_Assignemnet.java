package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Assignemnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-middle");
System.out.println(driver.findElement(By.id("content")).getText());
		
		//driver.close();
	}

}
