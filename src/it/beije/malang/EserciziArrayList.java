package it.beije.malang;
import java.util.*;
public class EserciziArrayList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("ronaldinho");
		String s= "frenklin";
		list.add(s);
		list.add("frenklin");
		list.remove("ronaldinho");
		list.remove(0);
		list.set(0,"ronaldinho");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		if(list.isEmpty()) {System.out.println("l'array list è vuota");}
		list.add(s);
		list.add("frenklin");
		list.clear();
		if(list.isEmpty()) {System.out.println("l'array list è di nuovo vuota");}
		if(list.contains("ronaldinho")==false) {System.out.println("ronny non c'è");}
		list.add("ronaldinho");
		list.add(s);
		ArrayList<String> list2= new ArrayList<String>(list);
		if(list.equals(list2)){System.out.println("ok");}
		if(list == list2){System.out.println("ok");}	
	}
}
