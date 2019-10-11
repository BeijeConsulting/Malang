package it.beije.malang.CORBOSIERO.esercizi;

public class Player {

    private String name;
    private int wonGames;
    private MorraMoves move;
    private static int numPlayers = 0;

    public Player(String name, MorraMoves move){
        this.name = name;
        this.move = move;
        this.wonGames = 0;
    }

    public Player(String name){
        this(name, MorraMoves.UNDEFINED);
    }

    public Player(){
        this("Player" + ++numPlayers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWonGames() {
        return wonGames;
    }

    public MorraMoves getMove() {
        return move;
    }

    public void setMove(MorraMoves move) {
        this.move = move;
    }
}
