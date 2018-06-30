package first;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class WebElement {

	public static void main(String srg[]) throws IOException, InterruptedException
	{
		WebDriver driverFirefox=new FirefoxDriver();
		File SF=new File("E:\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(SF);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		driverFirefox.get("http://opensource.demo.orangehrmlive.com");
		driverFirefox.manage().window().maximize();
		int row=sheet.getLastRowNum();
		for(int i=0;i<=row;i++)
		{ 
		int col=sheet.getRow(i).getLastCellNum();
		for(int j=1;j<col;j=j+2)
		{
			try{
				
		driverFirefox.findElement(By.id("txtUsername")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
		driverFirefox.findElement(By.id("txtPassword")).sendKeys(sheet.getRow(i).getCell(j+1).getStringCellValue());
		driverFirefox.findElement(By.id("btnLogin")).click();
		driverFirefox.findElement(By.id("welcome")).click();
		Thread.sleep(4000);
		driverFirefox.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
		}
		catch(Exception e)
		{
			System.out.println("invalid credentials  ");
		}
		}
		wb.close();
		//driverFirefox.close();
	}
		
}
}