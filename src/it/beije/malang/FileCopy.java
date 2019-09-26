package it.beije.malang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FileCopy {

	public static void main(String[] args) throws IOException{
		File file=new File("C:\\prova\\java.jpg");
		File copia=new File("C:\\prova\\copiafile.jpg");
		
		if (!copia.exists()) {
			copia.createNewFile();
		}
		
		byte[] bytesArray=new byte[(int)file.length()];
		
		FileInputStream fis = new FileInputStream(file);
		fis.read(bytesArray); //read file into bytes[]
		fis.close();
		
		ByteArrayInputStream input=new ByteArrayInputStream(bytesArray);
		
		FileOutputStream output=new FileOutputStream(copia);
		
		int data;
		while((data=input.read())!=-1)
		{
			char ch = (char)data;
			output.write(ch);
		}
		output.flush();
		output.close();
	}

}
