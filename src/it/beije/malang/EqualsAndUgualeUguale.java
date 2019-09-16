package it.beije.malang;

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
	}

}
