package it.beije.malang;

import java.util.ArrayList;
import java.util.List;

public class HelloMalang {

	public static void main(String[] args) {
		String s1="ciao";
		String s2="ciao";
		String s3= new String("ciao");
		StringBuilder s4 = new StringBuilder();
		s4.append(4);
		s4.append(5);
		s4.append(6);
		StringBuilder s5 = new StringBuilder();
		s5.append(4);
		s5.append(5);
		s5.append(6);
		StringBuilder s6 =s5;
		
		List <String> s7 =new ArrayList <String>();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		System.out.print("s4==s5            ");	System.out.println(s4==s5);
		System.out.print("s4 equals s5      ");	System.out.println(s4.equals(s5));
		System.out.print("s5 ==s6           "); System.out.println(s5==s6);
		System.out.print("s5 equals s6      ");	System.out.println(s5.equals(s6));
		
		
		
		
	}

}
