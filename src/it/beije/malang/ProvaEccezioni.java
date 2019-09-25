package it.beije.malang;

import java.util.ArrayList;

public class ProvaEccezioni {
	public static void prova(ArrayList<Integer> arr) throws ArrayListIndexOutOfBoundsException {
		arr = new ArrayList<>();
		arr.add(5);
		try {
		arr.get(2);
		}catch(ArrayListIndexOutOfBoundsException e) {
			throw new ArrayListIndexOutOfBoundsException("Errore");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		prova(arr1);

	}

	
}
