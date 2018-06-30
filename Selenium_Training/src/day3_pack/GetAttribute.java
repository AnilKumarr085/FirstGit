package day3_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {
	public static void main(String arg[])
	{
		WebDriver driverFx=new FirefoxDriver();
		driverFx.get("http://newtours.demoaut.com");
		driverFx.findElement(By.linkText("REGISTER")).click();
		String countryValue=driverFx.findElement(By.name("country")).getAttribute("value");
		System.out.println("default value present in country listbox is "+countryValue);
		driverFx.close();
		
	}

}
