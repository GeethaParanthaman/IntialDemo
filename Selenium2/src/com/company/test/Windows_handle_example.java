package com.company.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_handle_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/");
		// click on multiple window link
		driver.findElement(By.partialLinkText("Multiple Windows")).click();

		// Click on link to navigate with child
		driver.findElement(By.cssSelector("div.example a")).click();
		System.out.println("Before iteration title is " + driver.getTitle());
		// iteration of parent & child window
		Set<String> idsGet = driver.getWindowHandles();
		Iterator<String> id = idsGet.iterator();
		String parent = id.next();
		String child = id.next();
		driver.switchTo().window(child);
		Thread.sleep(1000);
		System.out.println("child title is :" + driver.getTitle());

		driver.switchTo().window(parent);
		System.out.println("Child of window title is:" + driver.getTitle());

	}

}
