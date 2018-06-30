package testng;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class ParallelBrowserExec {

	WebDriver driver;

@Parameters("browser")
@BeforeTest
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox"))
		  driver=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\selenium jar\\chromedriver_win32\\chromedrivernew.exe");
			 driver=new ChromeDriver();
		}
		driver.get("http://newtours.demoaut.com");

	}
	
	@Test
	  public void Login() {
			driver.findElement(By.name("userName")).sendKeys("manzoor");
			driver.findElement(By.name("password")).sendKeys("manzoor");
			driver.findElement(By.name("login")).click();
			 String expectedTitle="Find a Flight: Mercury Tours:";
			 String actualTitle=driver.getTitle();
			 assertEquals(actualTitle, expectedTitle,"Login Failed");
			
		}
	@AfterTest
	public void close(){
		driver.navigate().to("http://www.amazon.com");
		driver.close();
	}
	
	@Test(dependsOnMethods="Login")
	public void login()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
}
