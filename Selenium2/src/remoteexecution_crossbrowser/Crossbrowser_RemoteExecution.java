package remoteexecution_crossbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Crossbrowser_RemoteExecution {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.122:4444/wd/hub"),dc);
	/*Hub url "http://192.168.0.122:4444
		add with above WEBDRIVER-->wd
		hub 
		
		*/
		
		//after this part usual operation we can perform
		
		

	}

}
