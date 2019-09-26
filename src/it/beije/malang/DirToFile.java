package it.beije.malang;
import java.util.*;
import java.io.*;


public class DirToFile {

	static Scanner t = new Scanner(System.in);
	
	public static void isPath(File f)
	{
		
		if(!f.list().equals("[]")) {
			String[] a = f.list();
		for(String b: a) {
			System.out.println(b);
			isPath(new File(f.getAbsolutePath().concat(b)));
			
		}
		}
			
	}
	public static void main(String[] args) {
	
		System.out.println("Inserire nome cartella");
		String path = t.nextLine();
		File f = new File(path);
		isPath(f);
		}
		
	}

