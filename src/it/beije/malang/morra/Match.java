package it.beije.malang.morra;

import java.util.Scanner;

public class Match {
		public static void main (String[] args)
		{
			Giocatore g1 = new Giocatore();
			Giocatore g2 = new Giocatore();
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Giocatore uno scegli la tua mossa: ");
			
			g1.mossa=sc.next();
			g1.mossa=g1.mossa_Valida(g1.mossa);
			
			if(Mosse.valido)
			{
			System.out.print("Giocatore due scegli la tua mossa: ");
			g2.mossa=sc.next();
			g2.mossa=g2.mossa_Valida(g2.mossa);
			
			if(Mosse.valido)
			Mosse.incontro(g1.mossa, g2.mossa);	
			}
			
			else
			{
				System.out.println("Non è possibile effettuare un incontro con questa mossa");
			}
		}
}

