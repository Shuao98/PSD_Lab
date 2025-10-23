package Lab7;
    // Some possible tests for symbols and game results
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class RPSTesting {

    @Test
    public void testRock() {
        Assert.assertEquals("Rock should beat scissors",
                GameResult.WIN, Symbol.ROCK.getResult(Symbol.SCISSORS));
        Assert.assertEquals("Rock should lose to paper",
                GameResult.LOSE, Symbol.ROCK.getResult(Symbol.PAPER));
    }

    @Test
    public void testPaper() {
        Assert.assertEquals("Paper should beat rock",
                GameResult.WIN, Symbol.PAPER.getResult(Symbol.ROCK));
        Assert.assertEquals("Paper should lose to scissors",
                GameResult.LOSE, Symbol.PAPER.getResult(Symbol.SCISSORS));
    }

    @Test
    public void testScissors() {
        Assert.assertEquals("Scissors should beat paper",
                GameResult.WIN, Symbol.PAPER.getResult(Symbol.ROCK));
        Assert.assertEquals("Scissors should lose to rock",
                GameResult.LOSE, Symbol.PAPER.getResult(Symbol.ROCK));
    }

@Test
public void testEqual() {
for (Symbol s : Symbol.values()) {
Assert.assertEquals("An object should always draw
with itself", GameResult.DRAW, s.getResult(s));
}
}
}
}
