package it.beije.malang.morra;

public class Mosse {
		final static String forb = "forbice";
		final static String sass = "sasso";
		final static String cart = "carta";
		static boolean valido=true;
		
		public static String mossa_Valida(String mossa){
			String mossaNonValida="La mossa non e' valida!";
			
			if (mossa.equalsIgnoreCase(forb))
			{
				return mossa;
			}
			else if(mossa.equalsIgnoreCase(sass))
			{
				return mossa;
			}
			else if(mossa.equalsIgnoreCase(cart))
			{
				return mossa;
			}
			else
			{
				valido=false;
				System.out.println("Mossa non valida!");
				return mossaNonValida;
			}
		}
		
		public static void incontro(String mossa, String mossa2){
			
			if ((mossa.equalsIgnoreCase(sass) && mossa2.equalsIgnoreCase(sass))||(mossa.equalsIgnoreCase(forb) && mossa2.equalsIgnoreCase(forb)) || (mossa.equalsIgnoreCase(cart) && mossa2.equalsIgnoreCase(cart)))
			{
				System.out.println("Pareggio");
			}
			else if (mossa.equalsIgnoreCase(sass) && mossa2.equalsIgnoreCase(forb))
			{
				System.out.println("Vince il giocatore uno");
			}
			else if (mossa2.equalsIgnoreCase(sass) && mossa.equalsIgnoreCase(forb))
			{
				System.out.println("Vince il giocatore due");
			}
			else if (mossa.equalsIgnoreCase(cart) && mossa2.equalsIgnoreCase(sass))
			{
				System.out.println("Vince il giocatore uno");
			}
			else if (mossa2.equalsIgnoreCase(cart) && mossa.equalsIgnoreCase(sass))
			{
				System.out.println("Vince il giocatore due");
			}
			else if (mossa.equalsIgnoreCase(forb) && mossa2.equalsIgnoreCase(cart))
			{
				System.out.println("Vince il giocatore uno");
			}
			else if (mossa2.equalsIgnoreCase(cart) && mossa.equalsIgnoreCase(forb))
			{
				System.out.println("Vince il giocatore due");
			}
			else
			{}
		}
}
