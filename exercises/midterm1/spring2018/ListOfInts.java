package spring2018;

//7. The Downside of Default. Consider the ListOfInts interface below. addLast, get, and size
//behave exactly as your Deque interface from project 1A. set(int i, int value) sets the ith integer
//in the list equal to value. plusEquals adds each int in x to the corresponding int in the current list, i.e. if
//we call have a list L = [2, 3, 4] and we call L.plusEquals([5, 6, 7]), then after the call is complete,
//L will contain the values [7, 9, 11]. If the lists are not of the same length, plusEquals should have no
//effect.
//a) (6 points). Fill in the plusEquals method below.
public interface ListOfInts {
    public void addLast(int i);
    public int get(int i);
    public int size();
    public void set(int i, int value);
    default public void plusEquals(ListOfInts x) { // assume x is non-null
        if (x.size() != size()){ return; }
        for (int i = 0; i < size(); i += 1) {
            this.set(i, get(i) + x.get(i));
        }
    }
}
