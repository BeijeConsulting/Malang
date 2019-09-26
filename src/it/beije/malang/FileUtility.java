package it.beije.malang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


//@todo fare anche la copia di file non di testo

/*I comandi disponibili sono: cd, start, del, mkdir, rmdir, exit*/

public class FileUtility {
	
	private static Command checkCommand(String input) {
		String cmds[]=input.split(" ");
		if (cmds.length!=2)
			if (!input.startsWith("exit")&&!input.startsWith("EXIT"))
				throw new IllegalArgumentException("formato input errato");
		Command command=new Command();
		switch(cmds[0]) {
		case "cd":
		case "CD":
			command.setCmdId(1);
			break;
		case "start":
		case "START":
			command.setCmdId(2);
			break;
		case "del":
		case "DEL":
			command.setCmdId(3);
			break;
		case "mkdir":
		case "MKDIR":
			command.setCmdId(4);
			break;
		case "mrdir":
		case "MRDIR":
			command.setCmdId(5);
			break;
		case "exit":
		case "EXIT":
			command.setCmdId(0);
			break;
		default:
			throw new IllegalArgumentException("formato input errato");
		}
		if (command.getCmdId()!=0)
			command.setArgument(cmds[1]);
		return command;
	}

	public static void main(String[] args){
		String currentPath="C:\\";
		File pointer=new File(currentPath);
		for (String arg:pointer.list()) {
			System.out.println(arg);
		}
		Scanner scanner=new Scanner(System.in);
	OUTER:while(true) 
		{
			String input=scanner.nextLine();
			Command command;
			
			try {
			command=checkCommand(input);
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
				continue;
			}
			switch(command.getCmdId()) 
			{
				case 0:
					break OUTER;
				case 1:
					String temppath=currentPath;
					if (pointer.getParent()!=null && currentPath.equals("C:\\")) {
						currentPath=pointer.getParent()+command.getArgument();
						System.out.println("ciao");
					}
					else {
						currentPath+="\\"+command.getArgument();
						System.out.println("bellas");
					}
					try {
					pointer=new File(currentPath);
					for (String arg1:pointer.list()) {
						System.out.println(arg1);
					}
					}catch(NullPointerException e) {
						if (!pointer.exists())
						{
							System.out.println("La cartella selezionata non esiste");
							currentPath=temppath;
						}	
						//e.printStackTrace();
					}
					System.out.println(currentPath);
					break;
				case 2:
					try {
					BufferedReader reader=new BufferedReader(new FileReader(currentPath+"\\"+command.getArgument()));
					while (reader.ready()) {
						System.out.println(reader.readLine());
					}
					}catch (IOException e) {
						System.out.println("File non trovato");
						//e.printStackTrace();
					}
					break;
				case 3:
					File file=new File(currentPath+"\\"+command.getArgument());
					if (file.delete())
						System.out.println("File eliminato con successo");
					else
						System.out.println("Impossibile eliminare il file");
					break;
				case 4:
					file=new File(currentPath+"\\"+command.getArgument());
					if (file.mkdir())
						System.out.println("Cartella creata con successo");
					else
						System.out.println("Impossibile creare la cartella");
					break;
				case 5:
					
						
					
			}
		}
		scanner.close();
	}
	
}
