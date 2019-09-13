package it.beije.malang.universita;
import java.util.ArrayList;

public class Universita
{
			ArrayList<Esame> tuttiEsam = new ArrayList<Esame>();
			
			
			public ArrayList<Studente> ricerca(String materia)
			
			{
				
				ArrayList<Studente> list = new ArrayList<Studente>();
				
				
				for (int i=0;i<tuttiEsam.size();i++)
				{
					
					if(this.tuttiEsam.get(i).materia==materia && this.tuttiEsam.get(i).voto >= 18)
					{
						
						list.add(this.tuttiEsam.get(i).studente);
						System.out.println(this.tuttiEsam.get(i).studente.nome);
						
					}
				}
					
				
				return list;
				
			}
			
			
			
			
public boolean esisteStudente(String nome, String cognome)
{
	boolean esiste = false;
	
	
		for(int i=0;i<tuttiEsam.size();i++)
		{
			
			
				if (nome == tuttiEsam.get(i).studente.nome && cognome == tuttiEsam.get(i).studente.cognome)
					
				{
					
						esiste = true;
						
				}
		}
		
	return esiste;
}
}
