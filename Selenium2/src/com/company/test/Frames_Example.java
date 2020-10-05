package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Example {

	public static <Method1_example> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		//Method1_example method=new Method1_example(WebDriver driver);
		
	}
		//find the frame
		//by drag & drop move it, for this create ACtion class
		public void dragDropCall(WebDriver driver)
		{
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
	
	}

}
