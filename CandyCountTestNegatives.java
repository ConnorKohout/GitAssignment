import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CandyCountTestNegatives {

    @Test
    public void testNegativeValues() {
        CandyCount candyCounter = new CandyCount();
        candyCounter.setBlueCandies(-10);
        candyCounter.setRedCandies(-5);
        candyCounter.setGreenCandies(-8);

        int actualTotal = candyCounter.calculateTotalCandies();

        assertTrue(actualTotal >= 0);
    }
}
