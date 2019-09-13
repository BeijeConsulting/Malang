package it.beije.malang.universita;
import java.util.ArrayList;

public class Studente extends Persona
{
		int matricola;
		final int valido = 18;
		ArrayList<Esame> listaesami = new ArrayList<Esame>();
		
		
		public void AggEsame(Esame esame)
		{
			if (esame.voto>=valido)
			{
				this.listaesami.add(esame);
			}
			else
			{
				System.out.println("Esame non superato");
			}
		}
		
		
		
		
		public double Media(Studente studente)
		{
			double somma=0;
			double media=0;
			int cont=0;
			
			for (int i=0;i<studente.listaesami.size();i++)
			{
				somma=somma+studente.listaesami.get(i).voto;
				cont++;
			}
			
			return media = somma/cont;
		}
		
		
		
		
		public double dammiVotoEsame (Materia m)
		{
			double voto=0;
			
			for (int i=0;i<listaesami.size();i++)
			{
				if (m.materia==listaesami.get(i).materia)
					
				{
					voto = listaesami.get(i).voto;
				}
				
			}
			
			return voto;
		}
		
	
	
}
