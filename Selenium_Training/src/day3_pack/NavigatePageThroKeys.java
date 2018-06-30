package day3_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class NavigatePageThroKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driverFx=new FirefoxDriver();
		driverFx.manage().window().maximize();
		driverFx.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		System.out.println(driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).isDisplayed());
		driverFx.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		System.out.println(driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).isDisplayed());
		driverFx.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		System.out.println(driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).isDisplayed());
		driverFx.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		/*while(!driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).isDisplayed())
		{
		driverFx.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		System.out.println(driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).isDisplayed());
		}*/
		driverFx.findElement(By.cssSelector("button[onclick=\'pushAlert()\']")).click();
		
		String s=driverFx.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(3000);
		driverFx.switchTo().alert().accept();
	
		driverFx.close();

	}

}
