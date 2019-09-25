package it.beije.malang;

import java.util.Random;

public class ScegliAttaccante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lista = {"Immobile","Caputo","Gervinho","Balotelli"};
		Random ronaldinho = new Random();
		int n1 = ronaldinho.nextInt(4);
		System.out.println(lista[n1]);
		int n2;
		do {
			n2 = ronaldinho.nextInt(4);
		}while(n2==n1);
		System.out.println(lista[n2]);
		int n3;
		do {
			n3 = ronaldinho.nextInt(4);
		}while(n3==n1  | n3==n1);
		System.out.println(lista[n3]);
		String[] x;
		x=lista;
		System.out.println(x);
	}

}
