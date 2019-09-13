package it.beije.malang;
import java.util.ArrayList;

public class EqualsHomeMade {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("ronaldinho");
		list.add("frenklin");
		ArrayList<String> list2= new ArrayList<String>(list);
		if(list.size()!=list2.size()) {System.out.println("sono diversi");}
		else {
			for(int i=0;i<list.size();i++) {
				if(list.get(i)!=list2.get(i)){System.out.println("sono diversi");}
				else {System.out.println("sono uguali");}
			}
		}
	}
}
