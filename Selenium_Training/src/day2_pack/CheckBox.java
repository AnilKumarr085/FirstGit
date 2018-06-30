package day2_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driverFirefox=new FirefoxDriver();
      driverFirefox.manage().window().maximize();
      driverFirefox.get("http://newtours.demoaut.com/");
  	  driverFirefox.findElement(By.name("userName")).sendKeys("demo");
      driverFirefox.findElement(By.name("password")).sendKeys("demo");
      driverFirefox.findElement(By.name("login")).click();
      driverFirefox.findElement(By.name("findFlights")).click();
      driverFirefox.findElement(By.name("reserveFlights")).click();
      driverFirefox.findElements(By.name("ticketLess"));
      List<WebElement> list= driverFirefox.findElements(By.name("ticketLess"));
      
      if ( !driverFirefox.findElement(By.name("ticketLess")).isSelected() )
      {
           driverFirefox.findElement(By.name("ticketLess")).click();
      }

      
	}

}
