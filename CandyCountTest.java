import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CandyCountTest {

    @Test
    public void testTotalCandies() {
        CandyCount candyCounter = new CandyCount();
        int expectedTotal = 296;

        int actualTotal = candyCounter.calculateTotalCandies();

        assertEquals(expectedTotal, actualTotal);
    }
}