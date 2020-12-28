package com.company.test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentExplicit_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//url to navigate
driver.get("https://the-internet.herokuapp.com/dynamic_loading");
//Click on partial link text
driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]")).click();
//Click on start button
driver.findElement(By.id("start")).click();
//Fluent wait started
 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30));
        ((FluentWait<WebDriver>) wait).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class); 
        

	}

	private static void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}