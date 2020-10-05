package com.company.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//window handling
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
//for implicit synchronise
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Need to be create action class for the mouse over action
		Actions a_mouseOver = new Actions(driver);
WebElement mouseoverPopup=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

//to explicit webdriverwait
//WebDriverWait wait=new WebDriverWait(driver, 5);
//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-flyout-accountList")));

//To print uppercase helo in search & it should be with double slect
		a_mouseOver.moveToElement(driver.findElement(By.id("searchDropdownBox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(5000);
		a_mouseOver.moveToElement(mouseoverPopup).build().perform();
		Thread.sleep(10000);
		a_mouseOver.moveToElement(mouseoverPopup).contextClick().build().perform();
		
		//driver.close();

	}

}
