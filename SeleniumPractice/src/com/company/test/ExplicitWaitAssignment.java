package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.ie.driver","C:\\Program Files\\IEDriverServer.exe");
//WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//urlto navigate
driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
//Thread.sleep(10000);

WebDriverWait explicitwait=new WebDriverWait(driver, 15);
explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));

System.out.println(driver.findElement(By.id("results")).getText());
	}

}
