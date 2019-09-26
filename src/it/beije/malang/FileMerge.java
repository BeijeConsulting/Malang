package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileMerge {
	
	public static void uniscifile() {

		File file1 = new File("C:\\temp\\file1.txt");
		try {
			FileReader fileReader1 = new FileReader(file1);
		} catch (FileNotFoundException e) {
			System.out.println("il file inserito non esiste");
		}

	}

	public static void main(String[] args) {
		uniscifile();
	}

}
	