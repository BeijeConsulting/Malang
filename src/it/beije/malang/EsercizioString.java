package it.beije.malang;

import java.util.Scanner;

public class EsercizioString {

	public static String reverseStr(String str) {
		char [] tempstr=new char[str.length()];
		int cont=0;
		for (int i=str.length()-1;i>-1;i--) {
			tempstr[cont++]=str.charAt(i);
		}
		return new String(tempstr);
	}
	
	public static String insertStr(int pos, String str,String insvalue) {
		String substrend=str.substring(pos);
		String substrstart=str.substring(0,pos);
		return substrstart+insvalue+substrend;
	}
	
	public static String deleteStr(String str, int pos, int end) {
		if (end<pos)
			return "Posizioni specificate impossibili";
		String substrstart=str.substring(0,pos);
		String substrend=str.substring(end);
		return substrstart+substrend;
	}
	
	public static String countVocalLetters(String str) {
		char[] vocals= {'a','e','i','o','u'};
		int [] count=new int[5];
		for (int i=0;i<str.length();i++) {
			for (int j=0;j<vocals.length;j++)
				if (str.charAt(i)==vocals[j])
					count[j]++;
		}
		StringBuilder result=new StringBuilder();
		for (int i=0;i<vocals.length;i++)
		{
			result.append("Vocale "+vocals[i]+":"+count[i]+'\n');
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println("Inserisci una scritta!");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseStr(str));
		System.out.println(insertStr(4,str,"hola"));
		System.out.println(deleteStr(str,3,6));
		System.out.println(countVocalLetters(str));
		sc.close();
	}

}
