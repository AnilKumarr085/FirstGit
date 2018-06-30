package day2_pack;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {
	public static void main(String a[])
	{
	WebDriver driverFirefox=new FirefoxDriver();
	driverFirefox.get("http://www.newtours.demoaut.com/");
	driverFirefox.manage().window().maximize();
	List<WebElement> list=driverFirefox.findElements(By.tagName("a"));
	System.out.println("Number liks:"+list.size());
	ListIterator itr=list.listIterator();
	System.out.println(itr);
	driverFirefox.close();
	int i=0;
	while(i<list.size())
		System.out.println(list.get(i++).getText());
	}
}
