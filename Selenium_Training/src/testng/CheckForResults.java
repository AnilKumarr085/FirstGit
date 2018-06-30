package testng;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckForResults {
	WebDriver driver;
  @Test
  public void login() {
	 driver.findElement(By.name("userName")).sendKeys("demo");
	 driver.findElement(By.name("password")).sendKeys("demo");
	 driver.findElement(By.name("login")).click();
	 String expectedTitle="Find a Flight: Mercury Tours:";
	 String actualTitle=driver.getTitle();
	 assertEquals(actualTitle, expectedTitle,"Login Failed");
	 
  }
  @BeforeTest
  public void launch(){
	  driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
  }
  
  @AfterTest
  public void close(){
	  driver.close();
  }
}
