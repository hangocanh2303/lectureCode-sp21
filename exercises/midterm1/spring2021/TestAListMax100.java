package spring2021;

//c) (80 Points) Below, write a JUnit test that fails because of the bug. You may use a maximum of 10 lines.
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAListMax100 {
    @Test
    public void test() {
        AListMax100<Integer> a1 = new AListMax100<>();
        for (int i = 0; i < 99; i += 1) {
            a1.addLast(i);
        }
        AListMax100<Integer> a2 = new AListMax100<>();
        a2.addLast(99);
        a2.addLast(100);
        assertEquals(100, (long) a2.getLast());
    }
}