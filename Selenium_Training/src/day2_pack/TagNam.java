package day2_pack;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNam {

	public static void main(String[] args)
	{
		WebDriver  driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> List=driver.findElements(By.tagName("a"));
	/*find elements returns the list of elements*/
		System.out.print("number of links on screen="+List.size());
		for(int i=0;i<List.size();i++)
		{
			System.out.println(List.get(i).getText());
					
		}

        String[] linkTexts = new String[List.size()];							
			int	i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : List) {							
			linkTexts[i] = e.getText();							
			System.out.println(linkTexts[i]);
			i++;
        }		

			//test each link		
			for (String t : linkTexts) {		
				System.out.println("im gani"+t);
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals("Under Construction: Mercury Tours"))
			{							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();		
	}
}
