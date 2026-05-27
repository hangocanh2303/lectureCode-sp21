package spring2018;

import org.junit.Test;
import static org.junit.Assert.*;


public class CombineTest {
    @Test
    public void combineTest() {
        int[] x = new int[] {1, 2, 3, 4};
        Add addFunc = new Add();
        int expected = 10;
        int actual = Combine.combine(addFunc, x);
        assertEquals(expected, actual);
    }
}
