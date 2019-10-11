package it.beije.malang.CORBOSIERO.esercizi;

import java.util.Scanner;

public class Morra {

    public static Player morra(Player p1, Player p2){
        if (p1.equals(p2))
            return null;

        else if(p1.getMove().beats(p2.getMove())) {
            return p1;
        }
        else
            return p2;
    }

    public static void main(String[] args){
        Player p1 = new Player("Corbo");
        Player p2 = new Player();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(p1.getName() + " move : ");
            p1.setMove(MorraMoves.parseMove(scanner.nextLine()));

            System.out.println(p2.getName() + " move : ");
            p2.setMove(MorraMoves.parseMove(scanner.nextLine()));
            
            scanner.close();
        }
        catch(Exception ex){
            System.out.println("Mossa non valida");
            scanner.close();
            System.exit(0);
        }

        Player winner = morra(p1, p2);

        if(winner == null)
            System.out.println("Tie");
        else
            System.out.println("Winner : " + winner.getName());
    }

}
