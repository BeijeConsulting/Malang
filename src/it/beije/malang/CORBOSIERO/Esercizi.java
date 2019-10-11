package it.beije.malang.CORBOSIERO;

import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Esercizi {
	
	/***				FILES						***/
	public static void copyFile(File original, File copy) throws IOException {
		FileReader fileReader = new FileReader(original);
		FileWriter fileWriter = new FileWriter(copy);
		
		while (fileReader.ready()) {
			fileWriter.write((char)fileReader.read());
		}
		
		fileReader.close();
		fileWriter.close();
	}
	
	public static void copyFile(String path1, String path2) throws IOException {
		copyFile(new File(path1), new File(path2));
	}
	
	public static String getFileName(File f){
        String complete = f.getName();
        return complete.substring(0, complete.lastIndexOf("."));
    }

    public static String getFileExtension(File f){
        return f.getName().substring(f.getName().lastIndexOf(".") + 1);
    }

    public static String getFileContent(File f) throws IOException {
        return new String(Files.readAllBytes(Paths.get(f.getPath())), StandardCharsets.UTF_8);
    }

    public static List<String> getFileAsList(File f) throws IOException {
        return  Files.readAllLines(Paths.get(f.getPath()), StandardCharsets.UTF_8);
    }

	
	/***				CSV							***/
	public static void writeRow(File f, BufferedWriter writer, List<String> row, String separator) throws FileNotFoundException, IOException {
		StringBuilder sb = new StringBuilder();
		for(String el : row) 
			sb.append(el).append(separator);
		writer.write(sb.deleteCharAt(sb.length() - 1).append("\n").toString());
	}

	public static void writeRow(File f, BufferedWriter writer, List<String> row) throws FileNotFoundException, IOException {
		writeRow(f, writer, row, "");
	}
	
	public static void writeRow(File f, BufferedWriter writer, String[] row, String separator) throws FileNotFoundException, IOException {
		writeRow(f, writer, Arrays.asList(row), separator);
	}
	
	public static void writeRow(File f, BufferedWriter writer, String[] row) throws FileNotFoundException, IOException {
		writeRow(f, writer, Arrays.asList(row), "");
	}
	
	public static void writeFile(File f, List<String[]> rows, String separator) {
		
	}
	
	/***				DATABASE					***/
	
	
	/***				XML							***/
	
	
	/***				HIBERNATE					***/
	
	
	/***				JPA							***/

	public static void main(String[] args) {
		
	}

}
