package it.beije.malang;

import java.util.ArrayList;

public class ProvaException {
	
	private static void showArray(ArrayList<String> roba, ArrayList<String> roba1) throws IndexOutOfBoundsException,NullPointerException{
		/*Dimostrazione di come se l'exception viene tirata dal metodo, non continua la sua esecuzione, il codice "IndexOutOfBoundsException" 
		non verrà mai eseguito, si ferma e torna al main dove viene gestita l'eccezione*/
		
		//NullPointerException
		System.out.println(roba1.get(0));
		//IndexOutOfBoundsException
		for (int i=0;i<roba.size()+1;i++) {
			System.out.println(roba.get(i));
		}
	}
	
	public static void main(String [] args)
	{
		/*Le exception funzionano col concetto di ereditarietà, La questione serve per capire l'ordine in cui le exception vanno messe, prima le piu
		 specifiche, ad esempio "IndexOutOfBoundsException" va prima di "RuntimeException" perchè la prima eredita dalla seconda, se no da compiler error*/
		try {
			System.out.println("ciao");
			ArrayList<String> array=new ArrayList<String>();
			array.add("weeee");
			array.add("franklin");
			showArray(array,null);
		}
		catch (NullPointerException i) {
			System.out.println("lol1");
		}
		catch (IndexOutOfBoundsException i) {
			System.out.println("lol");
		}
		catch (RuntimeException re){
			System.out.println("ei scemo");
		}
		catch(Exception e) {
			System.out.println("bella");
		}
		finally {
			System.out.println("finito");
		}
		System.out.println("dopo il finally succede qualcosa?");
	}
}
