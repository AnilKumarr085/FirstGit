package day3_pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitOperation {
	public static void mainl(String g[])
	{
		WebDriver driverFx=new FirefoxDriver();
		driverFx.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverFx.get("http://newtours.demoaut.com/");
		driverFx.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driverFx,10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		driverFx.findElement(By.name("userName")).sendKeys("manzoor");
		driverFx.findElement(By.name("password")).sendKeys("manzoor");
		driverFx.findElement(By.name("login")).click();
		driverFx.close();
	}

}
