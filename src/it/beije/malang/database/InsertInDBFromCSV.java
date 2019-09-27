package it.beije.malang.database;

import java.util.ArrayList;
import java.util.List;

import it.beije.malang.Contatto;

public class InsertInDBFromCSV {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		for (Contatto contatto:contatti) {
			String insert = "INSERT INTO rubrica VALUES (null, '" 
					+ contatto.getCognome() 
					+ "', '"
					+ contatto.getNome()
					+"', '"
					+ contatto.getEmail() 
					+ "', '"
					+contatto.getTelefono()+
					"')";
		}
	}

}
