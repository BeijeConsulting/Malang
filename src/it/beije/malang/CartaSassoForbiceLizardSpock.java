package it.beije.malang;

import java.util.ArrayList;

public class CartaSassoForbiceLizardSpock {
	private static String calculate(ArrayList<String> arr, String p1, String p2) {
		if (p1.equals(p2))
			return "parità";
		
		int p1index=arr.indexOf(p1);
		int p2index=arr.indexOf(p2);
		
		
		
		if (p1index-p2index==1||p1index-p2index==-1) {
			if (p1index<p2index) {
				return "p1 wins!";
			}
			else
				return "p2 wins!";
		}
		else
		{
			if (p1index<p2index) {
				return "p2 wins!";
			}
			else
				return "p1 wins!";
		}
	}
	
	public static String getResult(String p1, String p2)
	{
		ArrayList<ArrayList<String>> array=new ArrayList<>();
		ArrayList<String> arr=new ArrayList<>();
		arr.add("carta");
		arr.add("sasso");
		arr.add("forbice");
		array.add(arr);
		arr=new ArrayList<>();
		arr.add("spock");
		arr.add("forbice");
		arr.add("lizard");
		array.add(arr);
		arr=new ArrayList<>();
		arr.add("sasso");
		arr.add("lizard");
		arr.add("carta");
		array.add(arr);
		arr=new ArrayList<>();
		arr.add("spock");
		arr.add("forbice");
		arr.add("carta");
		array.add(arr);
		
		for (ArrayList<String> value:array)
		{
			if (value.contains(p1)&&value.contains(p2)) {
				return calculate(value,p1,p2);
			}
		}
		return "";
	}
	
	public static void main(String[] args)
	{
		System.out.println(getResult("carta","carta"));
	}
}
