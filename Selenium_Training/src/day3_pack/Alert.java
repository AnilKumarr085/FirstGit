package day3_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverFx=new FirefoxDriver();
		driverFx.get("http://output.jsbin.com/usidix/1");
		driverFx.findElement(By.cssSelector("//input[button=\'Go!\']")).click();
		String message=driverFx.switchTo().alert().getText();
		System.out.println(message);
		driverFx.switchTo().alert().accept();
	}

}
