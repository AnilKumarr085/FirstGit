package day2_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleGame {

	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverFx=new ChromeDriver();
		driverFx.get("chrome://dino/");
		driverFx.findElement(By.tagName("div"));
		Actions action=new Actions(driverFx);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.SPACE);
		
	}
}
