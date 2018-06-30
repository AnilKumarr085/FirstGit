package day2_pack;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {
	public static void main(String arg[])
	{
		WebDriver driverFx=new FirefoxDriver();
		driverFx.manage().window().maximize();
		driverFx.get("https://www.amazon.com");
		List<WebElement> frame=driverFx.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		driverFx.switchTo().frame(0);
		System.out.println(driverFx.switchTo().frame(2).getTitle());
		driverFx.close();
		
			
	}

}
