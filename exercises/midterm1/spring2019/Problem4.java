package spring2019;
import org.junit.Test;
import static org.junit.Assert.*;


public class Problem4 {

//4. a) More JUnit (10 points). Suppose we add a method equalLists to our AList class with the
//signature below. This method returns true if the given List61B has all the same items as the current
//AList in the same order. Your midterm 1 reference sheet might be useful for this problem.
//public boolean equalLists(List61B<T> otherList)
//Write a JUnit test that verifies that this method correctly returns true when called with an SLList as an
//argument. Your lists should be of length 3. Assume all JUnit classes needed have been imported.
    @Test
    public void testAListEqualToSLListOFLength3() {
        SLList<Integer> sll = new SLList<>();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);

        AList<Integer> all = new AList<>();
        all.addLast(1);
        all.addLast(2);
        all.addLast(3);

        assertTrue(all.equalLists(sll));

    }

}

//b) (25 points) Write the method equalLists. It should work for all possible inputs, not just your
//JUnit test above. Your method must be non-destructive. You may not need all lines.
//public class AList<T> { ...
// public boolean equalLists(List61B<T> otherList) {
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// __________________________________________
// }