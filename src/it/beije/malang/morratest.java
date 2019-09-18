package it.beije.malang;

public class morratest {

	public static void main(String[] args) {
		Morra_Cinese[] players=new Morra_Cinese[2];
		for (int i=0;i<players.length;i++)
		{
			if (args[i].toLowerCase().equals(Morra_Cinese.CARTA.toString().toLowerCase()))
			{	
				players[i]=Morra_Cinese.CARTA;
			}
			else if (args[i].toLowerCase().equals(Morra_Cinese.FORBICE.toString().toLowerCase()))
			{
				players[i]=Morra_Cinese.FORBICE;
			}
			else if (args[i].toLowerCase().equals(Morra_Cinese.SASSO.toString().toLowerCase()))
				players[i]=Morra_Cinese.SASSO;
				
		}
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(Morra_Cinese.CARTA.toString());
		Morra morra=new Morra(players[0],players[1]);
		System.out.println(morra.getResult());
	}

}
