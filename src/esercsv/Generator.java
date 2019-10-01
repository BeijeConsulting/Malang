package esercsv;
import java.io.*;
import java.util.*;

public class Generator {
	

	static Random random = new Random();
	
	static String getEmail(String nome, String cognome, String dominio) {
		return nome + "@" + cognome + "." + dominio;}
	
		public static void main(String[] args) throws IOException {
		String[] dom = {"it", "com", "net"};

//		Random r = new Random();
//		int[] fiveRandomNumbers = r.ints(5, 0, 11).toArray();
//		int randomNumber = r.ints(1, 0, 11).findFirst().getAsInt();
		
		String[] randomize= {"a","b","c","d","e","f","g","h","i","l","m","n","o","p","q","r","s","t","u","v","z","1","2","3","4","5","6","7","8","9"};
		
		List<String> nome = new ArrayList<String>();
		List<String> cognome = new ArrayList<String>();
		List<String> telefono = new ArrayList<String>();
		
		File file1=new File("C:/prova/generato.csv");	
		FileReader fileReader = new FileReader(file1);
		BufferedReader bReader = new BufferedReader(fileReader);
		
		FileWriter fileWriter = new FileWriter("C:/prova/5milioni2.csv");
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		

		
		
		String PRIMARIGA ="COGNOME;NOME;TELEFONO;EMAIL;RANDOMICO\n";
		bWriter.write(PRIMARIGA);
		
		StringTokenizer tokenizer = null;
		
		while (bReader.ready()) {
			tokenizer = new StringTokenizer(bReader.readLine(), ";");	
			nome.add(tokenizer.nextToken());
			cognome.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());
		}
		for(int i = 0; i < 10; i++) {
			nome.add("");
			cognome.add("");
			telefono.add("");
		}	
		bReader.close();


		for(int i = 0; i < 5000000; i++) {
			StringBuilder riga = new StringBuilder("");
			
			int nomeRandom = random.nextInt(nome.size());
			int cognomeRandom = random.nextInt(cognome.size());
			int telefonoRandom = random.nextInt(telefono.size());
			int dominio = random.nextInt(3);
		// 	int rand = random.nextInt(21);
			
			String cog;
			String nom;

			
			
			if(!cognome.get(cognomeRandom).equals(""))	
				cog=cognome.get(cognomeRandom);
			
			else 
				cog= "beije";
			
			if(!nome.get(nomeRandom).equals("")) {
				nom = nome.get(nomeRandom);
			}else {
				nom = cog;
			}
			riga.append(cognome.get(cognomeRandom));
			riga.append(";").append(nome.get(nomeRandom));
			riga.append(";").append(telefono.get(telefonoRandom)).append(";");
			riga.append(getEmail(nom,cog, dom[dominio])).append(";");
			
			for(int j=0;j<10;j++) {
			riga.append(randomize[random.nextInt(30)]);
			}
			riga.append("\n");
			
			bWriter.write(riga.toString());
		}
			
				
		bWriter.close();
		}

	}
	


