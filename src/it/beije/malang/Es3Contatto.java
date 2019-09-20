package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Es3Contatto {
	private static boolean checkInput(String input)
	{
		if (input.equals("exit")||input.equals("/quit"))
			return false;
		else
			return true;
	}
	
	public static void main() throws IOException {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Contatto>contatti=new ArrayList<>();
		String input;
		do {
			Contatto contatto=new Contatto();
			System.out.println("Inserisci il nome");
			input=scanner.nextLine();
			if (!checkInput(input))
				break;
			contatto.setNome(input);
			System.out.println("Inserisci il cognome");
			input=scanner.nextLine();
			if (!checkInput(input))
				break;
			contatto.setCognome(input);
			System.out.println("Inserisci il telefono");
			input=scanner.nextLine();
			if (!checkInput(input))
				break;
			contatto.setTelefono(input);
			System.out.println("Inserisci l'email");
			input=scanner.nextLine();
			if (!checkInput(input))
				break;
			contatto.setEmail(input);
			contatti.add(contatto);
		}while(true);
	
		File copia=new File("C:\\prova\\copiaes3.csv");
		if (!copia.exists())
			copia.createNewFile();
		FileWriter fileWriter=new FileWriter(copia);
		BufferedWriter writer=new BufferedWriter(fileWriter);
		for (Contatto contatto:contatti)
		{
			writer.write(contatto.toString(3));
			writer.newLine();
		}
		writer.close();
	}
}
