package day3_pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTabs {

	public static void main(String s[])
	{
		WebDriver driverFx=new FirefoxDriver();
		driverFx.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverFx.manage().window().maximize();
		driverFx.get("http:www.guru99.com");
		driverFx.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driverFx.get("http://newtours.demoaut.com/");
		driverFx.findElement(By.name("userName")).sendKeys("manzoor");
		driverFx.findElement(By.name("password")).sendKeys("manzoor");
		driverFx.findElement(By.name("login")).click();
		Actions action=new Actions(driverFx);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		System.out.println(driverFx.getTitle());
		
	}
}
