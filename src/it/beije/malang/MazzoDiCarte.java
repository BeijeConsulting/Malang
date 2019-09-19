package it.beije.malang;

import java.util.ArrayList;
import java.util.Random;

public class MazzoDiCarte {
	private static String calculate(ArrayList<String> arr, String p1, String p2) {
		if (p1.equals(p2))
			return "parità";
		
		int p1index=arr.indexOf(p1);
		int p2index=arr.indexOf(p2);
		
		if (p1index<p2index) {
			return "p2 wins!";
		}
		else {
			return "p1 wins!";
		}
	}
	public static String getResult(String p1, String p2)
	{
		ArrayList<String> arr=new ArrayList<>();
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		arr.add("6");
		arr.add("7");
		arr.add("8");
		arr.add("9");
		arr.add("10");
		arr.add("J");
		arr.add("Q");
		arr.add("K");
		arr.add("A");
		
		if (arr.contains(p1)&&arr.contains(p2)) {
			return calculate(arr,p1,p2);
		}
		else {
		return "";
		}
	}

	public static void main(String[] args)
	{
		String[] lista = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		Random ronaldinho = new Random();
		int n = ronaldinho.nextInt(13);
		int n2 = ronaldinho.nextInt(13);
		System.out.println("p1 gioca " + lista[n]);
		System.out.println("p2 gioca " + lista[n2]);
		System.out.println(getResult(lista[n],lista[n2]));
		System.out.println("Created by Franceschellis");
		System.out.println("Committed by Vittoriellis");
	}

}
