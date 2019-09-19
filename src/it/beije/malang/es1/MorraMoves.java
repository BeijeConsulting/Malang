package it.beije.malang.es1;

public enum MorraMoves {
    UNDEFINED {
        @Override
        public boolean beats(MorraMoves move){
            return false;
        }
    },
    ROCK {
        @Override
        public boolean beats(MorraMoves move){
            return move == SCISSOR;
        }
    },
    PAPER {
        @Override
        public boolean beats(MorraMoves move){
            return move == ROCK;
        }
    },
    SCISSOR {
        @Override
        public boolean beats(MorraMoves move){
            return move == PAPER;
        }
    };

    public static MorraMoves parseMove(String move) throws Exception{
        MorraMoves m;

        switch (move.toLowerCase().trim()){
            case "rock":
                m = ROCK;
                break;

            case "paper":
                m = PAPER;
                break;

            case "scissor":
                m = SCISSOR;
                break;

            default:
                m = UNDEFINED;
                throw new Exception();
        }

        return m;
    }

    public abstract boolean beats(MorraMoves other);
}
