package Certificates_Https;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Certificate_SSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities desireCapabilities=DesiredCapabilities.firefox();
		//desireCapabilities.acceptInsecureCerts();
		//we can select either acceptInsecureCerts() or we can set as per below
		//setting capabilities
		//SSL 
		desireCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		//Insecure->Like cortex-->directly unable to open
		desireCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
//SSL  certificates
		FirefoxOptions ffOptions=new FirefoxOptions();
		ffOptions.merge(desireCapabilities);
		
		//Normal flow we can continue
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(ffOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}