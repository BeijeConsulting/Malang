package it.beije.malang.universita;
public class Test 
{

	public static void main(String[] args) 
	{
			Studente s1 = new Studente();
			s1.nome="Antonio";
			s1.cognome="Riccio";
			s1.eta=21;
			s1.matricola=01;
			
			
			Studente s2 = new Studente();
			s2.nome="Gennaro";
			s2.cognome="Ferrara";
			s2.eta=22;
			s2.matricola=02;
			
			
			

			Esame e1 = new Esame();
			e1.studente=s1;
			e1.materia="Informatica";
			e1.voto=30;
			
			
			
			Esame e2 = new Esame();
			e2.studente=s2;
			e2.materia="Matematica";
			e2.voto=20;
			
			
			
			Materia m1 = new Materia();
			m1.materia="Informatica";
			
			
			s1.AggEsame(e1);
			s2.AggEsame(e2);
		
			Universita ric = new Universita();
			ric.tuttiEsam.add(e1);
			ric.tuttiEsam.add(e2);
			
			ric.ricerca("Matematica");
			
			s1.Media(s1);
			System.out.println(s1.Media(s1));
			
			s1.dammiVotoEsame(m1);
			System.out.print(s1.dammiVotoEsame(m1));
			
			ric.esisteStudente("Gennaro", "Ferrara");
			System.out.println(ric.esisteStudente("Gennaro","Ferrara"));
		

	}

}
