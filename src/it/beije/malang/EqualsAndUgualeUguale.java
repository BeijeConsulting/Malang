package it.beije.malang;
import java.util.*;

public class EqualsAndUgualeUguale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = "Pippo";
			String s2 = new String("Pippo");
			String s3 = new String(s1);
			System.out.println("s1==s2"+ (s1==s2));//senza le parentesi tonde concatenerebbe s1==s2?Pippo e si chiederebbe se siano uguali a s2
			System.out.println("s1.equals(s2)"+ s1.equals(s2));
			System.out.println("s1==s3"+ (s1==s3));
			System.out.println("s1.equals(s3)"+ s1.equals(s3));
			StringBuilder sb1 = new StringBuilder(s1);
			StringBuilder sb2 = new StringBuilder(sb1);
			//System.out.println("s1==sb"+ s1==sb);
			System.out.println("s1.equals(sb)"+ s1.equals(sb1));
			System.out.println("sb2.equals(sb1)"+ sb2.equals(sb1));
			List<String> list1 = new ArrayList<String>();
			list1.add("qui");
			list1.add("quo");
			list1.add("qua");
			List<String> list2 = new ArrayList<String>(list1);
			System.out.println("list1==list2"+ (list1==list2));//false
			System.out.println("list1.equals(list2)"+ list1.equals(list2));//true
			
			List<String> list4 = list1;
			System.out.println("list1==list4"+ (list1==list4));//true
			System.out.println("list1.equals(list4)"+ list1.equals(list4));//true
			
			List<String> list3 = new ArrayList<String>(list1);//se facessi quest utima cosa con gli stringbuilder
			//mi darebbe false anche l' ultimo. percheè farebbe equals tra due stringbuilder e quindi starei guardando i riferimenti
			list3.add(new String("qui"));
			list3.add(new String("quo"));
			list3.add(new String("qua"));
			System.out.println("list1==list3"+ (list1==list3));//false
			System.out.println("list1.equals(list3)"+ list1.equals(list3));//true
		
	}

}
