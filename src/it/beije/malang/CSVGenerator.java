package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CSVGenerator {
	private ArrayList<String> names=new ArrayList<>();
	private ArrayList<String> surnames=new ArrayList<>();
	private ArrayList<String> phones=new ArrayList<>();
	private final String[] DOMAINS=new String[] {"it", "com", "net"};
	private File origin;
	
	public CSVGenerator(File file) throws IOException{
		origin=file;
		for (int i=0;i<10;i++) {
			names.add("");
			surnames.add("");
			phones.add("");
		}
		
		BufferedReader reader=new BufferedReader(new FileReader(origin));
		while(reader.ready()) {
			String arr[]=reader.readLine().split(";");
			names.add(arr[0]);
			surnames.add(arr[1]);
			phones.add(arr[2]);
		}
		reader.close();
		
	}
	
	public CSVGenerator(String path) throws IOException{
		this(new File(path));
	}
	
	private String makeEmail(String name, String surname, String domain) {
		if (name.equals(""))
			name=surname;
		if (surname.equals(""))
			surname="beije";
		return name+"@"+surname+"."+domain;
	}
	
	private String buildString(String name, String surname,String phone, String domain) {
		StringBuilder builder=new StringBuilder();
		builder.append(name).append(";");
		builder.append(surname).append(";");
		builder.append(makeEmail(name,surname,domain)).append(";");
		builder.append(phone);
		return builder.toString();
	}
	
	public void generateRandomCSV(String output,int num) throws IOException {
		generateRandomCSV(new File(output), num);
	}
	
	public void generateRandomCSV(File output,int num) throws IOException {
		if (!output.exists()) {
			output.createNewFile();
		}
		BufferedWriter writer=new BufferedWriter(new FileWriter(output));
		Random randomizer=new Random();
		for (int i=0;i<num;i++) {
			int nameindex=randomizer.nextInt(names.size());
			int surnameindex=randomizer.nextInt(surnames.size());
			int phoneindex=randomizer.nextInt(phones.size());
			int domainindex=randomizer.nextInt(DOMAINS.length);
			writer.write(buildString(names.get(nameindex),surnames.get(surnameindex),phones.get(phoneindex),DOMAINS[domainindex]));
			writer.newLine();
		}
		writer.close();
	}
	
}
