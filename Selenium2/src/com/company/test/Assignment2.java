package com.company.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(10000);
		
		driver.get("https://www.cleartrip.com/");
		//Thread.sleep(10000);
		
		
		driver.findElement(By.id("FromTag")).sendKeys("che");
		//Thread.sleep(10000);
//Current date selection
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-defaultui-state-active")).click();
		Thread.sleep(5000);
		

//adult selection
		WebElement element = driver.findElement(By.id("adults"));
		Select dropdownvalueselect = new Select(element);
		dropdownvalueselect.selectByIndex(1);
		Thread.sleep(5000);
//children slection
		WebElement elementchild = driver.findElement(By.id("Childrens"));
		Select selectchildvalue = new Select(elementchild);
		selectchildvalue.selectByValue("4");
		//Thread.sleep(50000);
		driver.findElement(By.id("MoreOptionsDiv")).click();
		Thread.sleep(5000);
//enetr value in textbox
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("worling");
		//Thread.sleep(5000);
//click on serach button
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(200);
//to display the errror msg
		String errormsg = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errormsg);
		

	}

}
