package day2_pack;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChecksLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverFx=new FirefoxDriver();
		driverFx.get("http://newtours.demoaut.com/");
		driverFx.manage().window().maximize();
	    List<WebElement> allLinks=driverFx.findElements(By.tagName("a"));
	    int numOfLinks=allLinks.size();
	    
	    for(int i=0;i<numOfLinks;i++){
	    	System.out.println(driverFx.getTitle());
	    }
	    String title="Under Construction: Mercury Tours";
	    
		   for(int i=0;i<numOfLinks;i++)
	    {
			  String link;
			try{
			link=allLinks.get(i).getText();
	    }catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
			link=allLinks.get(i).getText();
			driverFx.findElement(By.linkText(link)).click();
			System.out.println(driverFx.getTitle());
	    	if(driverFx.getTitle().equals(title))
	    		System.out.println("Under construction "+driverFx.findElement(By.linkText(allLinks.get(i).getText())));
	    	else
	    	System.out.println("Link working fine "+driverFx.getTitle());
	    	driverFx.navigate().back();
	   }
			
				driverFx.close();
	
}
}