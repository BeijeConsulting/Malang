package it.beije.malang;

import java.util.Arrays;

public class MyParser {
	
	public static int parseInt(String num) {
		int val = 0;
		int negative=1;
		if (num.startsWith("-")) {
			num=new StringBuilder(num).substring(1);
			negative=-1;
		}
		for (int i=0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c >= '0' && c <= '9') {
				val = (val*10) + (c - 48);
			} else {
				throw new IllegalArgumentException("il valore inserito non è numerico");
			}
		}
		return val*negative;
	}
	public static double parseDouble(String num) {
		double val = 0;
		int index=num.indexOf('.');
		if (index==-1)
		{
			return parseInt(num);
		}
		String[] arr=num.split("\\.");
		if (arr.length>2 || arr[0].equals("") || arr[1].equals(""))
			throw new IllegalArgumentException("il valore inserito non è valido");
		val=parseInt(arr[0]);
		for (int i=0;i<arr[1].length();i++)
		{
			if (arr[1].charAt(i)>='0' && arr[1].charAt(i)<='9')
				val+=(arr[1].charAt(i)-48)*Math.pow(10, -1*(arr[1].length()-(arr[1].length()-i-1)));
			else
				throw new IllegalArgumentException("il valore inserito non è numerico");
		}
		return val;
	}

	public static void main(String[] args) {
		//System.out.println(parseInt("5142"));
		
		System.out.println(parseDouble("56"));
		System.out.println(parseDouble("5.6"));
		System.out.println(parseDouble("53.76"));
		System.out.println(parseDouble("5.60"));
		System.out.println(parseDouble("54.6"));
		System.out.println(parseDouble("0.6"));
		System.out.println(parseDouble("-34.6"));
		try {
		System.out.println(parseDouble("5.6.8"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
		System.out.println(parseDouble(".56"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
		System.out.println(parseDouble("56."));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
