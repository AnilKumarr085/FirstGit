package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
 
    
	WebDriver driver;
	
	@Test
  public void Login() {
		driver.findElement(By.name("userName")).sendKeys("manzoor");
		driver.findElement(By.name("password")).sendKeys("manzoor");
		driver.findElement(By.name("login")).click();
		
	}
	
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
		
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
}
