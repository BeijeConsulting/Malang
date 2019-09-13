package it.beije.malang;
import java.util.ArrayList;

public class SortArrayHomemade {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1; j<list.size();j++) {
				if(list.get(i)<=list.get(j)) {}
				else {
					int x=list.get(i);
					int y=list.get(j);
					list.set(i, y);
					list.set(j, x);
				}	
			}
		}
		System.out.println(list);
	}
}
