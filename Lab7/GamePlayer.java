package Lab7;
import java.util.Random;

public class GamePlayer{
    public Random rand = new Random();
   
    public Symbol getSymbol(){
        return Symbol.values()[rand.nextInt(Symbol.values().length)];
    }
}