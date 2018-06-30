package day2_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxWithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverFirefox=new FirefoxDriver();
		driverFirefox.manage().window().maximize();
		driverFirefox.get("http://opensource.demo.orangehrmlive.com/");
		driverFirefox.findElement(By.id("txtUsername")).sendKeys("Admin");
		driverFirefox.findElement(By.id("txtPassword")).sendKeys("admin");
		driverFirefox.findElement(By.id("btnLogin")).click();
		String ExpectedUrl="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
      
		if(driverFirefox.getCurrentUrl().equals(ExpectedUrl))
		{
			System.out.println("Login successful ");
			System.out.println(driverFirefox.getCurrentUrl()==ExpectedUrl);
			
		}
		else
			System.out.println("please enter valid credentials");
	}

}
