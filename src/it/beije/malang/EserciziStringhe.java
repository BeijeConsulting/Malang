package it.beije.malang;

public class EserciziStringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b = 98;
		int x = 98;
		String s = args[0].concat(args[1]);
		String l = new String("ronaldinhofrenklin");
		String a=null;
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('h'));
		System.out.println(s.substring(3, 7));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(l));
		String m = s.toUpperCase();
		System.out.println("attenzione");
		System.out.println(m.equals(l));
		System.out.println(m.equals(a));
		
		System.out.println(s.equalsIgnoreCase(l));
		s = m.toLowerCase();
		System.out.println(s);
		System.out.println(s.startsWith("r"));
		l="";
		l+=s.charAt(0);
		System.out.println("ronaldinhofrenklin".startsWith(l));
		System.out.println(s.contains("onaldinhofr"));
		System.out.println(s.replace('o','O'));
		l = ("\t"+"    "+s+"\n");
		System.out.println(l);
		System.out.println(l.trim());
		System.out.println(b);
	}

}
