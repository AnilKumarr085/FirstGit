package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\selenium jar\\IEDriverServer.exe");
       // WebDriver driverFirefox=new FirefoxDriver();
        //driverFirefox.get("http://www.google.com");
       // WebDriver driverChrome=new ChromeDriver();
        //driverChrome.get("http://www.amazon.in");
		WebDriver driverIE=new InternetExplorerDriver();
        driverIE.get("http://www.google.com");
	}

}
