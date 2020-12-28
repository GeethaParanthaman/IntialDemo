package com.company.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ecart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		Thread.sleep(1000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[2]/form/input")).sendKeys("cucu");
		
		// cart button xpath="//button[@text()='ADD TO CART'"
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int i;

		for (i = 0; i < product.size(); i++) {

			String productName = product.get(i).getText();
			if (productName.contains("Cucumber"))

			{
				driver.findElements(By.xpath("//button[@text()='ADD TO CART'")).get(i).click();
				break;

			}
		}

	}
}
