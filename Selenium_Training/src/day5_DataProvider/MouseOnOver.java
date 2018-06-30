package day5_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class MouseOnOver {

	public static void main(String arg[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link_Home=driver.findElement(By.linkText("REGISTER"));
		Actions builder=new Actions(driver);
		Action mouseoverhome=builder.moveToElement(link_Home).build();
		mouseoverhome.perform();
		builder.sendKeys(link_Home,(Keys.ENTER)).perform();
	}
}
