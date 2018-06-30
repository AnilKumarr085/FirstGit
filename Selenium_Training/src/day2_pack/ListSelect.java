package day2_pack;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverFirefox=new FirefoxDriver();
		driverFirefox.manage().window().maximize();
		driverFirefox.get("http://newtours.demoaut.com");
		driverFirefox.findElement(By.linkText("REGISTER")).click();
		WebElement country=driverFirefox.findElement(By.name("country"));
		Select countryname=new Select(country);
		countryname.selectByValue("5");
		List<WebElement> countrynames=countryname.getOptions();
		System.out.println(countrynames.toString());
		ListIterator it=countrynames.listIterator();
	
      System.out.println(it);
		
		
		driverFirefox.close();
		
		

	}

}
