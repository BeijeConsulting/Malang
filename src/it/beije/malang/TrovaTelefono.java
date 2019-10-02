package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TrovaTelefono {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\prova_java_io\\corbosiero1.csv");
		System.out.println("il file è presente ? " + f.exists());
		
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		File output= new File("C:\\prova_java_io\\corbosieroordinato.txt");
		if (!output.exists()) {
			output.createNewFile();
		}
		
		BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(output));
		
		
		ArrayList<Contatti> contatto = new ArrayList<Contatti>();
		ArrayList<String> numero= new ArrayList<String>();
		
		System.out.println(numero.size());
		
		bufferedReader.readLine();
		
		while (bufferedReader.ready()) {
			
			String row = bufferedReader.readLine();
			//System.out.println(row);
			String[] cols = row.split(";");
			
			int index = numero.indexOf(cols[2]);
			//System.out.println("index : " + index);
			
			if(index != -1) {
				//System.out.println("found:"+cols[2]);
				contatto.get(index).addEmail(cols[3]);
			}
			else {
				//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>new:"+cols[2]);
				Contatti cont=new Contatti();
				cont.setNome(cols[0]);
				cont.setCognome(cols[1]);
				cont.setTelefono(cols[2]);
				cont.addEmail(cols[3]);
				contatto.add(cont);
				numero.add(cols[2]);
				
			}
			//System.out.println("code:"+index);
			//System.out.println(numero.size());
		}
		
		for(int i=0;i<contatto.size();i++) {
			StringBuilder rows = new StringBuilder("\"");
			rows.append(contatto.get(i).getCognome()).append('"');
			rows.append(';').append('"');
			rows.append(contatto.get(i).getNome()).append('"');
			rows.append(';').append('"');
			rows.append(contatto.get(i).getTelefono()).append('"').append('\n');
				
			for(int n =0; n<contatto.get(i).getEmail().size();n++) {
				rows.append(contatto.get(i).getEmail().get(n)).append('"');
				rows.append(';').append('"');
			}
			rows.append('\n');
			bufferedWriter1.write(rows.toString());
			
		}
		
	bufferedReader.close();
	bufferedWriter1.close();
	System.out.println("ho finito");
	}

}
