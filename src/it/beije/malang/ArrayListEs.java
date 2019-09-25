package it.beije.malang;
import java.util.ArrayList;

public class ArrayListEs {
	public static void main(String[] args) {
//		Scanner myObj = new Scanner(System.in);  
//		System.out.println("inserisci lunghezza array");
//		int i = myObj.nextInt();		 
//		int[] arr = new int[i];
//		for(i = 0; i < arr.length; i++) {
//			System.out.println("inserisci numero");
//		    arr[i] = myObj.nextInt();
//		}
//		for(int scorri: arr) {
//		System.out.println(scorri);
//		}
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();		
		l1.add("ciao");
		l2.add("ciao");
		System.out.println(equalsArrayList(l1, l2));
		
		
		
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean equalsArrayList(ArrayList l1, ArrayList l2) {
		if(l1.size() != l2.size()) return false;
		for(int i = 0; i < l1.size(); i++) {
			if(! l1.get(i).equals(l2.get(i))) return false;
		}
		return true;
	}
	
	public static int[] sortArray(int[] l) {
		int temp;
		for(int i = 1; i < l.length; i++) {
			for(int j = i; j < l.length; j--) {
				if(l[j] < l[j-1]) {
					temp = l[j];
					l[j] = l[j-1];
					l[j-1] = temp;
				}	
			}

		}
		return l;
	}
}
