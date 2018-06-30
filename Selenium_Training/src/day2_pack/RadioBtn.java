package day2_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtn {
public static void main(String arg[])
{
	WebDriver driverFirefox=new FirefoxDriver();
	driverFirefox.manage().window().maximize();
	driverFirefox.get("http://newtours.demoaut.com/");
	driverFirefox.findElement(By.name("userName")).sendKeys("demo");
	driverFirefox.findElement(By.name("password")).sendKeys("demo");
    driverFirefox.findElement(By.name("login")).click();
    System.out.println("I'm Gani");
    driverFirefox.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
    driverFirefox.findElement(By.name("findFlights")).click();
}

}
