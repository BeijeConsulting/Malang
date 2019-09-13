package it.beije.malang;

public class SuccessioneDiFibonacci {
	

	public static void main(String[] args) {
		int n=1;
		int[] vettore = new int[25];
		for (n=1;n<=25;n++) {
			if (n==1) {
				vettore[n-1]=n;
				System.out.print(vettore[n-1]);
			}
			else if(n==2) {
				vettore[n-1]=2;
				System.out.print(vettore[n-2]+" "+ vettore[n-1]);
			}
			else {
				vettore[n-1]=vettore[n-2]+vettore[n-3];
				
				for (int j=n;j>=1;j--) {
				System.out.print(vettore[n-j]+" ");
				}
			}
		System.out.print('\n');
		}
	
	}
}



