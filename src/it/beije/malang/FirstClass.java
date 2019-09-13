package it.beije.malang;


public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		if(x<1) {
			System.out.println(args[0]);
		}
		
		int i=0;
		while (i<args.length) {
			System.out.println(args[i]);
			i++;
		}
		
		int j=0;
		do {
			System.out.println(args[j]);
			j++;
		} while (j<3);
		
		for(int n=0; n<args.length;n++) {
			System.out.println(args[n]);
		}
		
		for(String s: args) {
			System.out.println(s);
		}
	}

}

