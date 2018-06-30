package day4_Pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFile {
		public static void main(String srg[]) throws IOException
		{
			File fobj=new File("E:\\TextFile.txt");
			fobj.createNewFile();
			if(fobj.canWrite())
			{
				String str="I'm Groot";
				FileOutputStream f=new FileOutputStream(fobj);
			
			}
				
		}
}
