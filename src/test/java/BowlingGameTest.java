import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    public void should_get_sum_when_getlinescore_given_without_strike_and_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        Assertions.assertEquals(50, bowlingGame.getLineScore("5-4|5-4|5-4|5-4|5-4|5-4|5-4|5-4|5-4|5-4"));
    }
    @Test
    public void should_get_sum_when_getlinescore_given_all_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        Assertions.assertEquals(300, bowlingGame.getLineScore("A|A|A|A|A|A|A|A|A|A|A"));
    }
    @Test
    public void should_get_150_when_getlinescore_given_all_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        Assertions.assertEquals(150, bowlingGame.getLineScore("5-5|5-5|5-5|5-5|5-5|5-5|5-5|5-5|5-5|5-5|5"));
    }
    @Test
    public void should_sum_when_getlinescore_given_type_mixed() {
        BowlingGame bowlingGame = new BowlingGame();
        Assertions.assertEquals(254, bowlingGame.getLineScore("A|A|A|A|A|A|A|A|5-5|5-4"));
    }
}
