package it.beije.malang;

import java.util.ArrayList;
import java.util.List;

public class EqualsOrNotEquals {

	public static void main(String[] args) {
		String s1 = "Pippo";
		String s2 = new String("Pippo");
		System.out.println("s1 == s2 ? " + (s1 == s2));//"s1 == s2 ? Pippo" == s2
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
		
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		//System.out.println("s1 == sb ? " + s1 == sb);
		System.out.println("s1.equals(sb1) ? " + s1.equals(sb1));
		System.out.println("sb1.equals(s2) ? " + sb1.equals(s2));
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		System.out.println("sb1.toString().equals(sb2.toString()) ? " + sb1.toString().equals(sb2.toString()));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Qui");
		list1.add("Quo");
		list1.add("Qua");
		List<String> list2 = new ArrayList<String>(list1);
		System.out.println("list1 == list2 ? " + (list1 == list2));
		System.out.println("list1.equals(list2) ? " + list1.equals(list2));
		List<String> list3 = new ArrayList<String>();
		list3.add(new String("Qui"));
		list3.add(new String("Quo"));
		list3.add(new String("Qua"));
		System.out.println("list1 == list3 ? " + (list1 == list3));
		System.out.println("list1.equals(list3) ? " + list1.equals(list3));
	}

}
