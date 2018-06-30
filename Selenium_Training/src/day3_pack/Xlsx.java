package day3_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File SF=new File("E:\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(SF);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i=0;i<=rows;i++)
		{
			int columns=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<columns;j++)
			{
				System.out.println("The date at "+i+" row and "+j+" column "+sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		wb.close();	
	}

}
