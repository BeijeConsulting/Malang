package it.beije.malang.esercizi;

import java.util.Scanner;

public class Calcoli {

	public static void main(String[] args) {
		
		System.out.println("1. per addizione");
		System.out.println("2. per sottrazione");
		System.out.println("3. per moltiplicazione");
		System.out.println("4. per divisione");
		
		Scanner sc = new Scanner(System.in);
		int scelta = sc.nextInt();
		
		switch(scelta)
		{
		case 1: 
				System.out.println("Quanti numeri vuoi sommare?");
				int addendi = 0;
				addendi=sc.nextInt();
				double [] addendi1 = new double[addendi];
				for (int i=0; i<addendi; i++)
				{
					System.out.print("numero"+(i+1)+": ");
					addendi1[i]=sc.nextDouble();
				}
				
				Calcolatrice.somma(addendi1);
				break;
				
		case 2:
				System.out.println("Quanti numeri vuoi sottrarre?");
				int numeri = 0;
				numeri=sc.nextInt();
				double [] numeri1 = new double[numeri];
				for (int i=0; i<numeri; i++)
				{
					System.out.print("numero"+(i+1)+": ");
					numeri1[i]=sc.nextDouble();
				}
			
				Calcolatrice.sottrazione(numeri1);
				break;
		
		case 3:
				System.out.println("Quanti numeri vuoi moltiplicare?");
				int multipli = 0;
				multipli=sc.nextInt();
				double [] multipli1 = new double[multipli];
				for (int i=0; i<multipli; i++)
				{
					System.out.print("numero"+(i+1)+": ");
					multipli1[i]=sc.nextDouble();
				}
			
				Calcolatrice.moltiplicazione(multipli1);
				break;
				
		case 4:
				System.out.println("Quanti numeri vuoi dividere?");
				int dividendi = 0;
				dividendi=sc.nextInt();
				double [] dividendi1 = new double[dividendi];
				for (int i=0; i<dividendi; i++)
				{
					System.out.print("numero"+(i+1)+": ");
					dividendi1[i]=sc.nextDouble();
				}
			
				Calcolatrice.divisione(dividendi1);
				break;
		
		}
		sc.nextInt();
		sc.close();
	}

}
