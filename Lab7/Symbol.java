package Lab7;

public enum Symbol {
    ROCK, PAPER, SCISSORS;
    /**
     * @param s
     * @return
     */
    public GameResult getResult(Symbol s){
        if (this == s) return GameResult.DRAW;

        if(this == ROCK){
            return (s ==SCISSORS) ? GameResult.WIN : GameResult.LOSE;
        }else if(this == SCISSORS){
            return (s == PAPER) ? GameResult.WIN : GameResult.LOSE;
        }else if(this == PAPER){
             return (s == ROCK) ? GameResult.WIN : GameResult.LOSE;
        } else{
            return null;
        }
    }
}
