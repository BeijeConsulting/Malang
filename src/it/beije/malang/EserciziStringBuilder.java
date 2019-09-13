package it.beije.malang;
import java.lang.StringBuilder; // chiedere java.lang e java.util

public class EserciziStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ronaldinho");
		StringBuilder sb1 = new StringBuilder("Ronaldinho");
		System.out.println(sb.append("Frenklyn"));
		System.out.println(sb.length());
		System.out.println(sb.charAt(6));
		System.out.println(sb.insert(10, "-"));
		System.out.println(sb.delete(11, 19)); 
		System.out.println(sb.deleteCharAt(10));
		System.out.println(sb.reverse());
		String s = sb.toString();
		String r = "Ronaldinho";
		String n = s;
		System.out.println(sb.equals(sb1));
		System.out.println(sb == sb1);
		System.out.println(s.equals(r));
		System.out.println(s == r);
		System.out.println(s == n);
	}
}
