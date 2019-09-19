package it.beije.malang.esercizi;

public class Calcolatrice {
	
		public static void somma (double... num)
		{
			if (num.length<=1)
			{
				System.out.println("Non hai inserito numeri sufficienti per una somma");
			}
			else
			{
			double somma=0;
			for (int i = 0; i<num.length;i++)
			{
				somma += num[i];
			}
			
			System.out.println("La somma e': " +somma);
			}
			
		}
		
		public static void sottrazione (double... num)
		{
			if (num.length<=1)
			{
				System.out.println("Non hai inserito numeri a sufficienza per la sottrazione");
			}
			else
			{
				double tot=num[0];
				for (int i=1; i<num.length;i++)
				{
					tot -= num[i];
				}
				System.out.println("Il risultato e': " + tot);
			}
		}
		
		public static void moltiplicazione (double... num)
		{
			if (num.length<=1)
			{
				System.out.println("Non hai inserito numeri a sufficienza");
			}
			else
			{
				double tot=num[0];
				for (int i=1; i<num.length; i++)
				{
					tot = tot * num[i];
				}
				System.out.println("Il risultato della moltiplicazione e': " + tot);
			}
		}
		
		public static void divisione (double... num)
		{
			double tot=num[0];
			if (num.length<=1)
			{
				System.out.println("Non hai inserito numeri a sufficienza");
			}
			else if (num[0]<num[1])
			{
				System.out.println("Il divisore è minore del dividendo");
			}
			else
			{
				for (int i=1; i<num.length;i++)
				{
					tot = tot/num[i];
				}
			}
			System.out.println("Il risultato e': " + tot);
		}

}
