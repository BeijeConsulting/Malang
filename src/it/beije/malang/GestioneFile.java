package it.beije.malang;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class GestioneFile {

	//lavorare sui file
	
	public static void main(String[] args) throws Exception{
		
		//può essere o meno sul disco. sto instanziano un nuovo oggetto file dando al costruttore il percorso del file
		File f = new File("percorso di dove si trova l'oggetto"); 
		
		// mi dice se il file esiste oppure no
		System.out.println(f.exists()); 		
		
		//serve lettura di un file
		FileReader fileReader = new FileReader(f);
		
		//posso fare un ciclo while per fargli leggere tuttti i caratteri, ma è molto scomodo
		fileReader.read();//mi legge solamente il primo carattere ma come intero. quindi dovrei castare a char con (char)reader.read()
		
		//mi permette di leggere un file per intero
		BufferedReader bufferedReader = new BufferedReader(fileReader);// prima importo(accedo) al file (con new File) poi lo rendo 
		//accessibile in lettura col FileReader (potrei leggerlo ma con una struttura in piu ho piu metodi) poi con questo posso 
		//leggere quello che voglio.
		//in questo modo ho creato una struttura a strati
		
		//ciclo che mi permette di leggere ogni riga
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}
		
		//copiare un file
		FileWriter fileWriter = new FileWriter(f); // potrei passargli anche direttamente la posizione in memoria
		
		//ciclo che mi permette di ricopiare tutto un file
		while (fileReader.ready()) {
			fileWriter.write((char)fileReader.read());
		}
		
		//necessario chiuderlo se no resta appeso in memoria finchè gira il programma e non fa fare altre operazioni
		//(le fa ma sbagliate, in scrittura mi avrebbe scritto un file vuoto)
		fileReader.close();
		fileWriter.close();
		
	}
}