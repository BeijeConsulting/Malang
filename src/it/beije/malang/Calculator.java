package it.beije.malang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	
	public static String showHistory(ArrayList<String> list) {
		StringBuilder res=new StringBuilder();
		for (String str:list)
		{
			res.append(str+'\n');
		}
		return res.toString();
	}
	
	public static double calculate(String str) {
		int i=0;
		double first;
		double second;
		double result=Double.MIN_VALUE;
		if (str.indexOf('+')!=-1)
		{
			i=str.indexOf('+');
			first=Double.parseDouble(str.substring(0, i));
			second=Double.parseDouble(str.substring(i+1));
			result=first+second;
			
		}
		else
			if (str.indexOf('-')!=-1)
			{
				i=str.indexOf('-');
				first=Double.parseDouble(str.substring(0, i));
				second=Double.parseDouble(str.substring(i+1));
				result=first-second;
			}
			else
				if (str.indexOf('*')!=-1)
				{
					i=str.indexOf('*');
					first=Double.parseDouble(str.substring(0, i));
					second=Double.parseDouble(str.substring(i+1));
					result=first*second;
				}
				else
					if (str.indexOf('/')!=-1)
					{
						i=str.indexOf('/');
						first=Double.parseDouble(str.substring(0, i));
						second=Double.parseDouble(str.substring(i+1));
						result=first/second;
					}
		return result;
	}

	public static void main(String[] args) {
		
		/*Scanner scanner=new Scanner(System.in);
		String str;
		do {	
			System.out.println("Inserisci i numeri da calcolare o scrivi 'storico' per visualizzare le operazioni precedenti");
			str=scanner.nextLine();
			if (str.equals("storico")) {
				System.out.println(showHistory(list));
				continue;
			}
			list.add(str);
			double res=calculate(str);
			System.out.println("Il risultato è:"+res);
		}while(!str.equals("exit"));
		scanner.close();
		*/
		
		
		
		StringBuilder str1=new StringBuilder();
		String str=new String("cazzo");
		ArrayList list=new ArrayList();
		list.add(str1);
		list.add(str);
		list.add(7);
		
		str=null;
		str1=null;
		
		System.out.println(list.get(0).getClass());
		System.out.println(list.get(1).getClass());
		System.out.println(list.get(2).getClass());
	}

}
