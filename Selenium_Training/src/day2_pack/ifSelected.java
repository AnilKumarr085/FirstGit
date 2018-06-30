package day2_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ifSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverFx=new FirefoxDriver();
		driverFx.manage().window().maximize();
		driverFx.get("http://newtours.demoaut.com");
		if(driverFx.findElement(By.name("userName")).isDisplayed())
		{
			System.out.println("userName textbox is displayed");
		}else
			System.out.println("username textbox is not displayed");
		if(driverFx.findElement(By.name("password")).isEnabled())
		{
			System.out.println("password is enabled");
		}else
			System.out.println("password is disabled");
		driverFx.findElement(By.name("userName")).sendKeys("manzoor");
		driverFx.findElement(By.name("password")).sendKeys("manzoor");
		driverFx.findElement(By.name("login")).click();
		if(driverFx.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
		{
			System.out.println("roundtrip is selected and enjoy the trip");
			driverFx.findElement(By.xpath("//*[@value='oneway']")).click();	
		}else
			System.out.println("roundtrip is not selected");
		driverFx.close();
	}

}
