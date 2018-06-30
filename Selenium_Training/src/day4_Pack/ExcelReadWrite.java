package day4_Pack;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.write.Label;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException, BiffException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		File fexcel=new File("E:\\Testigfile.xls");
	
		WritableWorkbook writebook=Workbook.createWorkbook(fexcel);
		writebook.createSheet("Gani", 0);
		WritableSheet writesheet=writebook.getSheet(0);
		Label data=null;
		data=new Label(0,0,"Manoors");
		writesheet.addCell(data);
		writebook.createSheet("Mani", 1);
		WritableSheet writesheet1=writebook.getSheet(1);
		data=new Label(0,8,"Mangalore");
		writesheet1.addCell(data);
		writebook.write();
		writebook.close();
		
	
		Workbook workbook=Workbook.getWorkbook(new File("E:\\Testigfile.xls"));
		Sheet sheet=null;
		int noOfSheets=workbook.getNumberOfSheets();
		Cell cells=null;
		for(int p=0;p<noOfSheets-1;p++)
		{
			sheet=workbook.getSheet(p);
			int noOfRows=sheet.getRows();
			int noOfColumns=sheet.getColumns();
			System.out.println("Data from sheet-->"+p);
			for(int i=0;i<noOfRows;i++)
			{
				for(int j=0;j<noOfColumns;j++)
				{
					cells=sheet.getCell(j,i);
					if(cells.getContents().length()>0)
					{
						System.out.println(cells.getContents());
						
					}
				}
				workbook.close();
			}
		}
		
		

	}

}
