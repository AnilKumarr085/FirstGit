package day5_DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

		
		WebDriver driver;
	  @Test(dataProvider="dp")
	  public void dataProvider(String userName,String password) {
		  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		  driver.findElement(By.name("userName")).sendKeys(userName);
		  driver.findElement(By.name("password")).sendKeys("password");
		  driver.findElement(By.name("login")).click();
	  }
	  
	  
	  @DataProvider
	  public Object[][] dp(){
		  return new Object[][]{
			  new Object[]{"demo","demo"},
			  new Object[]{"mazoor","manzoor"},
		  };
	  }
	  
	  @BeforeTest
	  public void launchBrowser(){
		  driver =new FirefoxDriver();
	  }
	  
	  @AfterTest
	  public void browserShut(){
		  driver.close();
	  }
	}

